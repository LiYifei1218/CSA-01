package chapter1;

import java.util.Scanner;

public class FindTheNumberOfYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mins = input.nextInt();
        int years = mins / 525600;
        int mins2 = mins % 525600;
        int days = mins2 /1440;
        System.out.println(mins + " minutes is approximately " + years + " years and " + days + " days");
    }
}
