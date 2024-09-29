package com.gharseva.HomeCareServiceApplication.Booking.Entity;

import java.time.LocalDateTime;

import com.gharseva.HomeCareServiceApplication.Nurse.Entity.Nurse;
import com.gharseva.HomeCareServiceApplication.Patient.Entity.Patient;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Booking {
    
    private int id;

    private Nurse nurseId;

    private Patient patients;

    private LocalDateTime serviceDate;

    private BookingStatus status;


    
}
