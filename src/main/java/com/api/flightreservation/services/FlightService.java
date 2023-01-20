package com.api.flightreservation.services;

import com.api.flightreservation.entities.Flight;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface FlightService {
    public Flight saveFlight(Flight flight);
    public List<Flight> getFlight(String departureCity, String arrivalCity, Date dateOfDeparture);
    public Optional<Flight> getFlightById(Long flightId);
}
