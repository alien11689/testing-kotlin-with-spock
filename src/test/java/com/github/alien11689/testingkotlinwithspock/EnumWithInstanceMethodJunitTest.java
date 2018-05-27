package com.github.alien11689.testingkotlinwithspock;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnumWithInstanceMethodJunitTest {
    @Test
    public void shouldReturnSign() {
        assertEquals("-", EnumWithInstanceMethod.MINUS.sign());
    }

    @Test
    public void shouldReturnSignJava() {
        assertEquals("-", EnumWithInstanceMethodInJava.MINUS.sign());
    }
}
