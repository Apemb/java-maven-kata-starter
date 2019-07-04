package com.dojo.kata;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void testFunction_should_return_hello_world_with_JUnit() {
        // Arrange
        Kata kata = new Kata();

        // Act
        String result = kata.testFunction();

        // Assert
        String expectedGreeting = "Hello World!";
        assertEquals(expectedGreeting, result);
    }

    @Test
    public void testFunction_should_return_hello_world_with_AssertJ() {
        // Arrange
        Kata kata = new Kata();

        // Act
        String result = kata.testFunction();

        // Assert
        String expectedGreeting = "Hello World!";
        assertThat(result).isEqualTo(expectedGreeting);
    }
}

