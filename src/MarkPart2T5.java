import java.util.Scanner;

public class MarkPart2T5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        pre(arr, k - 1);
    }

    public static void pre(int[] ar, int t) {
        int len = ar.length;
        int preAr[] = new int[len];
        if (t >= 0){
            for (int i = 0; i < len; i++) {
                for (int j = 0; j <= i; j++)
                    preAr[i] += ar[j];
                if (t == 0)
                    System.out.println(preAr[i]);
            }
            t--;
            pre(preAr, t);
        }
    }
}
