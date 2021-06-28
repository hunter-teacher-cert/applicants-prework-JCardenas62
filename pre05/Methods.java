import java.io.*;
import java.util.*;
//Exercise 2: methods isDivisible
public class Methods{
  public static boolean isDivisible(int n, int m) {
      if (n % m == 0) {
          return true;
      } else {
          return false;
      }
  }
//Main programing to print lines
  public static void main(String[] args){
    System.out.println(isDivisible(4, 2));
    System.out.println(isTriangle(1,3,4));
    System.out.println(ack(3,3));

  }
//Exercise 3: methods isTriangle
public static boolean isTriangle (int a, int b, int c){
    if (a > b + c || b > c + a || c > b + a) {
          return false;
      } else {
          return true;
      }
  }
//Exercise 8: Ackermann
  public static int ack (int m, int n) {
    if (m==0) {
      return n+1;
    } else if (m>0 && n==0){
        return (ack (m-1, 1));
    } else if (m > 0 && n > 0) {
        return (ack (m - 1, ack (m, n - 1)));
    } else {
      return (-2);
    }
  }

}
