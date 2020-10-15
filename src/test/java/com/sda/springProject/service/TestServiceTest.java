package com.sda.springProject.service;

import com.sda.springProject.dao.TestDao;
import com.sda.springProject.service.TestService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestServiceTest {
    TestDao testDao = Mockito.mock(TestDao.class); // jesli mamy konstruktor parametrowy

    @Test
    void toString_test(){                                          // musi być konstruktor bezparametrowy
        TestService testService = new TestService();
        Assertions.assertThat(testService.toString()).isGreaterThan("Name w Test Serwisie");
    }
}
