package com.sda.springProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Starter implements CommandLineRunner {

List <AccountService> accountService;

    public Starter(List<AccountService> accountService) {
        this.accountService = accountService;
    }

    @Override
    public void run(String... args) throws Exception {
        accountService.stream().map(Object::toString).forEach(System.out::println);

    }
}
