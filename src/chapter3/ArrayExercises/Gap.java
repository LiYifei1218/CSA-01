package chapter3.ArrayExercises;

public class Gap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 12};
        System.out.println(minGap(arr));
    }

    public static int minGap(int[] arr){
        int min = 2147483647;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) < min)
                min = arr[i + 1] - arr[i];
        }
        return min;
    }
}
