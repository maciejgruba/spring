package com.sda.springProject;

import com.sda.springProject.dao.TestDao;
import com.sda.springProject.service.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sda") // przeszukiwanie klas do wyswietlenia
@ComponentScan(basePackageClasses = {TestDao.class, TestService.class}) // metoda skanowania poszczeegolnych klas
public class SpringProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }

}
