package chapter3.array;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/10/24
 */
public class ArrayUtils
{

    public static void printArray(int[] arr)
    {
        if(arr==null)
        {
            System.out.println("null");
            return;
        }

        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

            if(i!=arr.length-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void printArray(double[] arr)
    {
        if(arr==null)
        {
            System.out.println("null");
            return;
        }

        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

            if(i!=arr.length-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void printArray2D(double[][] arr)
    {
        if (arr == null) {
            System.out.println("null");
            return;
        }

        System.out.print("{");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j]);
                if(j!=arr[0].length-1)
                {
                    System.out.print(",");
                }
            }

            if(i!=arr.length-1)
            {
                System.out.print("}, ");
            }
            else
            {
                System.out.print("}");
            }

        }

        System.out.println("}");

    }

    public static void printArray2D(int[][] arr)
    {
        if (arr == null) {
            System.out.println("null");
        }

        System.out.print("{");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j]);
                if(j!=arr[0].length-1)
                {
                    System.out.print(", ");
                }
            }

            if(i!=arr.length-1)
            {
                System.out.print("},");
            }
            else
            {
                System.out.print("} ");
            }

        }

        System.out.println("}");

    }
}
