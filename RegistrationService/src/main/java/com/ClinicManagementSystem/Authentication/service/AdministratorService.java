package com.ClinicManagementSystem.Authentication.service;

import com.ClinicManagementSystem.Authentication.dto.AdministratorDto;

public interface AdministratorService {
    AdministratorDto administratorsignup(AdministratorDto adminSignInRequest);
}
