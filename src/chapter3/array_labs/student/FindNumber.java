package chapter3.array_labs.student;

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

        //write your code here to find out the maximum number from the array nums


    }

}
