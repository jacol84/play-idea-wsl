package service;

import java.util.ArrayList;
import org.junit.Test;
import com.google.common.collect.Lists;

import static org.junit.Assert.assertEquals;

public class ServiceAppTest1 {

    @Test
    public void add() {
        //given
        ServiceApp serviceApp = new ServiceApp();
        ArrayList<Object> objects = Lists.newArrayList();
        System.out.printf("objects"+objects);
        //when
        int add = serviceApp.add(2, 2);
        //then
        assertEquals(4, add);
    }
}