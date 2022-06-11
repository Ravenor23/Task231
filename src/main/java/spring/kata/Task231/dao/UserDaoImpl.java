package spring.kata.Task231.dao;
import org.springframework.stereotype.Component;
import spring.kata.Task231.model.User;

import javax.persistence.*;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;
    public UserDaoImpl() {}

    @Override
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    public void deleteUser(Long id) {
        Query query = em.createQuery("delete from User u where u.id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public List<User> getAllUser()  {
        Query query = em.createQuery("select User from User");
        return query.getResultList();
    }

    @Override
    public User getById(Long id) {
        Query query = em.createQuery("select User as u from User where u.id = :id");
        query.setParameter("id", id);
        return ((User) query.getSingleResult());
    }

    @Override
    public void edit(Long id, User user) {
        Query query = em.createQuery("update User as u set u.name = :name, u.lastname = :lastname, u.age = :age where u.id = :id");
        query.setParameter("id", id);
        query.setParameter("name", user.getName());
        query.setParameter("lastname", user.getLastname());
        query.setParameter("age", user.getAge());
        query.executeUpdate();
    }


}
