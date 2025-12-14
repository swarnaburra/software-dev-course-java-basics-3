package org.example;

public class Main {
    public static void main(String[] args) {
        //Creating instance of ConditionalExercises
        ConditionalExercises conditionalExercises= new ConditionalExercises();
        //Calling method lessThanFive in conditionalExercises
        System.out.println(conditionalExercises.lessThanFive(1));
        //Calling method getAgeGroup in conditionalExercises
        System.out.println(conditionalExercises.getAgeGroup(41));
        //Calling method isValidPassword in conditionalExercises
        System.out.println(conditionalExercises.isValidPassword("stringismypswd"));


        LoopExercises loopExercises = new LoopExercises();
        System.out.println(loopExercises.sum(5));
        /* Trying for loop to call sum method upto 15 */
        for(int i = 1; i<=15;i++){
            System.out.println(loopExercises.sum(i));
        }
        System.out.println(loopExercises.sumUntilEven(5));

        JavaCafe javaCafe = new JavaCafe();
        javaCafe.run();
    }
}