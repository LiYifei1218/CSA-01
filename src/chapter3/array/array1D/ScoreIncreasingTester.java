package chapter3.array.array1D;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/10/25
 */
public class ScoreIncreasingTester
{
    public static void main(String[] args)
    {
        //test example program here

        //test data
        double[] a = {50, 60, 70, 80, 90, 100};
        double[] b = {50, 50, 80, 80, 90, 100};
        double[] c = {50, 60, 90, 80,100, 110};

        //call the method 'scoresIncreasing()'
        System.out.println(scoresIncreasing(a)); // -> true
        System.out.println(scoresIncreasing(b)); // -> true
        System.out.println(scoresIncreasing(c)); // -> false
    }

    public static boolean scoresIncreasing(double[] scores)
    {

        //write your code here
        boolean flag = true;
        for (int i = 0; i < scores.length - 1; i++) {
            //int t = int(i);
            if (scores[i] <= scores[i+1]){
                continue;
            }
            else flag = false;
        }

        return flag;

    }
}
