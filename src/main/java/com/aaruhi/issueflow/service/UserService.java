package com.aaruhi.issueflow.service;

import com.aaruhi.issueflow.dto.UserRequest;
import com.aaruhi.issueflow.dto.UserResponse;

public interface UserService {

    UserResponse createUser(UserRequest request);

}