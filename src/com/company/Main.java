package com.company;

public class Main {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int answer;

        firstNumber = 5;
        secondNumber = 7;
        answer = 0;

        String operator = "-";
        if (operator.equals("+")){
            answer = firstNumber + secondNumber;
        }else if (operator.equals("-")){
            answer = firstNumber - secondNumber;
        }
        // add / & *
        System.out.println(answer);
    }
}
