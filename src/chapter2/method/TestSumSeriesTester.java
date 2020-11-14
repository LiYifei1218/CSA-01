package chapter2.method;

public class TestSumSeriesTester
{

  public static void main(String[] args)
  {

    //Display a m(i) result table, i=1,2,3...20
    System.out.println("i               m(i)");
    System.out.println("-------------------");
    for (int i = 1; i <= 20; i++) {
      System.out.println(i + "              " + m(i));
    }
  }
  
  /** m method */
  public static double m(double i)
  {
    double sum = 0.0;
    for (double j = 1; j <= i; j++) {
      sum += (j / (j + 1));
    }
    return sum;
  }
  
  
}
