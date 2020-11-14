package chapter3.array_labs.solutions;

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

        //思考：尝试用循环来接受用户输入
        nums[0] = input.nextInt();
        nums[1] = input.nextInt();
        nums[2] = input.nextInt();
        nums[3] = input.nextInt();
        nums[4] = input.nextInt();

        double average = (double)(nums[0]+ nums[1] + nums[2] + nums[3] + nums[4])/5;

        System.out.println("Average of all numbers is : " + average);

        //思考：尝试用循环来计算数量
        int count = 0;
        if(nums[0]> average)
        {
            count++;
        }
        if(nums[1]> average)
        {
            count++;
        }
        if(nums[2]> average)
        {
            count++;
        }
        if(nums[3]> average)
        {
            count++;
        }
        if(nums[4]> average)
        {
            count++;
        }

        System.out.println("Number of elements above average is: " + count);
        

    }
}
