package com.commonwealth.test.demoregistrationlogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.commonwealth.test.demoregistrationlogin.model.User;
import com.commonwealth.test.demoregistrationlogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}