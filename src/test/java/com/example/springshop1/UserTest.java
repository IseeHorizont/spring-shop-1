package com.example.springshop1;

import com.example.springshop1.entity.User;
import com.example.springshop1.entity.repository.UserRepository;
import com.example.springshop1.service.CartService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.UUID;

@SpringBootTest
public class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Test
    public void saveUserAndFindUserById() {

        var testUser = new User();
        UUID testNumber = UUID.randomUUID();
        testUser.setId(testNumber);
        testUser.setLogin("123");
        testUser.setPassword("123");
        testUser.setRole("CUSTOMER");
        testUser.setName("Name");
        testUser.setLastName("LastName");
        testUser.setSecondName("SecondName");
        testUser.setPhone("123456789");
        testUser.setEmail("testEmail");
        userRepository.save(testUser);

        Assertions.assertNotNull(userRepository.findById(testNumber));
        Assertions.assertSame(testUser, userRepository.findById(testNumber));
    }


}
