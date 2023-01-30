package com.simplify.ssdbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.simplify.ssdbackend.exception.IDNotFoundException;
import com.simplify.ssdbackend.model.Individual;
import com.simplify.ssdbackend.repository.IndividualRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class IndividualController {
    @Autowired
    private IndividualRepository individualRepository;

    @PostMapping("/api/individual")
    Individual createIndividual(@RequestBody Individual individual){
        return individualRepository.save(individual);
    }

    @GetMapping("/api/individual")
    List<Individual> getAllIndividuals(){
        return individualRepository.findAll();
    }

    @PutMapping("/api/individual/{id}")
    Individual updateIndividual(@PathVariable Long id, @RequestBody Individual individual){
        return individualRepository.findById(id).map((ind) -> { 
            ind.setFirstName(individual.getFirstName());
            ind.setLastName(individual.getLastName());
            return individualRepository.save(ind);
        }
        ).orElseThrow(() -> new IDNotFoundException(id));
    }   
}
