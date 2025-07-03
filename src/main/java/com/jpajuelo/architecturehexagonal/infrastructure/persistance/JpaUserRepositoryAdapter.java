package com.jpajuelo.architecturehexagonal.infrastructure.persistance;

import com.jpajuelo.architecturehexagonal.application.port.out.UserRepositoryPort;
import com.jpajuelo.architecturehexagonal.domain.model.User;
import com.jpajuelo.architecturehexagonal.domain.model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserRepositoryAdapter implements UserRepositoryPort {

    private final SpringDataUserRepository userRepository;
    @Autowired
    public JpaUserRepositoryAdapter(SpringDataUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = UserMapper.toEntity(user);
        userRepository.save(userEntity);
        return UserMapper.toDomain(userEntity);
    }
}
