package chapter1.loop_labs;

import java.util.Scanner;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/7/9
 */
public class FibonacciSequence
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number N:");
        int n = scanner.nextInt();

        int prePreviousNum = 0;
        int previousNum = 1;

        System.out.print(prePreviousNum + " ");
        System.out.print(previousNum + " ");

        for (int i = 2; i < n; i++)
        {
            int value = prePreviousNum + previousNum;

            if(i!=n-1)
            {
                System.out.print(value +" ");
            }
            else
            {
                System.out.println(value);
            }

            prePreviousNum = previousNum;
            previousNum = value;

        }

    }
}
