package chapter3.array_labs.student;

import java.util.Scanner;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/3/11
 */
public class SearchNumberIndex
{

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        System.out.println("Enter 5 numbers:");

        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }


        System.out.println("Enter a number to search:");
        int n = input.nextInt();

        System.out.println("Find it in the index: " + findIndex(nums, n));
    }


    /**
     * Return the index of the first occurrence of the given number num
     * @param a the data set from which to search
     * @param num the number to search
     * @return
     */
    public static int findIndex(int[] a, int num)
    {

        //write your code here


        return -1;
    }
}
