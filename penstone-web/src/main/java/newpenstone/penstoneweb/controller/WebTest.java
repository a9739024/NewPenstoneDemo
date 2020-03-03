package newpenstone.penstoneweb.controller;

import model.demo.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import servicetest.ServiceTest;

import java.util.Optional;


@RestController
@RequestMapping("test")
public class WebTest {

    @Autowired
    ServiceTest serviceTest;

    @RequestMapping("showAll")
    public String showAll(){
        return serviceTest.showService()+"I'm Web";
    }

    @RequestMapping("findData")
    public String findData(){
        Optional<DemoModel> optionalDemoModel = serviceTest.findDataInDB();
        System.out.println("印出參數:"+optionalDemoModel.toString());
        DemoModel demoModel = optionalDemoModel.get();
        return demoModel.toString();
    }
}
