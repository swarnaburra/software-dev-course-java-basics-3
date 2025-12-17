package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionalExercisesTests {
    @Test
    public void testLessThanFive() {
        ConditionalExercises exercises = new ConditionalExercises();
        assertTrue(exercises.lessThanFive(4));
        assertFalse(exercises.lessThanFive(5));
        assertFalse(exercises.lessThanFive(6));
    }
   //Negative Test Case
    @Test
    public void testLessThanFive_Negative() {
        ConditionalExercises exercises = new ConditionalExercises();
        boolean result = exercises.lessThanFive(5);

        assertEquals(false, result);
    }

    //Edge Case

    @Test
    public void testLessThanFive_EdgeCase() {
        ConditionalExercises exercises = new ConditionalExercises();

        boolean result = exercises.lessThanFive(5);

        assertEquals(false, result);
    }

    @Test
    public void testGetAgeGroup() {
        ConditionalExercises exercises = new ConditionalExercises();
        assertEquals("child", exercises.getAgeGroup(12));
        assertEquals("teen", exercises.getAgeGroup(15));
        assertEquals("adult", exercises.getAgeGroup(20));
    }

    @Test
    public void testIsValidPassword() {
        ConditionalExercises exercises = new ConditionalExercises();
        assertFalse(exercises.isValidPassword("1234567"));
        assertTrue(exercises.isValidPassword("12345678"));
        assertTrue(exercises.isValidPassword("123456789"));
    }
}
