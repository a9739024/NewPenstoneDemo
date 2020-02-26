import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class WebTest {
    @RequestMapping("/showAll")
    public String showAll(){
        ServiceTest serviceTest = new ServiceTest();
        return serviceTest.showService()+"I'm Web";
    }
}
