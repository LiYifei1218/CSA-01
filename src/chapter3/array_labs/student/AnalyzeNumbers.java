package chapter3.array_labs.student;

import java.util.Scanner;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/3/11
 */
public class AnalyzeNumbers
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner( System.in);

        System.out.println("Enter 5 numbers:");

        int [] nums = new int[5];

        nums[0] = input.nextInt();
        nums[1] = input.nextInt();
        nums[2] = input.nextInt();
        nums[3] = input.nextInt();
        nums[4] = input.nextInt();

        int sum = 0;
        //write your code here
        for (int i = 0; i < 5; i++)
            sum += nums[i];

        double mean = sum / 5.0;
        int count = 0;
        for (int i = 0; i < 5; i++)
            if (nums[i] > mean)
                count++;

        System.out.println(mean);
        System.out.println(count);
    }
}
