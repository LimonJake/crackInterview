package com.jake.arrays.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAwayTest {

    OneAway oneAway;

    @BeforeEach
    void setUp() {
        oneAway = new OneAway();
    }

    @Test
    void solutionShouldReturnTrue(){
        assertTrue(oneAway.solution("palee","pale"));
    }

    @Test
    void solutionShouldReturnTrue_AnotherWords(){
        assertTrue(oneAway.solution("pale","pkle"));
    }

    @Test
    void solutionShouldReturnFalse(){
        assertFalse(oneAway.solution("pale","blake"));
    }

    @Test
    void solutionShouldReturnTrue_Insert(){
        assertTrue(oneAway.solution("abef","acbef"));
    }

    @Test
    void solutionTwoShouldReturnTrue(){
        assertTrue(oneAway.anotherSolution("palee","pale"));
    }

    @Test
    void solutionTwoShouldReturnFalse(){
        assertFalse(oneAway.anotherSolution("pale","blake"));
    }

}