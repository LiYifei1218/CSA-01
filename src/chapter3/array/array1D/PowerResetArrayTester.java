package chapter3.array.array1D;

import chapter3.array.ArrayUtils;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/10/25
 */
public class PowerResetArrayTester
{
    public static void main(String[] args)
    {

        //test example program here

        //test data
        int[] a = {3, 2, 3, 10, 3, 7, 6};

        //call the method 'powerArray()'
        powerArray(a, 3);
        ArrayUtils.printArray(a);// -> {27, 8, 27, 1000, 27, 243, 216}

        //call the method 'restArray()'
        restArray(a, -1);
        ArrayUtils.printArray(a); // -> {-1, -1, -1, -1, -1, -1, -1}


    }

    public static void powerArray(int[] arr, int n)
    {
        //write your code here



    }

    public static void restArray(int[] arr, int value)
    {

        //write your code here



    }
}
