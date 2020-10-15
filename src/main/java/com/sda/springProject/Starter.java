package com.sda.springProject;

import com.sda.springProject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    TestService testService;


    @Override
    public void run(String... args) throws Exception {

        System.out.println(testService);
    }
}
