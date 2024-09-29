package com.gharseva.HomeCareServiceApplication.Patient.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gharseva.HomeCareServiceApplication.Patient.Entity.Patient;
import com.gharseva.HomeCareServiceApplication.Patient.Repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    public PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElseThrow(() -> new RuntimeException("Patient Not Found!!"));

    }

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    public Patient updatePatient(Long id, Patient patientDetails) {
        Patient patient = patientRepository.findById(id).orElseThrow(() -> new RuntimeException("Patient not found"));
        patient.setName(patientDetails.getName());
        patient.setAge(patientDetails.getAge());
        patient.setMedicalNeeds(patientDetails.getMedicalNeeds());
        patient.setAddress(patientDetails.getAddress());
        patient.setMobileNumber(patientDetails.getMobileNumber());
        patient.setAlternativeMobileNumber(patientDetails.getAlternativeMobileNumber());
        return patientRepository.save(patient);
    }

}
