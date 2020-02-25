package com.example.demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestControllerTest {

    @Test
    public void test(){
        TestController testController = new TestController();

        assertEquals(testController.test(), "Hello World");
    }

}


