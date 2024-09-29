package com.gharseva.HomeCareServiceApplication.Booking.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gharseva.HomeCareServiceApplication.Booking.Entity.Booking;
import com.gharseva.HomeCareServiceApplication.Nurse.Entity.Nurse;
import com.gharseva.HomeCareServiceApplication.Patient.Entity.Patient;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByNurse(Nurse nurse);
    List<Booking> findByPatient(Patient patient);
}
