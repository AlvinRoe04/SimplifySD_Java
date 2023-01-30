package com.simplify.ssdbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simplify.ssdbackend.model.Individual;



public interface IndividualRepository extends JpaRepository<Individual, Long> {
    
}
