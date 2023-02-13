package com.example.business;

import com.example.business.SomeBussinessImpl;
import com.example.data.SomeDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockTest {

    @InjectMocks
    SomeBussinessImpl bussiness;
//    SomeBussinessImpl bussiness = new SomeBussinessImpl();

    @Mock
    SomeDataService dataServiceMock;
//    SomeDataService dataServiceMock =  mock(SomeDataService.class);


    @BeforeEach
    public void before() {
        bussiness.setSomeDataService(dataServiceMock);
    }

    @Test
    public void calculateSumUsingDataService_basic() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1, 2, 3});
        assertEquals(6, bussiness.calculateSumUsingDataService());

    }

    @Test
    public void calculateSumUsingDataService_empty() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {}); //new int[] {}
        assertEquals(0, bussiness.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataService_oneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5}); //new int[] {5}
        assertEquals(5, bussiness.calculateSumUsingDataService());
    }
}
