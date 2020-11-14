
public class TxyRandom {
    public static void main(String[] args) {
        double r = Math.random();
        int i = (int)(r * 3);
        //System.out.println(i);
        if (i == 0) System.out.println("黑");
        if (i == 1) System.out.println("白");
        if (i == 2) System.out.println("灰");
    }
}
