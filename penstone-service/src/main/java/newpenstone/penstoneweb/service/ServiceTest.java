package newpenstone.penstoneweb.service;

import newpenstone.penstoneweb.dao.DaoTest;
import newpenstone.penstoneweb.dao.demo.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ServiceTest {

    @Autowired
    DaoTest daoTest;

    public String showService(){
        return daoTest.showDao()+"I'm Service";
    }

    public Optional<DemoModel> findDataInDB(){
        return daoTest.getOne("1");
    }
}
