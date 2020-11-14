package chapter3;

public class Test {
    public static void main(String[] args) {


        int[][] seats = {{1,0,0},{0,1,0},{1,1,1}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (seats[i][j] == 0)
                    System.out.print("White ");
                else
                    System.out.print("Red ");
            }
            System.out.println("");
        }

    }
}
