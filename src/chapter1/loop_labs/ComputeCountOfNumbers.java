package chapter1.loop_labs;

import java.util.Scanner;

public class ComputeCountOfNumbers
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int count = 0;
        for (int i = 0; i <= number; i++)
        {

            if (i % 17 ==0 && i%3!=0)
            {
                count++;
            }
            
        }

        System.out.print("There are " + count + " integers that are divisible " +
                "           by 17 and not divisible by 3");
    }
}
