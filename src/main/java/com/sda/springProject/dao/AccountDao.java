package com.sda.springProject.dao;

public class AccountDao {
    private String name;
    private int liczba =23;

    public void setName(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println(" AccountDao PostConstruct");
    }

    public void  stop(){
        System.out.println(" AccountDao PreDestroy");
    }
    public void incr(){
        liczba = liczba +2;
    }

    @Override
    public String toString() {
        return "AccountDao{" +
                "name='" + name + '\'' +
                ", liczba=" + liczba +
                '}';
    }
}
