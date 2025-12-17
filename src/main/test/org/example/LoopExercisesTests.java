package org.example;

import org.junit.Test;

public class LoopExercisesTests {
    @Test
    public void testSum() {
        LoopExercises loopExercises = new LoopExercises();
        assert loopExercises.sum(5) == 15;
        assert loopExercises.sum(10) == 55;
        assert loopExercises.sum(100) == 5050;
    }
//Negative Test Case
    @Test
    public void testSum_NegativeNumber() {
        LoopExercises loopExercises = new LoopExercises();

        assert loopExercises.sum(-5) == 0;
    }

    //Edge Test Case
    @Test
    public void testSum_EdgeCase_Zero() {
        LoopExercises loopExercises = new LoopExercises();

        assert loopExercises.sum(0) == 0;
    }

    @Test
    public void testSumUntilEven() {
        LoopExercises loopExercises = new LoopExercises();
        assert loopExercises.sumUntilEven(5) == 6;
        assert loopExercises.sumUntilEven(10) == 6;
        assert loopExercises.sumUntilEven(100) == 6;
    }
}
