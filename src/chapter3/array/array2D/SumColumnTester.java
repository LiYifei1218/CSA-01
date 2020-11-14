package chapter3.array.array2D;

import chapter3.array.ArrayUtils;
/**
 * Created by Jason (jason@bitacademy.cn) on 2019/10/22
 */
public class SumColumnTester
{
    public static void main(String[] args)
    {

        //test example program here

        //test data
        double[][] arr = {
                {2, 3, 4, 8, 9},
                {5, 7, 2, 4, 1},
                {6, 8, 9, 8, 3}
        };

        //call the method 'sumColumn()'
        System.out.println(sumColumn(arr, 3)); // -> 20

        //call the method 'generateColumnSums()'
        ArrayUtils.printArray(generateColumnSums(arr)); // -> {13, 18, 15, 20, 13}
    }

    public static double sumColumn(double[][] m, int columnIndex)
    {
        //write your code here
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }

        return sum;
    }

    public static double[] generateColumnSums(double[][] m)
    {
        //write your code here
        double sum[] = new double[m[0].length];
        int k = 0;
        for (int i = 0; i < m[0].length; i++) {
            sum[i] = sumColumn(m,i);

        }

       return sum;
    }
}
