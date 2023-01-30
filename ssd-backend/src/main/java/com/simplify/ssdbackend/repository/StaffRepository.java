package com.simplify.ssdbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplify.ssdbackend.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long>{
    
}
