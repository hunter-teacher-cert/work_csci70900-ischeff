/* You will write a program that will play a simplified game of craps. */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* There should be at least three static methods in addition to main. */

public class Craps{

 /*
  * One named roll which accepts an integer parameter and returns a
  * random number between 1 and that number, inclusive.
  */

  public static int roll(int n){
    Random random = new Random();
    int number = random.nextInt(n) + 1;
    return number;
  }

 /*
  * One should be named shoot which accepts two parameters--a number
  * of dice and the maximum value for those dice and returns the result
  * of rolling those dice.
  */

  public static int shoot(int numberOfDice, int dieMaxValue){
    int totalDiceValue = 0;
    for (int i = 0; i < numberOfDice; i++){
      totalDiceValue += roll(dieMaxValue);
    }
    return totalDiceValue;
  }

 /*
  * One should be named round. It should accept no parameter and
  * should return something to indicate if the shooter of the round
  * wins or loses.
  */

  public static void round(){
    int rollTotalValue = shoot(2, 6);
    System.out.println("\nYou rolled " + rollTotalValue + ".");
    if (rollTotalValue == 2 || rollTotalValue == 3 || rollTotalValue == 12){
      System.out.println("That's craps. You lose!\n");
    } else if (rollTotalValue == 7 || rollTotalValue == 11) {
      System.out.println("That's a natural! You win!\n");
    } else {
      int point = rollTotalValue;
      System.out.println(point + " is now the point.");
      while (true){
        rollTotalValue = shoot(2, 6);
        System.out.println("You rolled " + rollTotalValue + ".");
        if (rollTotalValue == 7){
          System.out.println("Sorry, you lose!\n");
          break;
        } else if (rollTotalValue == point){
          System.out.println("Congratulations, you win!\n");
          break;
        }
      }
    }
  }

 /*
  * The main program should take a parameter from the command line,
  * play that many rounds and as it plays indicate each time
  * the shooter wins or loses. The program should also print out
  * the status of the rounds as they occur.
  */

  public static void main(String[] args){
    System.out.println("Welcome to the craps table.\n");
    Scanner in = new Scanner(System.in);
    System.out.println("How many rounds would you like to play?");
    //Should I throw an exception if the input is not an integer?
    int rounds = in.nextInt();
    for (int i = 0; i < rounds; i++){
      round();
    }
  }
}
