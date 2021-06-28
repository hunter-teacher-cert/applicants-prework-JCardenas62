import java.util.Scanner;

public class TempConvert {
  public static void main(String[] args) {
    double cel;
    double Fah;
    double fraction = 9.0 / 5.0;
    double add = 32;
    Scanner in = new Scanner(System.in);

    // ask for celsius
    System.out.println("Hello, I am here to help you convert from degrees Celsius to degrees Fahrenheit.");
    System.out.print("Enter the temperature in degrees Celsius: ");
    cel = in.nextDouble();

    //conversion and output
    Fah = (cel * fraction) + add;
    System.out.print("This converts to: ");
    System.out.printf("%.1f", Fah);
    System.out.println(" degrees Fahrenheit");

  }
}
