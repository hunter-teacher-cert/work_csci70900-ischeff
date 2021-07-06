//This program was a collaboration among Eric Wilson, Dwayne Levene, and Ian Scheffler
class Fib{
  public static int fibLoop (int n){
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
      return (fibLoop(n-1) + fibLoop(n-2));
    }
    return 0;
  }//end of fibLoop

  public static void main(String[] args) {
      System.out.println("Hello world!");
      System.out.println(fibLoop(10));
    }//end main
}//end of class
