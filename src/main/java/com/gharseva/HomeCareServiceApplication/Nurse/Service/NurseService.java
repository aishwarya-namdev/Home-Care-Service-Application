package com.gharseva.HomeCareServiceApplication.Nurse.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gharseva.HomeCareServiceApplication.Nurse.Entity.Nurse;
import com.gharseva.HomeCareServiceApplication.Nurse.Respository.NurseRepository;

@Service
public class NurseService {

    @Autowired
    public NurseRepository nurseRepository;

    public List<Nurse> getAllNurses() {
        return nurseRepository.findAll();
    }

    public Nurse getNurseById(Long id) {
        return nurseRepository.findById(id).orElseThrow(() -> new RuntimeException("Nurse not found"));
    }

    public Nurse addNurse(Nurse nurse) {
        return nurseRepository.save(nurse);
    }

    public Nurse updateNurse(Long id, Nurse nurseDetails) {
        Nurse nurse = nurseRepository.findById(id).orElseThrow(() -> new RuntimeException("Nurse not found"));
        nurse.setName(nurseDetails.getName());
        nurse.setSpeciality(nurseDetails.getSpeciality());
        nurse.setAvailability(nurseDetails.isAvailability());
        nurse.setArea(nurseDetails.getArea());
        nurse.setMobileNumber(nurseDetails.getMobileNumber());
        return nurseRepository.save(nurse);
    }

    public void deleteNurse(Long id) {
        nurseRepository.deleteById(id);
    }
}

