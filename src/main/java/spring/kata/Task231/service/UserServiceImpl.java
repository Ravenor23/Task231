package spring.kata.Task231.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.kata.Task231.dao.UserDao;
import spring.kata.Task231.dao.UserDaoImpl;
import spring.kata.Task231.model.User;
import spring.kata.Task231.repo.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl {
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {}

    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Transactional
    public User getUserById(Long id) {
        return userDao.getById(id);
    }

    @Transactional
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    @Transactional
    public List<User> getAllUser()  {
        return userDao.getAllUser();
    }

    @Transactional
    public void updateUser(Long id, User user) {
        userDao.edit(id, user);
    }
}
