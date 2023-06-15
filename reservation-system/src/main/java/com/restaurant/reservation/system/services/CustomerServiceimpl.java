package com.restaurant.reservation.system.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restaurant.reservation.system.moodles.dtos.CustomerDTO;
import com.restaurant.reservation.system.moodles.entities.Customer;
import com.restaurant.reservation.system.repositories.CustommerRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private final ObjectMapper objectMapper;
    private final CustommerRepository custommerRepository;

    @Autowired
    public CustomerServiceImpl(ObjectMapper objectMapper,
                               CustommerRepository custommerRepository) {
        this.objectMapper = objectMapper;
        this.custommerRepository = custommerRepository;
    }

    @Transactional
    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        Customer customer = objectMapper.convertValue(customerDTO, Customer.class);
        Customer savedCustomer = custommerRepository.save(customer);
        log.info("Customer" + savedCustomer.getFirsName() + " was created.");
        return objectMapper.convertValue(savedCustomer, CustomerDTO.class);
    }
}
