/*
 * package com.example.carrentalsystem.service;
 * 
 * import com.example.carrentalsystem.model.Booking; import
 * com.example.carrentalsystem.model.Car; import
 * com.example.carrentalsystem.model.User; import
 * com.example.carrentalsystem.repository.BookingRepository; import
 * com.example.carrentalsystem.repository.CarRepository; import
 * com.example.carrentalsystem.service.EmailService; import
 * lombok.RequiredArgsConstructor; import
 * org.springframework.security.core.context.SecurityContextHolder; import
 * org.springframework.stereotype.Service;
 * 
 * import java.util.List;
 * 
 * @Service
 * 
 * @RequiredArgsConstructor public class BookingService {
 * 
 * private final BookingRepository bookingRepository; private final
 * CarRepository carRepository; private final EmailService emailService;
 * 
 * public List<Booking> getAllBookings() { return bookingRepository.findAll(); }
 * 
 * public List<Booking> getUserBookings() { String email =
 * SecurityContextHolder.getContext().getAuthentication().getName(); return
 * bookingRepository.findByUser_Email(email); }
 * 
 * public Booking createBooking(Booking booking) { Car car =
 * carRepository.findById(booking.getCar().getId()) .orElseThrow(() -> new
 * IllegalArgumentException("Car not found")); if
 * (!"Available".equals(car.getAvailabilityStatus())) { throw new
 * IllegalArgumentException("Car is not available for booking"); }
 * car.setAvailabilityStatus("Unavailable"); carRepository.save(car);
 * 
 * Booking savedBooking = bookingRepository.save(booking);
 * sendBookingConfirmationEmail(savedBooking.getUser(), savedBooking); return
 * savedBooking; }
 * 
 * public void cancelBooking(Long bookingId) { Booking booking =
 * bookingRepository.findById(bookingId) .orElseThrow(() -> new
 * IllegalArgumentException("Booking not found"));
 * 
 * Car car = booking.getCar(); car.setAvailabilityStatus("Available");
 * carRepository.save(car);
 * 
 * booking.setStatus("Cancelled"); bookingRepository.save(booking);
 * 
 * sendBookingCancellationEmail(booking.getUser(), booking); }
 * 
 * private void sendBookingConfirmationEmail(User user, Booking booking) {
 * String subject = "Booking Confirmation"; String message = String.format(
 * "Hello %s,\n\nYour booking for the car %s %s has been confirmed. Details:\n\n"
 * +
 * "Booking ID: %d\nStart Date: %s\nEnd Date: %s\n\nThank you for choosing our service!"
 * , user.getName(), booking.getCar().getMake(), booking.getCar().getModel(),
 * booking.getId(), booking.getStartDate(), booking.getEndDate() );
 * emailService.sendEmail(user.getEmail(), subject, message); }
 * 
 * private void sendBookingCancellationEmail(User user, Booking booking) {
 * String subject = "Booking Cancellation Confirmation"; String message =
 * String.format(
 * "Hello %s,\n\nYour booking for the car %s %s has been cancelled. Details:\n\n"
 * +
 * "Booking ID: %d\nStart Date: %s\nEnd Date: %s\n\nIf you have any questions, please contact support.\n\nThank you."
 * , user.getName(), booking.getCar().getMake(), booking.getCar().getModel(),
 * booking.getId(), booking.getStartDate(), booking.getEndDate() );
 * emailService.sendEmail(user.getEmail(), subject, message); } }
 */