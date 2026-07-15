package com.aaruhi.issueflow.service.impl;

import com.aaruhi.issueflow.dto.UserRequest;
import com.aaruhi.issueflow.dto.UserResponse;
import com.aaruhi.issueflow.entity.User;
import com.aaruhi.issueflow.repository.UserRepository;
import com.aaruhi.issueflow.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse createUser(UserRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setRole(request.getRole());

        User savedUser = userRepository.save(user);

        UserResponse response = new UserResponse();

        response.setId(savedUser.getId());
        response.setName(savedUser.getName());
        response.setEmail(savedUser.getEmail());
        response.setRole(savedUser.getRole());

        return response;
    }
}