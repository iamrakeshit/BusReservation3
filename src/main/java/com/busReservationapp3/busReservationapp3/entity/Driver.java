package com.busReservationapp3.busReservationapp3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long driverId;

    private String driverName;
    private String driverLicenceNumber;
    private String aadharNumber;  // Assuming aadharNumber is used instead of Address
    private String contactNumber;
    private String alternateContactNumber;
    private String emailId;
}