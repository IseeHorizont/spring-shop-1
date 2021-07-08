package com.example.springshop1.service;

import com.example.springshop1.exception.NotFoundException;
import com.example.springshop1.entity.User;
import com.example.springshop1.entity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User findById(UUID id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Пользователь с идентификатором %s не найден", id)));
    }

    public User saveUser(String phone, String login, String password, String email, String name, String secondName, String lastName) {
        var user = new User()
                .setPhone(phone)
                .setLogin(login)
                .setPassword(passwordEncoder.encode(password))
                .setEmail(email)
                .setName(name)
                .setSecondName(secondName)
                .setLastName(lastName)
                .setRole("CUSTOMER");

        return userRepository.save(user);
    }

}
