package com.example.demo48.service;

import com.example.demo48.dao.UserRepository;
import com.example.demo48.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }
}


