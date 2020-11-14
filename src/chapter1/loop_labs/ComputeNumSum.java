package chapter1.loop_labs;

import java.util.Scanner;

public class ComputeNumSum
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int sum=0;
        for(int i =1;i<=number; i++)
        {
            sum = sum + i;
        }
        System.out.println( "The sum of all numbers within " + number + "is " + sum );

    }
}
