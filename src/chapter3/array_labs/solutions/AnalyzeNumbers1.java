package chapter3.array_labs.solutions;

import java.util.Scanner;

public class AnalyzeNumbers1
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner( System.in);

    System.out.println("Enter 5 numbers:");

    //Decalare an array to store user input
    int[] nums = new int[5];
	
    for (int i =0; i<5;i++)
    {
      nums[i] = input.nextInt();
    }

    double average = computeAverage(nums);

    System.out.println("Average of all numbers is: " + average) ;

    int count = 0;
    for (int i =0; i<5;i++)
    {
      if(nums[i] > average)
      {
        count++;
      }
    }

    System.out.println("Number of elements above average is: " + count);

  }
  
  public static double computeAverage(int[] a)
  {
	int sum = 0;
    for (int i =0; i<a.length;i++)
    {
      sum = sum + a[i];
    }
	return  (double)sum/a.length;
	  
  }


}
