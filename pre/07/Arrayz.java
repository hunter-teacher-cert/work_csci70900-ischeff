/*
* Write a program called Arrays.java and in it solve
* exercises 1, 4 and 5 from ch 8 in Think Java
*/

/*
* Note: I named this file "Arrayz.java" since the name
* "Arrays.java" seemed to cause a conflict when I imported
* java.util.Arrays. (I checked with a friend of mine who
* works as a software engineer at Etsy, and he told me
* that he commonly switches "s" to "z" when this arises,
* hence the revised file name.)
*/

import java.util.Arrays;
import java.util.Random;

public class Arrayz{

 /*
  * Exercise 1: The goal of this exercise is to practice encapsulation
  * with some of the examples in this chapter.
  * 1) Starting with the code in Section 8.6, write a method
  * called powArray that takes a double array, a, and
  * returns a new array that contains the elements of a squared.
  * Generalize it to take a second argument and raise the elements
  * of a to the given power.
  */

 /* This method takes an array and returns another with the elements squared. */
  public static double[] powArray(double[] a){
    double[] set = new double[a.length];
    for (int i = 0; i < a.length; i++){
        set[i] = Math.pow(a[i], 2.0);
    }
    return set;
  }

  /*
   * This method is a generalized version that raises the elements of the
   * original array to a given power, dictated by the extra parameter.
   */
   public static double[] powArrayGeneral(double[] a, double n){
     double[] set = new double[a.length];
     for (int i = 0; i < a.length; i++){
         set[i] = Math.pow(a[i], n);
     }
     return set;
   }

  /* This is the method from the text for printing an array */
   public static void printArray(double[] a) {
     System.out.print("{" + a[0]);
     for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
     }
     System.out.println("}");
   }

   /*
    * 2) Starting with the code in Section 8.10, write a method
    * called histogram that takes an int array of scores from 0 to
    * (but not including) 100, and returns a histogram of 100 counters.
    * Generalize it to take the number of counters as an argument.
    */

   /*
    * First, I'm using the code from 8.7 to create an array with "random"
    * values from 0 to 99, which I'll use as test input for the histogram.
    */

    public static int[] randomArray(int size) {
      Random random = new Random();
      int[] a = new int[size];
      for (int i = 0; i < a.length; i++) {
          a[i] = random.nextInt(100);
        }
      return a;
    }

    /*
     * Now, I'm writing the method for the histogram, which will take the
     * random scores from the previous method.
     */

     public static int[] histogram(int[] scores){
       int[] counts = new int[100];
       for (int score : scores) {
         counts[score]++;
       }
       return counts;
     }

    /*
     * Finally, here is the more general version!
     */

     public static int[] histogramGeneral(int[] scores, int n){
       int[] counts = new int[n];
       for (int score : scores) {
         if (score > counts.length){
           System.out.println("Score is " + score);
           System.out.println("Counts.length is " + counts.length);
           throw new IllegalArgumentException("Score is greater than counts.length.");
         }
         counts[score]++;
       }
       return counts;
     }


    /*
     * Exercise 4: Write a method called indexOfMax that takes an array of
     * integers and returns the index of the largest element.
     * Can you write this method using an enhanced for loop? Why or why not?
     */

     public static int indexOfMax (int[] a){
       int index = 0;
       for (int i = 0; i < a.length; i++){
         if (a[i] > a[index]){
           index = i;
         }
       }
       return index;
     }

    /*
     * Initially, I thought I could not rewrite this using an enhanced
     * for loop, since ThinkJava says, "Enhanced for loops often make the
     * code more readable, especially for accumulating values. But they
     * are not helpful when you need to refer to the index, as in search
     * operations." However, after poking around on stackoverflow, I came
     * across the idea that you could use a counter before the "for" statement,
     * so that you can keep track of the index. The example looked like this:
     *  int i = 0;
     *  for (int s : ss){
     *  // Some code
     *    System.out.println(i);
     *
     *    i++;
     * }
     * Looking this over, it makes sense: you can cycle through each
     * index element, while also checking each value in your array.
     *
     * In short, yes, I think you can use an enhanced for loop
     * for this method, but you have to modify it a bit! (Note that I changed
     * the name of the array input from a to "inputs" since input : inputs
     * makes more sense in the enhanced loop than b : a or something)
     *
     * Note: I tested this in main, and it appears to equal the result of
     * indexOfMax, so I think that yes, this works!
     */

     public static int indexOfMaxEnhancedForLoop (int[] inputs){
       int index = 0;
       int i = 0;
       for (int input : inputs){
         if (inputs[i] > inputs[index]){
           index = i;
         }
         i++;
       }
       return index;
     }

    /*
     * Exercise 5: Write a method called sieve that takes an integer parameter,
     * n, and returns a boolean array that indicates, for each number from
     * 0 to n - 1, whether the the number is prime.
     */

    /*
     * Note: Since Think Java referred me to the Wikipedia page for the Sieve
     * of Eratosthenes, the code below is largely inspired by the pseudo-
     * code on that page, which translated the algorithm that Eratosthenes
     * developed into a series of rules for a computer program to follow.
     */

     public static boolean[] sieve(int n){

       //initialize an array of n size to false
       boolean[] isPrime = new boolean[n];

       //make all but 0 and 1 (which are not prime or composite) true
       for (int i = 2; i < n; i++)
         isPrime[i] = true;

       //set all int >= 2 that are products of other integers to false
       for (int a = 2; a * a <= n; a++){ //could also be written as a <= Math.sqrt(n)
         if (isPrime[a] == true) {
           for (int j = a * a; j < n; j += a){
             isPrime[j] = false;
           }
         }
       }
       return isPrime;
     }

  /* Main is used to test the methods. */
  public static void main(String[] args){
    System.out.println("Test.");
    double[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(Arrays.toString(a));
    double[] b = powArray(a);
    System.out.println(Arrays.toString(b));
    double[] c= powArrayGeneral(a, 3);
    System.out.println(Arrays.toString(c));
    printArray(a);
    printArray(b);
    printArray(c);
    System.out.println(Arrays.toString(randomArray(100)));
    int[] d = randomArray(100);
    System.out.println(Arrays.toString(histogram(d)));
    System.out.println(Arrays.toString(histogramGeneral(d, 100)));
    //System.out.println(Arrays.toString(histogramGeneral(d, 10)));
    System.out.println(Arrays.toString(sieve(10)));
    int[] e = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(indexOfMax(e));
    System.out.println(indexOfMaxEnhancedForLoop(e));
  }
}
