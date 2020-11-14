package chapter1.loop_labs.student;

import java.util.Scanner;

public class ComputeCountOfNumbers
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        /*  write your code here, compute the count of numbers
         *  in the range 17~number that are divisible by 17 but not by 3.
         */
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 17 == 0 && i % 3 != 0)
                ans++;
        }
        System.out.println(ans);
    }

}
