package com.ironhack.medicineproject.repository;

import com.ironhack.medicineproject.model.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository <PatientModel,Long> {

    PatientModel findByUsernameIgnoreCase(String username);

}
