package chapter1.loop_labs.student;

import java.util.Scanner;

public class ComputeEvenNumSum
{

  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = scanner.nextInt();

    //write your code here, compute the sum of even numbers from 1~number
    int ans = 0;
    for (int i = 0; i <= number; i+=2) {
      ans += i;
    }
    System.out.println(ans);
  }

}
