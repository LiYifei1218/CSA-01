package chapter3;

public class Array {
    public static void main(String[] args) {
        double arr[] = new double[5];
        arr[0] = 5.0;
        arr[1] = 300.5;
        arr[2] = 20.2;
        arr[3] = 10.9;
        arr[4] = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
