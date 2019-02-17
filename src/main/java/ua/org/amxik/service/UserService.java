package ua.org.amxik.service;

import ua.org.amxik.models.UserEntity;

import java.util.List;

/**
 * Created by amxik on 17.02.2019.
 */
public interface UserService {

    UserEntity addUser(UserEntity user);
    void delete(long id);
    UserEntity getById(long id);
    UserEntity editUser(UserEntity user);
    List<UserEntity> getAll();


}
