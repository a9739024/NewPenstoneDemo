package newpenstone.penstoneweb.controller;

import newpenstone.penstoneweb.dao.demo.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import newpenstone.penstoneweb.service.ServiceTest;


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
