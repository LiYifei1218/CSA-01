package frq_practice1;

/**
 * Created by Jason (jason@bitacademy.cn) on 2019/12/23
 */
public class APLine
{
    private int a;
    private int b;
    private int c;

    public APLine (int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public double getSlope() {
        double slope = -((double)a / (double)b);
        return slope;
    }

    public boolean isOnLine(int x, int y) {
        if (((a * x) + (b * y) + c )== 0) {
            return true;
        }
        return false;
    }
}
