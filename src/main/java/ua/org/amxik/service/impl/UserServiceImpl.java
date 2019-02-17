package ua.org.amxik.service.impl;

import org.springframework.stereotype.Service;
import ua.org.amxik.models.UserEntity;
import ua.org.amxik.repositories.UserRepository;
import ua.org.amxik.service.UserService;

import java.util.List;

/**
 * Created by amxik on 17.02.2019.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;


    @Override
    public UserEntity addUser(UserEntity user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserEntity getById(long id) {
        return userRepository.getOne(id);
    }

    @Override
    public UserEntity editUser(UserEntity user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }
}
