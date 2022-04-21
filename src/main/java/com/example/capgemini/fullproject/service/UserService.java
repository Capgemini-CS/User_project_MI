package com.example.capgemini.fullproject.service;

import com.example.capgemini.fullproject.entity.User;
import com.example.capgemini.fullproject.entity.dto.UserDTO;
import com.example.capgemini.fullproject.entity.mapper.UserMapper;
import com.example.capgemini.fullproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO addUser(UserDTO userDto) {
        User user = userRepository.save(UserMapper.toUser(userDto));
        return UserMapper.toUserDTO(user);
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream().map(UserMapper::toUserDTO).collect(Collectors.toList());
    }
}
