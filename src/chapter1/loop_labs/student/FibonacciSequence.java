package chapter1.loop_labs.student;

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

        /**
         * Write your code here to output the first n terms of the
         * Fibonacci Sequence
         */
        int arr[] = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(arr[i]);
        }



    }
}
