package com.jake.arrays.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPermutationTest {

    CheckPermutation checkPermutation;

    @BeforeEach
    void setUp() {
        checkPermutation = new CheckPermutation();
    }

    @Test
    void solutionPermutationBruteForce_ShouldReturnTrue(){
        assertTrue(checkPermutation.solutionPermutationBruteForce("god", "dog"));
    }

    @Test
    void solutionPermutationBruteForce_ShouldReturnFalse(){
        assertFalse(checkPermutation.solutionPermutationBruteForce("good", "dog"));
    }

    @Test
    void solutionPermutationSorting_ShouldReturnTrue(){
        assertTrue(checkPermutation.solutionPermutationSorting("god", "dog"));
    }

    @Test
    void solutionPermutationSorting_ShouldReturnFalse(){
        assertFalse(checkPermutation.solutionPermutationSorting("good", "dog"));
    }

    @Test
    void solutionPermutationBinary_ShouldReturnTrue(){
        assertTrue(checkPermutation.solutionPermutationUsingArrayBit("god", "dog"));
    }

    @Test
    void solutionPermutationBinary_ShouldReturnFalse(){
        assertFalse(checkPermutation.solutionPermutationUsingArrayBit("good", "dog"));
    }

}