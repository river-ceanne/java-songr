package com.vencer401.firstWebApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTest {

    ////////// MOCKMVC TESTING

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGetHelloWorldMVC() throws Exception {
        mockMvc.perform(get("/")).andExpect(content().string(containsString("Hello, world!")));
    }

    @Test
    public void testGetHelloNameMVC() throws Exception {
        mockMvc.perform(get("/hello/reina")).andExpect(content().string(containsString("Hello, reina")));
    }

    @Test
    public void testCapitalizationMVC() throws Exception {
        mockMvc.perform(get("/capitalize/reina")).andExpect(content().string(containsString("REINA")));
    }

    @Test
    public void testReverseMVC() throws Exception {
        mockMvc.perform(get("/reverse?sentence=buttercup blossom bubbles")).andExpect(content().string(containsString("bubbles blossom buttercup ")));
    }

    //////////FUNCTION TESTING

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
