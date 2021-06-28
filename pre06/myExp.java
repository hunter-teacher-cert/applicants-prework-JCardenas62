
public class myExp {
//Had to separate into two files. Kept getting confused
//and kept getting errors.

//Initial set-up
     public static int factorial (int n) {
        if (n == 0) {
           return 1;
        }

        int temp = n;
        while (n > 1 ) {
           temp = temp * (n-1);
           n=n-1;
        }
        return temp;
     }



     public static double pow (double x, int n) {
        if (n==0) {
           return 1;
        }

        int i =1;
        double temp = 1.0;
        while ( i <= n) {
           temp = temp * x;
           i = i + 1;
        }
        return temp;
     }

// Exercise 5.1
   public static double myexp (double x) {
      int i =0 ;
      double temp = 0.0;
      while (i < 11) {
         temp = temp + ( pow (x, i))/ factorial (i) ;
         i =i +1;
      }
      return temp;
   }

// Exercise 5.2

   public static double myexp (double x, int accuracy) {
      int i = 1;
      double temp =0.0;
      double num =1.0;
      double den = 1.0;

      while (i <= accuracy) {
         temp= temp + (num/den);
         num = num * x;
         den = den * i;
         i = i+1;
      }
      return temp;
}

//Exercise 5.3

   public static void check (double x) {
      int i = 1;
      while (i<2) {
         System.out.println (x + "\\t" + (Math.exp(x)) + "\\t" + (myexp(x,20)) );
         x = x+1.0;
         i = i+ 1;
      }
   }


   public static void check (int x, int n, int p) {
//    'x' is the power to which 'e' will be raised
//    'n' is the accuracy level for myexp
//    'p' is the no. of rows in the output (the table)
//    'i' is a loop variable
      int i =1;
      while (i < p) {
         System.out.println (x + "\t" + (Math.exp(x)) + "\t" + (myexp(x,n)) );
         x=x+1;
         i=i+1;
      }
   }



// Exercise 5.4
   public static int Precision () {
      double tempTry = myexp (1.0, 2) ;
      double actuall = Math.exp (1.0) ;
      int i =1;
      while (tempTry != actuall) {
         tempTry = myexp (1,i);
         i = i+1;
      }
      return i;
   }

   public static void main ( String [] args){
      System.out.println (myexp (1,20));
      check (1, 17, 10);
      System.out.println (Precision());

// Exercise 5.5
      double i = 0.1;
      while (i<101.0) {
         check (i);
         i = i * 10;
      }

// Exercixe 5.6
      double j = -0.1;
      while (j > (-101.0)) {
         check (j);
         j = j * 10.0;
      }
   }

}
