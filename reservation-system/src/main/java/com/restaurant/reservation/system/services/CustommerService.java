package com.restaurant.reservation.system.services;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restaurant.reservation.system.moodles.entities.Customer;
import jakarta.transaction.Transactional;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Service;

@Service
public abstract class CustommerService implements CustommerService1 {

    @Override
    public CustomerDTO createcustomer(CustomerDTO customerDTO) {

        ObjectMapper objectMapper = null;
        Customer customer = objectMapper.convertValue(customerDTO, Customer.class);
        LogManager customerRepository = null;
        Customer savedCustomer = customerRepository.save(String.valueOf(customer));
        return objectMapper.convertValue(savedCustomer, CustomerDTO.class);
    }

    @Transactional
    public abstract CustomerDTO createCustomer(CustomerDTO customerDTO);
}
