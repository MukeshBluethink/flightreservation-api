package com.api.flightreservation.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

public class FindFlight {
    @NotBlank(message = "Please enter Departure City")
    private String departureCity;
    @NotBlank(message = "Please enter Arrival City")
    private String arrivalCity;
    @NotNull(message = "Please enter Departure Date")
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date dateOfDeparture;

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

    @Override
    public String toString() {
        return "Find flight{" +
                "departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", dateOfDeparture=" + dateOfDeparture +
                '}';
    }
}
