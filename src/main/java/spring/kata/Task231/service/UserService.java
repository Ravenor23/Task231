package spring.kata.Task231.service;

import spring.kata.Task231.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    void saveUser(User film);
    void deleteUser(Long id);
    void edit(Long id, User film);
    User getById(Long id);

}
