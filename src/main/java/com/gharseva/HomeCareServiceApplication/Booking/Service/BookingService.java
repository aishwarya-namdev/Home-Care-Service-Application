package com.gharseva.HomeCareServiceApplication.Booking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gharseva.HomeCareServiceApplication.Booking.Entity.Booking;
import com.gharseva.HomeCareServiceApplication.Booking.Respository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    public BookingRepository bookingRepository;

    public List<Booking> getAllBooking() {
        return bookingRepository.findAll();
    }

    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id).orElseThrow(() -> new RuntimeException("Booking not found"));

    }

    public void addBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }

    public Booking updateBooking(Long id, Booking bookingDetails) {
        Booking booking = bookingRepository.findById(id).orElseThrow(() -> new RuntimeException("Booking not found"));
        booking.setServiceDate(bookingDetails.getServiceDate());
        booking.setStatus(bookingDetails.getStatus());
        return bookingRepository.save(booking);
    }

    


}
