package com.example.business;

import com.example.business.SomeBussinessImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessTest {

    @Test
    public void calculateSum_basic() {
        SomeBussinessImpl bussiness = new SomeBussinessImpl();
        int actualResult = bussiness.calculateSum(new int[] {1,2,3});
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void calculateSum_basic_empty() {
        SomeBussinessImpl bussiness = new SomeBussinessImpl();
        int actualResult = bussiness.calculateSum(new int[] {5});
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);

    }


}
