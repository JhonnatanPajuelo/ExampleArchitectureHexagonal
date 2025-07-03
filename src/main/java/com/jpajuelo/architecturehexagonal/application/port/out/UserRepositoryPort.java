package com.jpajuelo.architecturehexagonal.application.port.out;

import com.jpajuelo.architecturehexagonal.domain.model.User;

public interface UserRepositoryPort {
    User save(User user);
}