package com.example.carrentalsystem.repository;

import com.example.carrentalsystem.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUser_EmailIgnoreCase(String email); // Ensure case insensitivity
}

