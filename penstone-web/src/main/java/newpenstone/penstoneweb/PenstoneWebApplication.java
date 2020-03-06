package newpenstone.penstoneweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"newpenstone.penstoneweb"})
public class PenstoneWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PenstoneWebApplication.class, args);
    }

}
