//package com.example.carrentalsystem.controller;
//
//import com.example.carrentalsystem.model.Booking;
//import com.example.carrentalsystem.model.User;
//import com.example.carrentalsystem.service.BookingService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@RestController
//@RequestMapping("/bookings")
//@RequiredArgsConstructor
//public class BookingController {
//    private final BookingService bookingService;
//
//    @PostMapping
//    public ResponseEntity<String> bookCar(@RequestBody BookingRequest bookingRequest) {
//        bookingService.createBooking(bookingRequest);
//        return ResponseEntity.ok("Booking created successfully!");
//    }
//
//    @GetMapping("/user/{userId}")
//    public ResponseEntity<List<Booking>> getUserBookings(@PathVariable Long userId) {
//        List<Booking> bookings = bookingService.getUserBookings(userId);
//        return ResponseEntity.ok(bookings);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Booking>> getAllBookings() {
//        List<Booking> bookings = bookingService.getAllBookings();
//        return ResponseEntity.ok(bookings);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> cancelBooking(@PathVariable Long id) {
//        bookingService.cancelBooking(id);
//        return ResponseEntity.ok("Booking canceled and car is now available.");
//    }
//}
//
