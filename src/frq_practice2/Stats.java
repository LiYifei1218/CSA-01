package frq_practice2;

import java.util.ArrayList;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/12/22
 */
public class Stats
{
    private ArrayList<ScoreInfo> scoreList;

    public boolean record(int aScore)
    {

        //write your code here
        for (int i = 0; i < scoreList.size(); i++) {
            if (scoreList.get(i).getScore() == aScore) {
                scoreList.get(i).increment();
            }
            else {
                ScoreInfo t = new ScoreInfo(aScore);
                scoreList.add(t);
            }
        }
        return false;

    }

    public void recordScores(int[] stuScores)
    {
        for (int i = 0; i < stuScores.length; i++) {
            record(stuScores[i]);
        }
       //write your code here
    }

}
