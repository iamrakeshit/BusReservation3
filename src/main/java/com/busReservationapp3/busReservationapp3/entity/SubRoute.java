package com.busReservationapp3.busReservationapp3.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SubRoute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long subRouteId;

    private String fromLocation;
    private String toLocation;
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Temporal(TemporalType.DATE)
    private Date toDate;
    private int totalDuration;
    private String fromTime;
    private String toTime;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;
}
