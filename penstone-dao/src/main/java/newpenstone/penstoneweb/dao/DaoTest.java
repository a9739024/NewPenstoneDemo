package newpenstone.penstoneweb.dao;

import newpenstone.penstoneweb.entity.EntityTest;
import newpenstone.penstoneweb.dao.demo.DemoRespoitory;
import newpenstone.penstoneweb.dao.demo.DemoServiceInterface;
import newpenstone.penstoneweb.dao.demo.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DaoTest implements DemoServiceInterface {

    @Autowired
    DemoRespoitory demoRespoitory;

    @Autowired
    EntityTest entityTest;

    public String showDao() {
        return entityTest.showEntity()+"I'm Dao";
    }

    @Override
    public Optional<DemoModel> getOne(String id) {
        System.out.println( demoRespoitory == null);
        return demoRespoitory.findById(id);
    }
}