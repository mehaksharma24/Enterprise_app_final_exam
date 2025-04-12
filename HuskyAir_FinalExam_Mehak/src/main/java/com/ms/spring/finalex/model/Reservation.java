package com.ms.spring.finalex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reservations")
public class Reservation {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int passengers;
    private String travelClass;
    private String phone;
    private String time;
    private String departureDate;

    // Getters and Setters
}
