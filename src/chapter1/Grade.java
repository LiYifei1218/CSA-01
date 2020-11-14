package chapter1;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            int grade = input.nextInt();
            if (grade >= 90) System.out.println("A");
            else if (grade >= 80 && grade < 90) System.out.println("B");
            else if (grade >= 70 && grade < 80) System.out.println("C");
            else if (grade < 70) System.out.println("D");
        }
    }
}
