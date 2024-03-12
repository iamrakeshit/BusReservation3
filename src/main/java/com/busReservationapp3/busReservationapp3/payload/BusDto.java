package com.busReservationapp3.busReservationapp3.payload;

import com.busReservationapp3.busReservationapp3.entity.Driver;
import com.busReservationapp3.busReservationapp3.entity.SubRoute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusDto {
    private long busId;
    private String busNumber;
    private String busType;
    private double price;
    private int totalSeats;
    private int availableSeats;
    private Driver driver;
    private RouteDto route;
   // private List<SubRouteDto> subRoutes;

    // Constructor, getters, setters, etc.

//    public List<SubRouteDto> getSubRoutes() {
//        return subRoutes;
//    }
//
//    public void setSubRoutes(List<SubRouteDto> subRoutes) {
//        this.subRoutes = subRoutes;
//    }
}