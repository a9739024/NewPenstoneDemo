package newpenstone.penstoneweb.dao.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DemoRespoitory extends JpaRepository<DemoModel,String> {

    @Query(value = "SELECT d.id,d.name FROM demo d where d.id=?1", nativeQuery = true)
    Optional<DemoModel> findById(String spId);
}
