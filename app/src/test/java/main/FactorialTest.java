package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FactorialTest {

    @Test
    void testThat0InputHandledCorrectly() {
        long actual = new Factorial().factorial(0);
        Assertions.assertEquals(1,actual);
    }

    @Test
    void testThat1InputHandledCorrectly() {
        long actual = new Factorial().factorial(1);
        Assertions.assertEquals(1,actual);
    }

    @Test
    void testThat2InputHandledCorrectly() {
        long actual = new Factorial().factorial(2);
        Assertions.assertEquals(2,actual);
    }

    @Test
    void testThat5InputHandledCorrectly() {
        long actual = new Factorial().factorial(5);
        Assertions.assertEquals(120,actual);
    }

    @Test
    void testThat6InputHandledCorrectly() {
        long actual = new Factorial().factorial(6);
        Assertions.assertEquals(720,actual);
    }
}