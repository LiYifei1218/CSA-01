package chapter3.ArrayExercises;

import chapter3.Array;
import chapter3.array.ArrayUtils;

public class Feb8 {
    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {10, 20, 30, 40, 50, 60};
        int[] a3 = {20, 3, 50, 10, 68};
        System.out.println(equal(a1,a3));
        ArrayUtils.printArray(append(a1,a3));

        int[] a4 = {11, 42, -5, 27, 0, 89};
        int[] a5 = {10, 20, 30, 40, 50, 60};
        swapAll(a4, a5);
        ArrayUtils.printArray(a4);
        ArrayUtils.printArray(a5);
    }
    
    public static boolean equal(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i])
                    return false;
            }
        }
        return true;
    }

    public static int[] append(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i];
        }
        for (int i = arr1.length, j = 0; i < arr1.length + arr2.length; i++, j++) {
            res[i] = arr2[j];
        }
        return res;
    }

    public static void swapAll(int[] arr1, int[] arr2) {
        int[] arrt = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrt[i] = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = arrt[i];
        }
    }
}
//  D B B D B
//  D B A C C