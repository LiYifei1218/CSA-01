package chapter1.loop_labs;

import java.util.Scanner;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/7/9
 */
public class MultiplicationTabel
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number N:");
        int n = scanner.nextInt();

        System.out.println("Enter the number X:");
        int x = scanner.nextInt();

        /**
         * Write your code here to output a multiplication table
         *
         */

        for (int i = 1; i <= x; i++)
        {
            System.out.println(n + " * "  + i + " = " + n*i );
        }


    }
}
