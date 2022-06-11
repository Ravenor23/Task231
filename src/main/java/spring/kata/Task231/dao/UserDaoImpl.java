package spring.kata.Task231.dao;
import org.springframework.stereotype.Repository;
import spring.kata.Task231.model.User;

import javax.persistence.*;
import java.util.List;

@Repository
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
        em.remove(getById(id));
    }

    @Override
    public List<User> getAllUser() {
        Query query = em.createQuery("from User as u");
        return query.getResultList();
    }

    @Override
    public User getById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void edit(User user) {
        em.merge(user);
    }


}
