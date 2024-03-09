package com.busReservationapp3.busReservationapp3.controller;

import com.busReservationapp3.busReservationapp3.payload.BusDto;
import com.busReservationapp3.busReservationapp3.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//      http://localhost:8080/api/v2/busControl
@RestController
@RequestMapping("api/v2/busControl")
public class BusController {

    @Autowired
    private BusService busService;
    //      http://localhost:8080/api/v2/busControl
    @PostMapping("/bus")
    public ResponseEntity<BusDto> addBus(@RequestBody BusDto busDto) {
        BusDto dto = busService.addBus(busDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
