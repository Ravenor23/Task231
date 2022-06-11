package spring.kata.Task231.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.kata.Task231.dao.UserDaoImpl;
import spring.kata.Task231.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDaoImpl userDao;

    @Autowired
    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {}

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    @Override
    @Transactional
    public List<User> getAllUser()  {
        return userDao.getAllUser();
    }

    @Override
    @Transactional
    public void edit(User user) {
        userDao.edit(user);
    }
}
