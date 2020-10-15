package com.sda.springProject.service;

import com.sda.springProject.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("myApp.properties")  // dołączanie myapp.properties o klasy
public class TestService {

    @Value("${testService.name:default name}")  // pobranie z application.properties i wyswietlenie
    private String name;

    @Value("${testDao.age}")
    private int age;

    TestService(){

    }
    @Autowired  // jesli wiecej konstruktorow to trzeba dodac ten ktory chcemy odpalic
    public TestService(TestDao testDao) {
        this.testDao = testDao;
        System.out.println("Startuję TestService");
    }

    //    @Autowired //  wstrzykujemy obiekty
    private TestDao testDao;

    public String getFullName(){
        return testDao.wypisz();
    }


    @Override
    public String toString() {
        return name + ", " + testDao + " ,age " + age;
    }


}
