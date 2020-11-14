package chapter3.ArrayExercises;

public class PercentEven {
    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 11, 3};
        System.out.println(percentEven(arr));
    }

    public static double percentEven(int[] arr){
        int count = 0;
        double percent = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }
        percent = (double) count / (double) arr.length * 100;
        return percent;
    }
}
