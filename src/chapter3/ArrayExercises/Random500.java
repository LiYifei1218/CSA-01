package chapter3.ArrayExercises;

public class Random500 {
    public static void main(String[] args) {
        int[] arr = new int[500];
        int[] count = new int[51];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 51);
            //System.out.println(arr[i]);
            count[arr[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + ": " + count[i]);
        }
    }
}
