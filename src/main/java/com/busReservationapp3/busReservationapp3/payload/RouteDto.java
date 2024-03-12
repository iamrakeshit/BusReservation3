package com.busReservationapp3.busReservationapp3.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteDto {
    private long routeId;
    private String fromLocation;
    private String toLocation;
    private Date fromDate;
    private Date toDate;
    private int totalDuration;
    private String fromTime;
    private String toTime;
    private List<SubRouteDto> subRoutes;
}
