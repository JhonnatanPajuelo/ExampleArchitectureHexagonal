package com.jpajuelo.architecturehexagonal.domain.model.mapper;

import com.jpajuelo.architecturehexagonal.domain.model.User;
import com.jpajuelo.architecturehexagonal.infrastructure.controller.response.UserResponse;
import com.jpajuelo.architecturehexagonal.infrastructure.persistance.UserEntity;

public class UserMapper {

    public static UserEntity toEntity(User user) {
        return UserEntity.builder()
                .id(user.id())
                .nombre(user.nombre())
                .apellido(user.apellido())
                .correo(user.correo())
                .build();
    }

    public static User toDomain(UserEntity entity) {
        return new User(
                entity.getId(),
                entity.getNombre(),
                entity.getApellido(),
                entity.getCorreo()
        );
    }

    public static UserResponse toResponse(User user) {
        return new UserResponse(
                user.nombre(),
                user.correo()
        );
    }
}

