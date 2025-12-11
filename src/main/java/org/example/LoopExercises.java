package org.example;

public class LoopExercises {

    public static int sum(int n) {
        int sumOfNumber = 0;

        for (int x = 1; x <= n; x++) {
            sumOfNumber = sumOfNumber + x;
        }

        return sumOfNumber;
    }

    public  static int sumUntilEven(int n) {
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

    public static void main(String[] args){
        System.out.println(sum(5));
        System.out.println(sumUntilEven(5));
    }
}
