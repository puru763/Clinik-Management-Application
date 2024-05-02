package com.ClinicManagementSystem.PatientManagementMicroservice.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private String doctorName;
    private String appointmentDate;
    private String appointmentTime;
    private String venue;
    private String diagnosis;

    public Long getPatientId() {
        return patient.getId();
    }
}