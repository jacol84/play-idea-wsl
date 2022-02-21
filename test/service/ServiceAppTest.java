package service;

import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceAppTest {

    @Test
    public void add() {
        //given
        ServiceApp serviceApp = new ServiceApp();
        //when
        int add = serviceApp.add(2, 2);
        //then
        assertEquals(4, add);
    }
}