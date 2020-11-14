package chapter2.method;

public class FeetAndMetersTester
{

  public static void main(String[] args)
  {
    System.out.println(feetToMeter(10));
    System.out.println(meterToFeet(65));
  }

  /** Convert from feet to meters */
  public static double feetToMeter(double foot)
  {
    return 0.305 * foot;
  }

  /** Convert from meter to feet */
  public static double meterToFeet(double meter)
  {
    return 3.279 * meter;
  }

}
