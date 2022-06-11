package spring.kata.Task231.repo;


import org.springframework.data.repository.CrudRepository;
import spring.kata.Task231.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
