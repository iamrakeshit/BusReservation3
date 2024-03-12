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

import java.text.ParseException;

@RestController
@RequestMapping("/api/bus")
public class BusController {
    @Autowired
    private BusService busService;

    //      http://localhost:8080/api/bus/add
    @PostMapping("/add")
    public ResponseEntity<String> addBus(@RequestBody BusDto busDto) throws ParseException {
       busService.addBus(busDto);
       return new ResponseEntity<>("Bus details added", HttpStatus.CREATED);
    }
}
// almost 50 min , subRoute is not saved 05.03.2024