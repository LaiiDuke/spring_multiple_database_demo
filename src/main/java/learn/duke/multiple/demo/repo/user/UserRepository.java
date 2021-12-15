package learn.duke.multiple.demo.repo.user;

import learn.duke.multiple.demo.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
