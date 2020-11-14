package chapter3.array.array2D;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/10/25
 */
public class CountNumberTester
{
    public static void main(String[] args)
    {

        //test example program here

        //test data
        int[][] a = {{1, 3, 4},{2, 4, 5}, {7, 23, 3}};
        int[][] b = {{7, 13, 7}, {19, 7, 5}};
        int[][] c = {{11, 33, 44}};

        //call the method 'countNumber()'
        System.out.println(countNumber(a, 23)); // -> 1
        System.out.println(countNumber(b, 7)); // -> 3
        System.out.println(countNumber(c, 0)); // -> 0

    }

    public static int countNumber(int[][] arr, int number)
    {
        //write your code here
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number)
                    count++;
            }
        }
        return count;
    }
}
