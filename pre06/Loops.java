// exercises 3
public class Loops{
  public static double power(double x, int n){
    if (n==0){
        return 1;
    }
    int i = 1;
    double num = 1.0;
    while ( i <= n) {
        num = num * x;
        i = i + 1;
    }
    return num;
  }

//exercise 4
  public static int factorial (int n) {
    if (n == 0) {
      return 1;
    }
    int numfact = n;
    while (n > 1) {
      numfact = numfact * (n-1) ;
      n = n-1;
    }
    return numfact;
  }

//main
public static void main (String[] args ) {
  System.out.println (power(5.0, 3));
  System.out.println (factorial (4));

  }
}
