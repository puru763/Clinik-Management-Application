package com.clinickmanagementapplication.patient.repository;

import com.clinickmanagementapplication.patient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient , Long> {
<<<<<<< HEAD
    static Optional<Patient> findByMobileNumber(String mobileNumber);
=======
    static Optional<Patient> findByMobileNumber(String mobileNumber)
>>>>>>> parent of b7dbe10 (.)

}
