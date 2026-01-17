package com.example.carrentalsystem.service;

import com.example.carrentalsystem.model.Booking;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;
    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    public boolean sendBookingEmail(String recipientEmail, Booking booking) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(recipientEmail);
            helper.setSubject("Booking Confirmation");
            helper.setText("Your booking is confirmed. Booking details:\n" + booking);

            mailSender.send(message);
            logger.info("Booking email sent successfully to {}", recipientEmail);
            return true;
        } catch (MessagingException ex) {
            logger.error("Failed to send booking email to {}: {}", recipientEmail, ex.getMessage());
            return false;
        }
    }

    public boolean sendCancellationEmail(String recipientEmail, Booking booking) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(recipientEmail);
            helper.setSubject("Booking Cancellation");
            helper.setText("Your booking has been canceled. Booking details:\n" + booking);

            mailSender.send(message);
            logger.info("Cancellation email sent successfully to {}", recipientEmail);
            return true;
        } catch (MessagingException ex) {
            logger.error("Failed to send cancellation email to {}: {}", recipientEmail, ex.getMessage());
            return false;
        }
    }
}
