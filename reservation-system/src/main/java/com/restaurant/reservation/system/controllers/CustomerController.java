package com.restaurant.reservation.system.controllers;


import com.restaurant.reservation.system.moodles.entities.Customer;
import com.restaurant.reservation.system.services.CustomerDTO;
import com.restaurant.reservation.system.services.CustomerServiceimcl;
import com.restaurant.reservation.system.services.CustommerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustommerService custommerService) {
        this.customerService = custommerService;

    }

    @PostMapping
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerDTO) {
        return ResponseEntity.ok(customerService.createCustomer(customerDTO));
    }
}
