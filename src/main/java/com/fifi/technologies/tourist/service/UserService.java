package com.fifi.technologies.tourist.service;

import com.fifi.technologies.tourist.exception.UserAlreadyExistsException;
import com.fifi.technologies.tourist.model.User;
import com.fifi.technologies.tourist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        try {
            return userRepository.save(user);
        } catch (DataIntegrityViolationException e) {
            throw new UserAlreadyExistsException("User with entered email or username already exists");
        }
    }
}
