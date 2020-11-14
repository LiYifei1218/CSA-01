package chapter1;

import java.util.Scanner;

public class FoldPaper {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        double height = 0.000125;
        int count = 0;
        while (height < 8848) {
            height = height * 2;
            count++;
        }
        System.out.println(count);
    }
}
