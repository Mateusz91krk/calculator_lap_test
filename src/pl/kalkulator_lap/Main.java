package pl.kalkulator_lap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Simple calculator in the console - test\nLaptop settings");
        System.out.println("Enter the first number:");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.println("Your first number is " + number);
        System.out.println("Enter the second number:");
        Scanner scanner1 = new Scanner(System.in);
        double number1 = scanner1.nextDouble();
        System.out.println("Your numbers are " + number + " and " + number1);
        System.out.println("All the actions on your numbers are:");
        System.out.println("Addition:");
        System.out.println(number + " + " + number1 + " = " +(number+number1));
        System.out.println("Subtraction:");
        System.out.println(number + " - " + number1 + " = " + (number-number1));
        System.out.println("or\n" + number1 + " - " + number + " = " + (number1-number));
        System.out.println("Multiplication:");
        System.out.println(number + " * " + number1 + " = " + (number*number1));
        System.out.println("Division:");
        System.out.println(number + " / " + number1 + " = " + (number/number1));
        System.out.println("or\n" + number1 + " / " + number + " = " + (number1/number));
        System.out.println("The End");

    }
}
