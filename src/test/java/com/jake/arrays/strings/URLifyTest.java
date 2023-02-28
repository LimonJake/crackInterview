package com.jake.arrays.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLifyTest {

    URLify urLify;

    @BeforeEach
    void setUp() {
        urLify = new URLify();
    }

    @Test
    void solutionURL_EasStep(){
        assertEquals("Mr%20John%20Smith",urLify.solutionEasy("Mr John Smith   "));
    }

}