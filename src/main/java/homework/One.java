package homework;

import java.util.Scanner;

public class One {

    /**
     *
     * Try to implement a method that calculates
     * factorial number for given input by applying
     * TDD
     * 6 = 1*2*3*4*5*6
     * recursive way doing this ---->   n = n*factorial(n-1)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int factorial = 1;

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }


        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
