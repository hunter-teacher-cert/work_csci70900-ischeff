//This program was a collaboration among Eric Wilson, Dwayne Levene, and Ian Scheffler
import java.io.*;
import java.util.*;

class Fib{
  public static int fibSeq (int n){
    if (n < 0){
      System.out.println("Only positive inputs please!");
    }
    if (n == 0){
      return 0;
    }
    if (n == 1){
      return 1;
    }
    if (n > 1){
      return (fibSeq(n-1) + fibSeq(n-2));
    }
    return 0;
  }//end of fibSeq

  public static int fibTerms(){
    Scanner in = new Scanner(System.in);
    System.out.println("How many terms of the sequence would you like to see?");
    int numberOfTerms = in.nextInt();
    return numberOfTerms;
  }

  public static void fibLoop(int n){
    int result = 0;
    for(int i = 0; i < n; i++){
      System.out.println("Term: " + i + " | Value: " + fibSeq(i));
    }
  }//end of fibLoop

  public static void main(String[] args) {
      //System.out.println("This program will recursively implement the Fibonacci sequence!");
      //System.out.println(fibSeq(10));
      fibLoop(fibTerms());//anything more than 40 terms runs pretty slow!
    }//end main
}//end of class
