package com.example.unittesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = {"classpath:test-configuration.properties"})
public class UnitTestingApplicationTests {

//    @Test
//    public void contextLoads() {
//
//    }
}
