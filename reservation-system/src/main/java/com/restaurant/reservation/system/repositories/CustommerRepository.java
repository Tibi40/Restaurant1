package com.restaurant.reservation.system.repositories;

import com.restaurant.reservation.system.moodles.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustommerRepository extends JpaRepository<Customer, Long> {

}
