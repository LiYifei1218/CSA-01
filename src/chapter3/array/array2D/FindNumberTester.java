package chapter3.array.array2D;

import chapter3.array.ArrayUtils;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/10/22
 */
public class FindNumberTester
{
    public static void main(String[] args)
    {

        //test example program here

        //test data
        int[][] arr1 = { {1, 3, 4}, {2, 4, 5},{7, 23, 3} };
        int[][] arr2 = { {7, 13, 4}, {19, 4, 5} };
        int[][] arr3 = { {11, 33, 44} };

        //call the method 'findNumber()'
        ArrayUtils.printArray(findNumber(arr1, 23)); // -> {2, 1}
        ArrayUtils.printArray(findNumber(arr2, 23)); // -> null
        ArrayUtils.printArray(findNumber(arr3, 11)); // -> {0, 0}

        ArrayUtils.printArray2D(arr1);
    }

    public static int[] findNumber(int[][] array, int target)
    {
        //write your code here
        int count = 0;
        int flag = 0;
        int[] re = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target){
                    re[0] = i;
                    re[1] = j;
                    flag = 1;
                }
            }
        }
        if (flag == 1)
            return re;
        else
            return null;
    }
}
