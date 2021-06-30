/*
* Write a program with methods that solve exercises 2, 3, and 8
* from Think Java Chapter 6
*/

public class Methods {

    /*
    * Exercise 2: Write a method named isDivisible that takes two integers,
    * n and m, and that returns true if n is divisible by m, and false
    * otherwise.
    */
    public static Boolean isDivisible(int n, int m){
      return (m != 0 && n % m == 0);
    }

   /* Exercise 3: Write a method named isTriangle that takes three integers
    * as arguments and returns either true or false, depending
    * on whether you can or cannot form a triangle from sticks
    * with the given lengths. The point of this exercise is to
    * use conditional statements to write a value method.
    */
    public static Boolean isTriangle(int a, int b, int c){
      if (a <= 0 || b <= 0 || c <= 0){
          return false;
      } else if (a + b < c) {
          return false;
      } else if (a + c < b){
          return false;
      } else if (b + c < a){
          return false;
      } else {
          return true;
      }
    }

   /* Exercise 8: Write a method called ack that takes two int s as parameters
    * and that computes and returns the value of the Ackermann function.
    */
    public static int ack(int m, int n){
      if (m == 0) {
        return n + 1;
    } if (m > 0 && n == 0){
        return ack(m - 1, 1);
    }
     /* Since the following line will run if the inputs are negative,
      * negative inputs lead to a stackoverflow error which seems appropriate
      * since the Ackermann function only takes nonzero integers. (I'm not
      * sure yet how to limit the inputs of a method to nonzero integers.)
      */
      return ack(m - 1, ack(m, n - 1));
  }

 /* Main is used to test the methods. */
  public static void main(String[] args) {
    System.out.println("The tests for isDivisible should read: ");
    System.out.println("false true true true true true true\n");
    System.out.println("Tests for isDivisible:");
    System.out.print(isDivisible(10, 0) + " ");
    System.out.print(isDivisible(10, 1) + " ");
    System.out.print(isDivisible(10, 2) + " ");
    System.out.print(isDivisible(10, 5) + " ");
    System.out.print(isDivisible(10, 10) + " ");
    System.out.print(isDivisible(10, -10) + " ");
    System.out.println(isDivisible(-10, -10) + "\n");
    System.out.println("The tests for isTriangle should read: ");
    System.out.println("true true true false false true\n");
    System.out.println("Tests for isTriangle:");
    System.out.print(isTriangle(3, 4, 5) + " "); //pythagorean triple
    System.out.print(isTriangle(5, 12, 13) + " "); //pythagorean triple
    System.out.print(isTriangle(9, 41, 40) + " "); //pythagorean triple
    System.out.print(isTriangle(0, 0, 0) + " ");
    System.out.print(isTriangle(0, 10, 100) + " ");
    System.out.println(isTriangle(10, 10, 10) + "\n"); //equilateral triangle
    System.out.println("The tests for ack should read: ");
    System.out.println("1 3 4 5 13 29\n");
    System.out.println("Tests for ack:");
    System.out.print(ack(0, 0) + " ");
    System.out.print(ack(1, 1) + " ");
    System.out.print(ack(1, 2) + " ");
    System.out.print(ack(2, 1) + " ");
    System.out.print(ack(3, 1) + " ");
    System.out.println(ack(3, 2) + " ");
  }
}
