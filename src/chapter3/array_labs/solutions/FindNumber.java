package chapter3.array_labs.solutions;

import java.util.Scanner;

public class FindNumber
{

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        System.out.println("Enter 3 numbers:");

        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }

        int max = nums[0];
        for (int i = 0; i <nums.length; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }
        }

        System.out.println("The maximum number is: " + max);


    }

}
