package servicetest;

import daotest.DaoTest;
import model.demo.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
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
