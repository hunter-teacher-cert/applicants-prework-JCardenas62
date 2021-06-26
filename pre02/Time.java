public class Time {
  public static void main(String[] args){
    int hour = 21;
    int minute = 13;
    int second = 35;
    int midsec = 24 *60 * 60;
    int x = (hour * 60 * 60) + (minute * 60) + second;
    double percentage= 76415.0 / 86400.0;
    int hourf = 22;
    int minf = 07;
    int secf = 25;
    int totsecf = (hourf * 60 * 60) + (minf * 60) + secf ;
    System.out.print("The number of seconds since midnight is: ");
    System.out.println((hour * 60 * 60) + (minute * 60) + second);
    System.out.print("The number of seconds remaining in the day is: ");
    System.out.println((midsec) - ((hour * 60 * 60) + (minute * 60) + second));
    System.out.print("The perecentage of day that has passed is: ");
    System.out.printf("%.2f", (percentage) * 100);
    System.out.println("%");
    System.out.print("The number of seconds elapsed since the beginning of this exercise: ");
    System.out.println(totsecf - x);

  }
}
