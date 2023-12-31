package com.restaurant.reservation.system.moodles.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);

    private Long id;

    @Column(name = "first_name")
    private String firsName;

    @Column(name = "last_name");
    private String lastName;

    @Column(name = "phone_number");
    private String phoneNumber;

    public String getFirstName() {
    }
}
