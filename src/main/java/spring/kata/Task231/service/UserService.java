package spring.kata.Task231.service;

import spring.kata.Task231.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    void saveUser(User user);
    void deleteUser(Long id);
    void edit(User user);
    User getById(Long id);

}
