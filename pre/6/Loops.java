/*
* Write a program called Loops.java which has solutions to
* exercises 3, 4, and 5 from chapter 7 of Think Java.
*/

public class Loops{

 /*
  * Exercise 3: In Exercise 9 we wrote a recursive version of power,
  * which takes a double x and an integer n and returns x^n.
  * Now write an iterative method to perform the same calculation.
  */

  /* We weren't assigned Exercise 9 so I'm doing it below for practice. */
  public static double powerRecursive(double x, int n){
    if (n < 0){
      return powerRecursive(1/x, -n);
  } else if (n == 0){
      return 1;
  } else {
      return (x * powerRecursive(x, n - 1));
    }
  }

  /* Here is the power method in iterative form. */
  public static double power(double x, int n){
    double total = 1;
      for (int i = 0; i < Math.abs(n); i++){
        if (n > 0){
          total *= x; //I learned about the *= and /= operators online!
      } else {
          total /= x;
      }
    }
    return total;
  }

 /*
  *Exercise 4: Section 6.7 presents a recursive method that computes
  *the factorial function. Write an iterative version of factorial.
  */

  /* This is the recursive method from 6.7: */
  public static int factorialRecursive(int n){
    if (n == 0) {
      return 1;
    }
    n *= factorialRecursive (n - 1);
    return n;
  }

  /* Now here is the method written iteratively: */
  public static int factorial(int n){
    int product = 1;
    for (int i = n; i > 0; i--){
      product *= i;
    }
    return product;
  }

 /*
  * Exercise 5: One way to calculate e^x is to use the infinite
  * series expansion: e^x = 1 + x + x^2/2! + x^3/3! + x^4/4! + ...
  * The ith term in the series is x^i/i!
  */

 /*
  * 1) Write a method called myExp that takes x and n as parameters
  * and estimates e^x by adding the first n terms of this series.
  * You can use the factorial method from 6.7 or your iterative
  * version from the previous exercise.
  */

  public static double myExp(double x, int n){
     double sum = 1.0;
     for (int i = 1; i <= n; i ++){
       sum += power(x, i) / factorial(i);
     }
     return sum;
  }

  /*
   * 2) You can make this method more efficient if you realize that the
   * numerator of each term is the same at is predecessor multiplied
   * by x, and the denominator is the same as its predecessor multiplied
   * by i. Use this observation to eliminate the use of Math.pow and
   * factorial, and check that you get the same result.
   */

   public static double myExpSimple(double x, int n){
      double sum = 1.0;
      double a = 1.0; //sequence starts with numerator and denominator = 1
      double b = 1.0;
      for (int i = 1; i <= n; i ++){
        sum += (a *= x) / (b *= i);
      }
      return sum;
   }

  /*
   * 3) Write a method called check that takes a parameter, x, and displays
   * x, myExpSimple(x), and Math.exp(x). The output should look something like:
   * 1.0    2.708333333333333   2.718281828459045
   * You can use the escape sequence "//t" to put a tab between columns
   */

   public static void check(double x){
     double a = myExpSimple(x, 100);
     double b = Math.exp(x);
     System.out.println(x + "\t" + a + "\t" + b);
   }

  /*
   * 4) Vary the number terms in the series (the second argument check sends
   * to myExpSimple) and see the effect on the accuracy of the results. Adjust
   * this value until the estimated value agrees with the correct answer
   * when x is 1.
   */

  /*
   * I tried out a variety of values for n (the number of terms) when x = 1
   * ;at n = 10, it was close-ish, at 15, still closer; it wasn't until n = 17
   * that the two methods produced the same result (although technically
   * myExp displays one more digit than Math.exp; I'm not sure why, though!)
   * Also, as I learned in parts 5) and 6) below, these two outputs are only
   * identical in their display; the true value is still quite a ways off
   * when you consider the many digits that are NOT displayed on screen.
   */

  /*
   * 5) Write a loop in main that evokes check with the values of 0.1, 1.0,
   * 10.0 and 100.0. How does the accuracy of the results vary as x varies?
   * Compare the number of digits of agreement rather than the difference
   * between the actual and estimated values.
   */

  /*
   * It's clear that at n = 17 the outputs of myExpSimple and Math.exp() diverge
   * signficantly, although not always to the same degree. For instance, when
   * x = 0.1, myExp and Math.exp() agree on 16/17 digits. And at x = 1.0,
   * the two methods agree on 16/17 digits once again. However, at x = 10.0,
   * they appear to agree on only the first digit, and at 100.0 they agree on
   * precisely zero digits; indeed, at 100.0, the two results differ by over
   * 10 orders of magnitude. In other words, as the value of x increases,
   * myExpSimple and Math.exp() agree on fewer and fewer digits. At first,
   * I thought this it might have to do with the fact that double
   * variables can only hold so many bits; however, after playing around
   * with myExpSimple, I realized that if I increase n to include more terms in
   * the series, the accuracy increases dramatically. When n = 17 (which
   * made the values displayed at e^1 almost identical between myExpSimple
   * and Math.exp()), there is far less accuracy than at n = 100. At the
   * latter value, the two methods differ only by one degree at x = 10 as well,
   * where previously they shared only one digit. However, they still differ
   * by virtually every digit at x = 100, although the two outputs are now
   * of the same order of magnitude.

  /*
   * 6) Add a loop in main that checks myExpSimple with the values -0.1, -1.0,
   * -10.0, and -100.0. Comment on the accuracy.
   */

  /* Running negative numbers through check has much the same result; at first,
   * when n = 17, there was significant agreement (all but one digit) at x =
   * -0.1 and x = -1.0, but no agreement between the outputs at x = -10 and x =
   * -100. That said, when you increase the terms in the series by setting n to
   * 100, there is much more agreement; the values for x = -10 become identical
   * to 8 digits, and the values for  x = -100 are off by only 3 orders of
   * magnitude instead of 25 orders of magnitude. Presumably, if you keep
   * increasing n (aka adding more terms to the series) the values will
   * converge further at values of x further from zero. In short, for both
   * negative and positive x, the accuracy of myExpSimple decreases the further
   * you get from zero, but increases the more terms you add to the series.
   */

 /* Main is used to test the methods. */
  public static void main(String[] args){
    System.out.println("The tests for powerRecursive and power should be equal:");
    System.out.println(powerRecursive(2,2));
    System.out.println(power(2,2));
    System.out.println("The tests for factorialRecursive and factorial should be equal:");
    System.out.println(factorialRecursive(5));
    System.out.println(factorial(5));
    System.out.println("The following is the test for myExp:");
    for (double i = 0.1; i <= 100.0; i *= 10.0){
      check(i);
    }
    for (double i = -0.1; i >= -100.0; i *= 10.0){
      check(i);
    }
  }
}
