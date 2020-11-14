package chapter3.array_labs.solutions;

import java.util.Scanner;

public class FindNumber1
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner( System.in );

        System.out.println("Enter 3 numbers:");

        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }


        System.out.println("The maximum number is: " + findMax(nums));
        System.out.println("The minimum number is: " + findMin(nums));


    }

    public static int findMax(int[] a)
    {
        int max = a[0];

        for (int i = 0; i <a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    public static int findMin(int[] a)
    {
        int min = a[0];

        for (int i = 0; i <a.length; i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }



}
