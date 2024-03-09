package com.busReservationapp3.busReservationapp3.repository;

import com.busReservationapp3.busReservationapp3.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
