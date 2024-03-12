package com.busReservationapp3.busReservationapp3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long busId;
    @Column(name = "bus_number", unique = true)
    private String busNumber;
    private String busType;
    private double price;
    private int totalSeats;
    private int availableSeats;

    @OneToOne(mappedBy = "bus", cascade = CascadeType.ALL)
    private Route route;
}
