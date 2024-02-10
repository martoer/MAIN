package org.example;

public class Average3Numbers {
    public static void main(String[] args) {
        calculateAVG(3.5,6.5,133);
    }
    public static void calculateAVG (double number1, double number2, double number3){
        double  average = (number1 + number2 + number3)/3;
        System.out.println(average);
    }
}
