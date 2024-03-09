package com.busReservationapp3.busReservationapp3.service;

import com.busReservationapp3.busReservationapp3.payload.BusDto;
import org.springframework.stereotype.Service;

@Service
public interface BusService {
    BusDto addBus(BusDto busDto);
}
