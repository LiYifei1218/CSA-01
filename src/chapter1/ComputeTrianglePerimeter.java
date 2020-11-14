package chapter1;

import java.util.Scanner;

public class ComputeTrianglePerimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        if (edge1 + edge2 < edge3 || edge1 + edge3 < edge2 || edge2 + edge3 < edge1)
            System.out.println("Invalid input for edges!");

        else
            System.out.println(edge1 + edge2 + edge3);
    }
}
