/*
 * package com.example.carrentalsystem.controller;
 * 
 * import com.example.carrentalsystem.model.Booking; import
 * com.example.carrentalsystem.service.BookingService; import
 * lombok.RequiredArgsConstructor; import
 * org.springframework.web.bind.annotation.*;
 * 
 * import java.util.List;
 * 
 * @RestController
 * 
 * @RequestMapping("/bookings")
 * 
 * @RequiredArgsConstructor public class BookingController {
 * 
 * private final BookingService bookingService;
 * 
 * @GetMapping public List<Booking> getAllBookings() { return
 * bookingService.getAllBookings(); };
 * 
 * @GetMapping("/user") public List<Booking> getUserBookings() { return
 * bookingService.getUserBookings(); }
 * 
 * @PostMapping public Booking createBooking(@RequestBody Booking booking) {
 * return bookingService.createBooking(booking); }
 * 
 * @DeleteMapping("/{id}") public String cancelBooking(@PathVariable Long id) {
 * bookingService.cancelBooking(id); return "Booking with ID " + id +
 * " has been cancelled successfully."; } }
 */