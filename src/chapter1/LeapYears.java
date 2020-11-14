package chapter1;

import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int thisYear = 2021;

        while (n > 0) {

            if ((thisYear % 4 == 0 && thisYear % 100 != 0) || thisYear % 400 == 0) {
                System.out.println(thisYear);
                n--;
                thisYear++;
            }
            else
                thisYear++;
        }

    }
}
