package learn.duke.multiple.demo.repo.user;

import learn.duke.multiple.demo.entity.user.Possession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PossessionRepository extends JpaRepository<Possession, Long> {

}
