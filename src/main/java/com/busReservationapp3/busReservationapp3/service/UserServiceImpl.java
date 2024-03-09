package com.busReservationapp3.busReservationapp3.service;

import com.busReservationapp3.busReservationapp3.entity.UserRegistration;
import com.busReservationapp3.busReservationapp3.payload.UserRegistrationDto;
import com.busReservationapp3.busReservationapp3.repository.UserRegistrtionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRegistrtionRepository userRepository;

    public UserRegistrationDto createUser(UserRegistration userRegistration){
        UserRegistration save = userRepository.save(userRegistration);
        return null;
    }

    public UserRegistration getUserById(long id){
        return userRepository.findById(id).get();

    }
}
