package com.restaurant.reservation.system.services;

import java.io.IOException;

public interface CustommerService1 {
    CustomerDTO createcustomer(CustomerDTO customerDTO) throws IOException;

    CustomerDTO createCustomer(CustomerDTO customerDTO);
}
