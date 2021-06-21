package com.company;

public class Main {

    public static void main(String[] args) {
        int firstNumber;
        double secondNumber;
        double answer;

        firstNumber = 5;
        secondNumber = 7;
        answer = 0;

        String operator = "/";

        if (operator.equals("+")) {
            answer = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            answer = firstNumber - secondNumber;
        } else if (operator.equals("*")) {
            answer = firstNumber * secondNumber;
        } else if (operator.equals("/")) {
            answer = firstNumber / secondNumber;
        }
//        % - modulo;
//        5 % 2 = 1


//        System.out.println(answer);
//        int five = 5;

//        System.out.println();

//        && - and
//        || - or
//        ! - not
//        != - not equal
//        == equal
//        >= greater than or equal
//        <= less than  or equal

//        if (6 < 8 != 5 > 9) {
//            System.out.println("EQUALS works");
//        } else {
//            System.out.println("EQUAL skipped");
//        }


//      LOOPS
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("value of i: " + i);
//        }
//        for (int i = 1; i <= 10; i++) {
//            if (i >= 6) {
//                System.out.println("i = " + i);
//            }
//        }
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println("i even = " + i);
//            } else {
//                System.out.println("i odd= " + i);
//            }
//        }

//        int counter = 1;
//        while (counter <= 10) {
//            System.out.println("counter = " + counter);
//            counter++;
//        }
//
//        do {
//            System.out.println("counter = " + counter);
//            counter++;
//        } while (counter <= 10);


//        Math.pow
//        Math.max
//        Math min
        System.out.println(Math.max(5, 4));
        
        int minimum = Math.min(5, 200);
        System.out.println("minimum = " + minimum);

    }
}
