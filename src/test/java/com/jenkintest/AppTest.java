package com.jenkintest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testPrint() {
        App app = new App();
        assertEquals("You typed: Hello", app.checkInput("Hello"));
    }
}