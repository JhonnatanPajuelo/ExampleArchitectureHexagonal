package com.jpajuelo.architecturehexagonal.domain.service;

import com.jpajuelo.architecturehexagonal.application.port.in.UserUseCase;
import com.jpajuelo.architecturehexagonal.application.port.out.UserRepositoryPort;
import com.jpajuelo.architecturehexagonal.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserUseCase {

    private UserRepositoryPort userRepositoryPort;
    @Autowired
    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        return userRepositoryPort.save(user);
    }
}
