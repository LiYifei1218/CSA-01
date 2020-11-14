package chapter2.method;

import java.util.Scanner;

public class CelsiusAndFahrenheitTester
{

  public static void main(String[] args)
  {
    //Scanner input = new Scanner(System.in);
    System.out.println(fahrenheitToCelsius(40.0));
    System.out.println(celsiusToFahrenheit(120.0));
  }

  /** Convert from feet to meters */
  public static double fahrenheitToCelsius(double foot)
  {
    return (5.0 / 9) * (foot - 32);
  }

  /** Convert from meter to feet */
  public static double celsiusToFahrenheit(double meter)
  {

    return  (9.0 / 5) * meter + 32;
  }

}
