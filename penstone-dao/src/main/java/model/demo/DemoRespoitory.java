package model.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface DemoRespoitory extends JpaRepository<DemoModel,String> {

    @Query(value = "SELECT d.name FROM demo d", nativeQuery = true)
    Optional<DemoModel> findById(String spId);
}
