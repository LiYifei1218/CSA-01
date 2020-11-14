import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MarkPart2T4 {
    public static void main(String[] args) throws IOException {

        InputStream fin = new FileInputStream("/Users/liyifei/IdeaProjects/csa01/src/yinyang.in");
        //Scanner input = new Scanner(System.in);

        int n = fin.read();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fin.read();
        }
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                if (arr[i] + arr[j] == 0)
                    ans++;
        System.out.println(ans);
    }
}
