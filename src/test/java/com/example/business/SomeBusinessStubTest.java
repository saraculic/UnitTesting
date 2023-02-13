package com.example.business;

import com.example.data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SomeDataServiceStub implements SomeDataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {1,2,3};
    }
}

class SomeDataServiceEmptyStub implements SomeDataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {};
    }
}

class SomeDataServiceOneElementStub implements SomeDataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {5};
    }
}

public class SomeBusinessStubTest {

    @Test
    public void calculateSumUsingDataService_basic() {
        SomeBussinessImpl bussiness = new SomeBussinessImpl();
        bussiness.setSomeDataService(new SomeDataServiceStub());
        int actualResult =   bussiness.calculateSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void calculateSumUsingDataService_empty() {
        SomeBussinessImpl bussiness = new SomeBussinessImpl();
        bussiness.setSomeDataService(new SomeDataServiceEmptyStub());
        int actualResult = bussiness.calculateSumUsingDataService(); //new int[] {}
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void calculateSumUsingDataService_oneValue() {
        SomeBussinessImpl bussiness = new SomeBussinessImpl();
        bussiness.setSomeDataService(new SomeDataServiceOneElementStub());
        int actualResult = bussiness.calculateSumUsingDataService(); //new int[] {5}
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);

    }


}
