package chapter1;

import java.util.Scanner;

public class DetermineEvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("Even number.");
        else
            System.out.printf("Odd number.");
    }
}
