package com.busReservationapp3.busReservationapp3.service;

import com.busReservationapp3.busReservationapp3.entity.Bus;
import com.busReservationapp3.busReservationapp3.entity.Route;
import com.busReservationapp3.busReservationapp3.entity.SubRoute;
import com.busReservationapp3.busReservationapp3.payload.BusDto;
import com.busReservationapp3.busReservationapp3.payload.SubRouteDto;
import com.busReservationapp3.busReservationapp3.repository.BusRepository;
import com.busReservationapp3.busReservationapp3.repository.RouteRepository;
import com.busReservationapp3.busReservationapp3.repository.SubRouteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BusService {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private SubRouteRepository subRouteRepository;

    public void addBus(BusDto busDto) {
        // Create a new Route entity and save it
        Route route = new Route();
        route.setFromLocation(busDto.getRoute().getFromLocation());
        route.setToLocation(busDto.getRoute().getToLocation());
        route.setFromDate(busDto.getRoute().getFromDate());
        route.setToDate(busDto.getRoute().getToDate());
        route.setTotalDuration(busDto.getRoute().getTotalDuration());
        route.setFromTime(busDto.getRoute().getFromTime());
        route.setToTime(busDto.getRoute().getToTime());

        // Save the route entity
        Route savedRoute = routeRepository.save(route);

        // Create a new Bus entity and associate it with the saved route
        Bus bus = new Bus();
        bus.setBusNumber(busDto.getBusNumber());
        bus.setBusType(busDto.getBusType());
        bus.setPrice(busDto.getPrice());
        bus.setTotalSeats(busDto.getTotalSeats());
        bus.setAvailableSeats(busDto.getAvailableSeats());

        bus.setRoute(route); // Associate bus with route

        // Save the bus entity
        busRepository.save(bus);

        Route routeUpdate = routeRepository.findById(savedRoute.getRouteId()).get();
        routeUpdate.setBus(bus);


        // Create SubRoutes and associate them with the saved route if present
        if (busDto.getRoute().getSubRoutes() != null && !busDto.getRoute().getSubRoutes().isEmpty()) {
            List<SubRoute> subRoutes = new ArrayList<>();
            for (SubRouteDto subRouteDto : busDto.getRoute().getSubRoutes()) {
                SubRoute subRoute = new SubRoute();
                subRoute.setFromLocation(subRouteDto.getFromLocation());
                subRoute.setToLocation(subRouteDto.getToLocation());
                subRoute.setFromDate(subRouteDto.getFromDate());
                subRoute.setToDate(subRouteDto.getToDate());
                subRoute.setTotalDuration(subRouteDto.getTotalDuration());
                subRoute.setFromTime(subRouteDto.getFromTime());
                subRoute.setToTime(subRouteDto.getToTime());
                subRoute.setRoute(savedRoute); // Associate subRoute with route
                subRoutes.add(subRoute);
            }

            // Save the SubRoutes
            subRouteRepository.saveAll(subRoutes);
        }
    }

    // Other methods for bus management can be added here
}
