package chapter3.array.array2D;

import chapter3.array.ArrayUtils;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/10/25
 */
public class ResetArrayTester
{
    public static void main(String[] args)
    {

        //test example program here

        //test data
        int[][] a = {{1, 3, 4}, {7, 23, 3}};
        int[][] b = {{7, 13, 4}, {19, 4, 5}};
        int[][] c = {{11, 33, 44}};

        //call the method 'restArray()'
        restArray(a, 23);
        restArray(b, 7);
        restArray(c, 0);
        ArrayUtils.printArray2D(a);// -> {{23, 23, 23}, {23, 23, 23}}
        ArrayUtils.printArray2D(b);// -> {{7, 7, 7}, {7, 7, 7}}
        ArrayUtils.printArray2D(c);// -> {{0, 0, 0}}

    }

    public static void restArray(int[][] array, int value)
    {

        //write your code here
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
            }
        }
    }
}
