package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testApp() {
        App app = new App();
        assertEquals("Hello World!", app.getGreeting());
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }
}
