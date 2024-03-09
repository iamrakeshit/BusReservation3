package com.busReservationapp3.busReservationapp3.service.Impl;

import com.busReservationapp3.busReservationapp3.entity.Bus;
import com.busReservationapp3.busReservationapp3.payload.BusDto;
import com.busReservationapp3.busReservationapp3.repository.BusRepository;
import com.busReservationapp3.busReservationapp3.repository.DriverRepository;
import com.busReservationapp3.busReservationapp3.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private BusRepository busRepository;
    @Autowired
    private DriverRepository driverRepository;

    @Override
    public BusDto addBus(BusDto busDto) {
        Bus bus = mapToEntity(busDto);
        driverRepository.save(busDto.getDriver());
        Bus savedBus = busRepository.save(bus);
        BusDto dto = mapToDto(savedBus);
        return dto;
    }

    Bus mapToEntity(BusDto busDto){
        Bus bus = new Bus();
        bus.setBusNumber(busDto.getBusNumber());
        bus.setBusType(busDto.getBusType());
        bus.setFromDestination(busDto.getFromDestination());
        bus.setToDestination(busDto.getToDestination());
        bus.setFromDate(busDto.getFromDate());
        bus.setToDate(busDto.getToDate());
        bus.setTotalDuration(busDto.getTotalDuration());
        bus.setFromTime(busDto.getFromTime());
        bus.setToTime(busDto.getToTime());
        bus.setPrice(busDto.getPrice());
        bus.setTotalSeats(busDto.getTotalSeats());
        bus.setAvailableSeats(busDto.getAvailableSeats());
        bus.setDriver(busDto.getDriver());
        return bus;
    }
    BusDto mapToDto(Bus bus){
        BusDto dto = new BusDto();
        dto.setBusId(bus.getBusId());
        dto.setBusNumber(bus.getBusNumber());
        dto.setBusType(bus.getBusType());
        dto.setFromDestination(bus.getFromDestination());
        dto.setToDestination(bus.getToDestination());
        dto.setFromDate(bus.getFromDate());
        dto.setToDate(bus.getToDate());
        dto.setTotalDuration(bus.getTotalDuration());
        dto.setFromTime(bus.getFromTime());
        dto.setToTime(bus.getToTime());
        dto.setPrice(bus.getPrice());
        dto.setTotalSeats(bus.getTotalSeats());
        dto.setAvailableSeats(bus.getAvailableSeats());
        dto.setDriver(bus.getDriver());
        return dto;
    }
}