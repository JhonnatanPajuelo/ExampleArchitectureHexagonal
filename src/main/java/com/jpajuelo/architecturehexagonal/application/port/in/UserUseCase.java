package com.jpajuelo.architecturehexagonal.application.port.in;

import com.jpajuelo.architecturehexagonal.domain.model.User;

public interface UserUseCase {
    User createUser(User user);
}
