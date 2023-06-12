package com.restaurant.reservation.system.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restaurant.reservation.system.moodles.dtos.CustomerDTO;
import com.restaurant.reservation.system.moodles.entities.Customer;
import com.restaurant.reservation.system.repositories.CustommerRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class CustomerServiceimcl implements CustommerService{

    private final ObjectMapper objectMapper;
    private CustommerRepository custommerRepository;

    @Autowired
    public CustommerServiceImpl(ObjectMapper objectMapper,
                                CustommerService custommerService) {
        this.objectMapper = objectMapper;
        this.custommerRepository = custommerRepository;

    }
    @Transactional
    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        //ObjectMapper objectMapper;
        Customer customer = objectMapper.convertValue(customerDTO, Customer.class);
        LogManager customerRepository;
        Customer savedCustomer = customerRepository.save(customer);
        log.info("Customer" + savedCustomer.getFirstName() + "was created.");
        return ObjectMapper.convertValue(savedCustomer, CustomerDTO.class);
    }
}
