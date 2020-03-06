package newpenstone.penstoneweb.dao.demo;

import java.util.Optional;

public interface DemoServiceInterface {

    public Optional<DemoModel> getOne(String id);
}
