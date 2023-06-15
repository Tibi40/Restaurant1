package com.restaurant.reservation.system.services;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CustomerDTO {

    private Long id;

    @Column(name = "first_name")
    private String firsName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private String phoneNumber;
}
