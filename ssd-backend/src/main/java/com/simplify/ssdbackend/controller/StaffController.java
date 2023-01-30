package com.simplify.ssdbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.simplify.ssdbackend.exception.IDNotFoundException;
import com.simplify.ssdbackend.model.Staff;
import com.simplify.ssdbackend.repository.StaffRepository;

@RestController
public class StaffController {
    @Autowired
    private StaffRepository staffRepository;
    
    @GetMapping("/api/staff")
    List<Staff> getStaff(){
        return staffRepository.findAll();
    }

    @PostMapping("/api/staff")
    Staff createStaff(@RequestBody Staff staff){
        return staffRepository.save(staff);
    }

    @PutMapping("/api/staff/{id}")
    Staff updateStaff(@RequestBody Staff staff, @PathVariable Long id){
        return staffRepository.findById(id).map((s) -> {
            s.setUsername(staff.getUsername());
            s.setPassword(staff.getPassword());
            return staffRepository.save(s);
        }).orElseThrow(() -> new IDNotFoundException(id));
    }
    
}
