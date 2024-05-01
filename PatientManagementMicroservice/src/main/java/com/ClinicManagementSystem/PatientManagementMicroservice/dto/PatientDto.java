package com.ClinicManagementSystem.PatientManagementMicroservice.dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto {
        private Long patientId;
        private String patientName;
        private String mobileNumber;
        private String email;

}