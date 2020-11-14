package chapter3.array.array1D;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/10/25
 */
public class MinTester
{
    public static void main(String[] args)
    {

        //test example program here

        //test data
        int[] a = {1, 2, 3, -20, 5, -20, 9};
        int[] b = {-1, -2, -3, -10, -5, -7, -10};

        //call the method 'min()'
        System.out.println(min(a)); // -> -20
        System.out.println(min(b)); // -> -10

    }

    public static int min(int[] arr)
    {
        //write your code here

        return Integer.MAX_VALUE;
    }
}
