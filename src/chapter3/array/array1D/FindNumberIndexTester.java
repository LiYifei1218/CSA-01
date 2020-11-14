package chapter3.array.array1D;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/10/25
 */
public class FindNumberIndexTester
{

    public static void main(String[] args)
    {
        //test example program here

        //test data
        int[] a = {7, 8, 10, 12, 10};
        int[] b = {1, 6, 3, 6, 5, 7, 9};

        //call the method 'findNumberIndex()'
        System.out.println(findNumberIndex(a, 10)); // -> 2
        System.out.println(findNumberIndex(a, 31)); // -> -1
        System.out.println(findNumberIndex(a, 0)); // -> -1
        System.out.println(findNumberIndex(a, 7)); // -> 0

        //call the method 'findLastNumberIndex()'
        System.out.println(findLastNumberIndex(a, 10)); // -> 4
        System.out.println(findNumberIndex(b, 6)); // -> 3
        System.out.println(findNumberIndex(b, 0)); // -> -1
        System.out.println(findNumberIndex(b, 7)); // -> 5
    }


    public static int findNumberIndex (int [] array, int target)
    {
        //write your code here

        return -1;
    }

    public static int findLastNumberIndex (int [] array, int target)
    {
        //write your code here

        return -1;
    }
}
