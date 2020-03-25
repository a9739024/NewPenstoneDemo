package newpenstone.penstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"newpenstone.penstone.service.quartz.mapper"})
@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {"newpenstone.penstoneweb.entity"})
public class PenstoneWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PenstoneWebApplication.class, args);
    }

}
