package org.example;

public class LoopExercises {

    public int sum(int n) {
        int sumOfNumber = 0;
//step1: for example n=5
// step2: then the loop will check if 1<=5
        //step3: 0+1 is the sum of number which is 1
        //step4:  i=1 the for loop returns sumOfNumber as 1
        //i=2, 2<=5, 1+2= 3 is the new sumOfNumber
        //i=3, 3<=5, 3+3=6 is the new sumOfNumber
        //i=4, 4<=5, 6+4=10 is the new sumOfNumber
        //i<=5, sumOfNumber= 10+5= 15 is the final sumOfNumber
        for (int i = 1; i <= n; i++) {
            sumOfNumber = sumOfNumber + i;
        }

        return sumOfNumber;
    }


    public int sumUntilEven(int n) {
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i;

            if (sum % 2 == 0) {
                break;
            }

            i++;
        }

        return sum;
    }


}
