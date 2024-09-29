package com.gharseva.HomeCareServiceApplication.Patient.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gharseva.HomeCareServiceApplication.Patient.Entity.Patient;

public interface  PatientRepository extends JpaRepository<Patient, Long>{

}
