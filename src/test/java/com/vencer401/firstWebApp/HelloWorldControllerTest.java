package com.vencer401.firstWebApp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {

    @Test
    public void testHelloWorld() {
        HelloWorldController helloWorldController = new HelloWorldController();

        assertEquals("Hello, world!", helloWorldController.getHelloWorld());
    }

    @Test
    public void testHelloGreeting() {
        HelloWorldController helloWorldController = new HelloWorldController();

        assertEquals("Hello, Bubbles", helloWorldController.getHelloToMe("Bubbles"));
    }

    @Test
    public void testCapitalize() {
        HelloWorldController helloWorldController = new HelloWorldController();

        assertEquals("THIS WILL BE UPPERCASED", helloWorldController.getCapitalization("this will be uppercased"));
    }

    @Test
    public void testReverse() {
        HelloWorldController helloWorldController = new HelloWorldController();

        assertEquals("bubbles blossom buttercup ", helloWorldController.getReverse("buttercup blossom bubbles"));
    }
}
