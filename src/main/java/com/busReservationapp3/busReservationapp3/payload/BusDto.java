package com.busReservationapp3.busReservationapp3.payload;

import com.busReservationapp3.busReservationapp3.entity.Driver;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusDto {
    private long busId;
    private String busNumber;
    private String busType;
    private String fromDestination;
    private String toDestination;
    private Date fromDate;
    private Date toDate;
    private int totalDuration;
    private String fromTime;
    private String toTime;
    private double price;
    private int totalSeats;
    private int availableSeats;
    private Driver driver;
}