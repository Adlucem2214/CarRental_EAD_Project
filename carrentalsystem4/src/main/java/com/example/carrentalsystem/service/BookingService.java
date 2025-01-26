//package com.example.carrentalsystem.service;
//
//import com.example.carrentalsystem.model.Booking;
//import com.example.carrentalsystem.model.Car;
//import com.example.carrentalsystem.model.User;
//import com.example.carrentalsystem.repository.BookingRepository;
//import com.example.carrentalsystem.repository.CarRepository;
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//
//public class BookingService {
//    private final BookingRepository bookingRepository;
//    private final CarRepository carRepository;
//
//    public void createBooking(BookingRequest request) {
//        Car car = carRepository.findById(request.getCarId())
//                .orElseThrow(() -> new RuntimeException("Car not found"));
//
//        if (!car.getAvailabilityStatus().equals("Available")) {
//            throw new RuntimeException("Car is not available for booking");
//        }
//
//        Booking booking = new Booking();
//        booking.setCar(car);
//        booking.setUser(new User(request.getUserId())); // Assuming user exists
//        booking.setStartDate(request.getStartDate());
//        booking.setEndDate(request.getEndDate());
//        booking.setTotalPrice(request.getTotalPrice());
//
//        // Update car availability
//        car.setAvailabilityStatus("Unavailable");
//        carRepository.save(car);
//
//        bookingRepository.save(booking);
//    }
//
//    public List<Booking> getUserBookings(Long userId) {
//        return bookingRepository.findByUserId(userId);
//    }
//
//    public List<Booking> getAllBookings() {
//        return bookingRepository.findAll();
//    }
//
//    public void cancelBooking(Long id) {
//        Booking booking = bookingRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Booking not found"));
//
//        // Update car availability
//        Car car = booking.getCar();
//        car.setAvailabilityStatus("Available");
//        carRepository.save(car);
//
//        bookingRepository.delete(booking);
//    }
//}
//
