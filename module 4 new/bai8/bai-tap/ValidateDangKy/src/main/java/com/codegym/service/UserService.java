package com.codegym.service;

import com.codegym.model.User;
import com.codegym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    public UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
