package com.api.flightreservation.controllers;

import com.api.flightreservation.entities.FindFlight;
import com.api.flightreservation.entities.Flight;
import com.api.flightreservation.repos.FlightRepository;
import com.api.flightreservation.services.FlightService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class FlightController {
    @Autowired
    private FlightService flightService;
    @Autowired
    private FlightRepository flightRepository;
    @PostMapping("/admin/addFlight")
    public ResponseEntity<Flight> addFlight(@Valid @RequestBody Flight flight){
        return new ResponseEntity<Flight>(flightService.saveFlight(flight), HttpStatus.OK);
    }
    @PostMapping("/findFlights")
    public List <Flight> findFlight(@Valid @RequestBody FindFlight findflight){
        String departureCity = findflight.getDepartureCity();
        String arrivalCity = findflight.getArrivalCity();
        Date dateOfDeparture = findflight.getDateOfDeparture();
        return flightService.getFlight(departureCity,arrivalCity,dateOfDeparture);
    }
}
