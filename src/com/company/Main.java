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

        if (operator.equals("+")){
            answer = firstNumber + secondNumber;
        }else if (operator.equals("-")){
            answer = firstNumber - secondNumber;
        }else if (operator.equals("*")){
            answer = firstNumber * secondNumber;
        }else if (operator.equals("/")) {
            answer = firstNumber / secondNumber;
        }
        System.out.println(answer);
    }
}
