package com.sda.springProject.dao;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TestDao {

    @Autowired
    private Logger logger;
//    Logger logger = LoggerFactory.getLogger(this.getClass().getName()); // z slf4j biblioteki

    @Value("${testDao.name}") // wstrzykujemy metody
    private String name;

    @Value("${testDao.age}")
    private int age;

    public String wypisz() {
        return null;
    }

    public TestDao(Logger logger) {
        this.logger = logger;
    }

    @PostConstruct
    public void start() {
        logger.info("Wystartował TestDao");
        logger.info("Startuje TestDao info");
        logger.error("Startuje TestDao error");
        logger.warn("Startuje TestDao warn");
        logger.debug("Startuje TestDao debug");
        logger.trace("Startuje TestDao trace");
    }

    @PreDestroy
    public void stop() {
        logger.info("Niszczymy TestDao");
    }

    @Override
    public String toString() {
        return "Klasa TestDao " + name + " wiek " + age;
    }
}
