package chapter2.method;

public class PentagonalNumberTester
{
	
  public static void main(String[] args)
  {

    //Display the first 100 pentagonal number
    for (int i = 1; i <= 100; i++) {
      System.out.println(getPentagonalNumber(i));
    }
   
  }
  
  /**getPentagonalNumber method **/
  public static int getPentagonalNumber(int n)
  {
    return n * (3 * n - 1) / 2;
  }
  
  
}
