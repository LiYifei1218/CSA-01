package chapter3.ArrayExercises;

public class TwoD {
    public static void main(String[] args) {

        //1
        double[][] a = new double[4][4];
        String[][] b = new String[20][5];
        char[][] c = {
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'}
        };
        boolean[][][] d = {
                {
                        {true, true},
                        {true, true},
                        {true, true},
                },
                {
                        {true, true},
                        {true, true},
                        {true, true},
                }
        };
        String[][]f = {
                {"one", "two", "three"},
                {"four", "five", "six"}
        };

        //2
        //a int[][] arr = new int[15][];
            int[][] arra = new int[15][15];
        //b int arr[][] = new int(15)(10);
            int arrb[][] = new int[15][10];
        //c float[] arr[] = new float[3][5];
            float[][] arrc = new float[3][5];
        //d int arr[][] = new double[5][4];
            double arrd[][] = new double[5][4];
        //e int arr[][] = {1.1, 2.2}, {3.3, 1}};
            double arre[][] = {{1.1, 2.2}, {3.3, 1}};

    }

    //3
    public static boolean isSquare(int[][] a) {
        if (a.length == a[0].length)
            return true;
        else return false;
    }

    //4
    public static int max(int[][] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                if (a[i][j] > max)
                    max = a[i][j];

        return max;
    }

    //5
    public static int rowSum(int[][] a, int x) {
        int sum = 0;
        for (int i = 0; i < a[x].length; i++)
            sum += a[x][i];
        return sum;
    }

    //6
    public static int columnSum(int[][] a, int x) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i][x];
        return sum;
    }

    //7
    public static int[] allRowSums(int[][] a) {
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                arr[i] += a[i][j];

        return arr;
    }

    //8
    public int[] maxColumns(int[][] m) {
        int[] arr = new int[m[0].length];
        for (int i = 0; i < m[0].length; i++) {
            int max = m[0][i];
            for (int j = 0; j < m.length; j++) {
                if (m[j][i] > max)
                    max = m[j][i];
            }
            arr[i] = max;
        }
        return arr;
    }
}

/*
    D C A C B
    E D B B C
    C E E A A
    B D A A
 */

/*
    E C A D D
    E D B B D
    C E E A A
    B D B D
 */


/*
    * C A * *
    E D B B *
    C E E A A
    B D * *
 */