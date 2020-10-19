package com.sda.springProject.config;

import com.sda.springProject.AccountService;
import com.sda.springProject.dao.AccountDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansConfig {

    @Bean
    public Logger getLogger(final InjectionPoint injectionPoint) {
        return LoggerFactory.getLogger(injectionPoint.getDeclaredType());
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    @Scope("prototype")
    public AccountDao getAccountDao(@Value("${accountDao.name}") String name) {
        AccountDao accountDao = new AccountDao();
        accountDao.setName(name);
        return accountDao;
    }

    @Bean(name = "dev")
    public AccountService getAccountService(@Value("${accountService.name}") String name, @Autowired AccountDao accountDao) {
        accountDao.incr();
        return new AccountService(name, accountDao);
    }

    @Bean(name = "prod")

    public AccountService getAccountService1(@Value("${accountService.name1}") String name, @Autowired AccountDao accountDao) {

        return new AccountService(name, accountDao);
    }
}
