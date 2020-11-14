package chapter3.array_labs.solutions;

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


    public static int findIndex(int[] a, int num)
    {

        for (int i = 0; i < a.length; i++)
        {
            if(a[i] == num)
            {
                return i;
            }
        }

        return -1;
    }
}
