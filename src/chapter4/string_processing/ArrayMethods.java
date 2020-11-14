package chapter4.string_processing;

public class ArrayMethods {


    public static void printArray(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr){

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void print2DArray(int[][] a){

        for (int i = 0; i < a.length; i++) {
            printArray(a[i]);

        }

    }


    public static int scoreAverage(int[] scores){

        int firstHalfAverage =  average(scores, 0, (scores.length/2) -1 );
        int secondHalfAverage = average(scores, scores.length/2, scores.length-1);

        if(firstHalfAverage>secondHalfAverage){
            return firstHalfAverage;
        }

        return secondHalfAverage;


    }

    public static int average(int[] numbers, int start, int end){

        int s = sum(numbers, start, end);
        return   s / (end-start+1);

    }

    public static int sum(int[] arr, int s, int e){

        int sum =0;
        for (int i = s; i <= e; i++) {
            sum  += arr[i];
        }
        return sum;

    }

    public static double doubleSum(double[] arr){


        double sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;

    }



    public static int max(int[] numbers){

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;

    }


    public static int min(int[] numbers){





        return 0;

    }


    /**
     * 找到一个数字在一个数组当中的第一个位置
     *
     * @param arr
     * @param target
     *
     * @postcondition
     *
     * @precondition
     *
     *
     * @return
     */
    public static int[] findeNumberIndex(int[] arr, int target){


        int count=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target){
                count++;
            }
        }

        int[] result = new int[count];
        int j =0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target){
                result[j] = i;
                j++;
            }
        }


       return result;

    }


    public static int countNumber(int[] arr, int target){

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== target){
                count++;
            }
        }
        return count;
    }

    public static void resetArray(int[] arr, int value){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }

    }


    public static void copyArray(int[]a, int[]b){

        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
    }



    public static boolean scoresIncreasing(double[] scores){


        for (int i = 0; i < scores.length-1; i++) {

            if(scores[i]>scores[i+1]){
                return false;
            }
        }

        return true;

    }

    /**
     *
     * @param target
     * @param arr
     * @return
     */
    public static int findLastNumberIndex(int target, int[] arr){

        for (int i = arr.length-1; i >=0; i--) {

            if(arr[i] == target){
                return i;
            }
        }


        int a = -1;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == target){
                a = i;
            }
        }

        return a;


    }


    /**
     * Exchange the value arr[a][b] and arr[c][d]
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[][] arr, int a, int b, int c, int d){

        int temp = arr[a][b];
        arr[a][b]=arr[c][d];
        arr[c][d]=temp;


    }



    /**
     * Exchange the value arr[a] and arr[b]
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr, int a, int b){

        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;


    }



}
