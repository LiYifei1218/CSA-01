package chapter1;

import java.util.Scanner;

public class ExtratDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int f = 10;
        int out = 0;
        while (num % f != 0) {
            out = num % f;
            num -= out;
            num /= f;
            System.out.println(out);
            //System.out.println(f);
            //System.out.println(num);
            //System.out.println();
            //f *= 10;
        }
    }
}
