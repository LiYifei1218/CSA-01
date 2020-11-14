package chapter2;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(signOf(num));

    }

    public static int signOf(int n) {
        if (n > 0)
            return 1;
        else if (n < 0)
            return -1;
        else
            return 0;
    }

    public static int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public static int rangeSum(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++)
            sum += i;
        return sum;
    }
}