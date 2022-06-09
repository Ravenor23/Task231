package spring.kata.Task231.dao;

import org.springframework.stereotype.Component;
import spring.kata.Task231.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {

    private Long idCounter = 0L;

    private List<User> userList;

    {
        userList = new ArrayList<>();
        User user1 = new User("user1", "lastname1", 12);
        user1.setId(++idCounter);
        User user2 = new User("user2", "lastname2", 13);
        user2.setId(++idCounter);

        userList.add(user1);
        userList.add(user2);
    }

    public UserDao() {}

    public void createUsersTable() {}

    public void dropUsersTable() {}

    public void saveUser(User user) {
        user.setId(++idCounter);
        userList.add(user);
    }

    public void deleteUser() {}

    public void cleanTable() {}

    public List<User> getAllUser()  {return userList;}

    public User getUserById(Long id) {return null;}

    public void updateUser(Long id, User updatedUser) {
        User user = getUserById(id);
        user.setName(updatedUser.getName());
        user.setLastname(updatedUser.getLastname());
        user.setAge(updatedUser.getAge());
    }


}
