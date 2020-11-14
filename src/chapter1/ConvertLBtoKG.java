package chapter1;

import java.util.Scanner;

public class ConvertLBtoKG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pound = input.nextDouble();
        System.out.println(pound + " pounds is " + (pound * 0.454) + " kilograms");
    }
}
