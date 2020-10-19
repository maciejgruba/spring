package com.sda.springProject;

import com.sda.springProject.dao.AccountDao;

public class AccountService {
    private String name;

    private AccountDao accountDao;

    public AccountService(String name, AccountDao accountDao) {
        this.name = name;
        this.accountDao = accountDao;
    }

    @Override
    public String toString() {
        return "AccountService{" +
                "name='" + name + '\'' +
                ", accountDao=" + accountDao +
                '}';
    }
}
