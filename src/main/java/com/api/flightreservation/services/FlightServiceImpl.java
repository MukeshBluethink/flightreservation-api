package com.api.flightreservation.services;

import com.api.flightreservation.entities.Flight;
import com.api.flightreservation.repos.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService{
    @Autowired
    private FlightRepository flightRepository;
    @Override
    public Flight saveFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public List<Flight> getFlight(String departureCity, String arrivalCity, Date dateOfDeparture) {
        return flightRepository.findFlight(departureCity,arrivalCity,dateOfDeparture);
    }

    @Override
    public Optional<Flight> getFlightById(Long flightId) {
        return flightRepository.findById(flightId);
    }
}
