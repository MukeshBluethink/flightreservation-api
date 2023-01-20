package com.api.flightreservation.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Flight extends AbstractEntity{
    @NotBlank(message = "Please enter flight number")
    private String flightNumber;
    @NotBlank(message = "Please enter operating airlines")
    private String operatingAirLines;
    @NotBlank(message = "Please enter departure city")
    private String departureCity;
    @NotBlank(message = "Please enter arrival city")
    private String arrivalCity;
    @JsonFormat(pattern="dd-MM-yyyy")
    @NotNull(message = "Please enter date of departure")
    private Date dateOfDeparture;
    @NotNull(message = "Please enter estimated departure time")
    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private Timestamp estimatedDepartureTime;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirLines() {
        return operatingAirLines;
    }

    public void setOperatingAirLines(String operatingAirLines) {
        this.operatingAirLines = operatingAirLines;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public Date getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(Date dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public Timestamp getEstimatedDepartureTime() {
        return estimatedDepartureTime;
    }

    public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
        this.estimatedDepartureTime = estimatedDepartureTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", operatingAirLines='" + operatingAirLines + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", dateOfDeparture=" + dateOfDeparture +
                ", estimatedDepartureTime=" + estimatedDepartureTime +
                '}';
    }
}
