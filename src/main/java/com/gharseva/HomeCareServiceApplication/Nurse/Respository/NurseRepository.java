package com.gharseva.HomeCareServiceApplication.Nurse.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gharseva.HomeCareServiceApplication.Nurse.Entity.Nurse;

@Repository
public interface NurseRepository extends JpaRepository<Nurse, Long> {
    List<Nurse> findByArea(String area); // Custom query method to find nurses by area
}