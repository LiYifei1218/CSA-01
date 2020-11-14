package chapter3.ArrayExercises;

public class CopyRange {
    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 40, 50, 60};

        int[] a2 = {91, 92, 93, 94, 95, 96};

        copyRange(a1, a2, 0, 2, 3);
        for (int i: a2) {
            System.out.println(i);
        }
    }

    public static void copyRange(int[] arr1, int[] arr2, int i1, int i2, int len){
        for (int i = 0; i < arr2.length; i++) {
            while (i == i2 && i1 < len){
                arr2[i] = arr1[i1];
                i1++;
                i++;
                i2++;
            }
        }
    }
}
