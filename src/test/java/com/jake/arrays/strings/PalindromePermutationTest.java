package com.jake.arrays.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationTest {

    PalindromePermutation palindromePermutation;

    @BeforeEach
    void setUp() {
        palindromePermutation = new PalindromePermutation();
    }

    @Test
    void solutionUsingBit_ShouldReturnTrue(){
        assertTrue(palindromePermutation.solution("Tact Coa"));
    }

    @Test
    void solutionUsingBit_ShouldReturnFalse(){
        assertFalse(palindromePermutation.solution("Tac Coaa"));
    }

    @Test
    void solutionUsingBit_UsingLowerCase_ShouldReturnTrue(){
        assertTrue(palindromePermutation.solution2("Race Car"));
    }

    @Test
    void solutionUsingBit_UsingLowerCase_ShouldReturnFalse(){
        assertFalse(palindromePermutation.solution2("Tact Coaa"));
    }

}