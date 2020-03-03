package daotest;

import entitytest.EntityTest;
import model.demo.DemoRespoitory;
import model.demo.DemoServiceInterface;
import model.demo.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DaoTest implements DemoServiceInterface {

    @Autowired
    DemoRespoitory demoRespoitory;

    public String showDao() {
        EntityTest entityTest = new EntityTest();
        return entityTest.showEntity()+"I'm Dao";
    }

    @Override
    public Optional<DemoModel> getOne(String id) {
        System.out.println( demoRespoitory == null);
        return demoRespoitory.findById(id);
    }
}