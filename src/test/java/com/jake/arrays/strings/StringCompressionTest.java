package com.jake.arrays.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    StringCompression stringCompression;

    @BeforeEach
    void setUp() {
        stringCompression = new StringCompression();
    }

    @Test
    void firstSolution_ShouldReturnTheCorrectString(){
        String input = "aabcccccaaa";
        String expected = "a2b1c5a3";
        String result = stringCompression.solution(input);
        assertEquals(expected, result);
    }

    @Test
    void firstSolution_ShouldReturnTheSameString(){
        String result = stringCompression.solution("a");
        assertEquals("a", result);
    }

    @Test
    void firstSolution_ShouldReturnTheSameStringWithMoreChars(){
        String result = stringCompression.solution("aabb");
        assertEquals("aabb", result);
    }

}