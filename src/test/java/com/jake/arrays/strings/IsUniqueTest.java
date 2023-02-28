package com.jake.arrays.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueTest {

    IsUnique isUnique;

    @BeforeEach
    void setUp() {
        isUnique = new IsUnique();
    }

    @Test
    void isUniqueSolution_BruteForce_shouldReturnTrue(){
        assertTrue(isUnique.solutionBruteForce("abcd"));
    }

    @Test
    void isUniqueSolution_BruteForce_shouldReturnFalse(){
        assertFalse(isUnique.solutionBruteForce("abcad"));
    }

    @Test
    void isUniqueSolution_MapSolution_ShouldReturnTrue(){
        assertTrue(isUnique.solutionUsingMap("abcd"));
    }

    @Test
    void isUniqueSolution_MapSolution_ShouldReturnFalse(){
        assertFalse(isUnique.solutionUsingMap("abcad"));
    }

    @Test
    void isUniqueSolution_BitSolution_ShouldReturnTrue(){
        assertTrue(isUnique.solutionUsingBit("abcd"));
    }

    @Test
    void isUniqueSolution_BitSolution_ShouldReturnFalse(){
        assertFalse(isUnique.solutionUsingBit("abacd"));
    }

}