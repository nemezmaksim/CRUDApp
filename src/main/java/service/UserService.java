package service;

import entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    void createUser(User user);
    User getById(int id);
    void updateUser(User user);
    void deleteUser(int id);
}
