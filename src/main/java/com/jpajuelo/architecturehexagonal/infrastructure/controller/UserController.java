package com.jpajuelo.architecturehexagonal.infrastructure.controller;

import com.jpajuelo.architecturehexagonal.application.port.in.UserUseCase;
import com.jpajuelo.architecturehexagonal.domain.model.User;
import com.jpajuelo.architecturehexagonal.domain.model.mapper.UserMapper;
import com.jpajuelo.architecturehexagonal.domain.service.UserService;
import com.jpajuelo.architecturehexagonal.infrastructure.controller.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserUseCase userUseCase;
    @Autowired
    public UserController(UserUseCase userUseCase) {
        this.userUseCase = userUseCase;
    }

    @PostMapping
    public UserResponse createUser(@RequestBody User user) {
        User createdUser= userUseCase.createUser(user);
        return UserMapper.toResponse(createdUser);
    }



}
