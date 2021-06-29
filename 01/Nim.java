/*
 * Welcome to the land of Nim! This game will test your wits against a
 * computer that will choose random numbers, and hopefully give you a run
 * for your money.
 *
 * The rules of Nim are as follows: a bag has 12 stones. You (or the AI) can
 * remove 1, 2, or 3 stones each turn from the bag. The player who removes the
 * last stone, thereby reducing the number of stones in the bag to zero, is the
 * winner. You cannot choose NOT to remove a stone on your turn.
 *
 * We have been tasked with writing a program that will...
 * a) prompt the user for how many stones (1-3) they wish to remove each turn
 * b) tell the user how many stones the AI removes and how many stones remain
 * c) keep the game going (i.e., keep soliciting input from the user and
 * generating output from the AI) until someone ones
 * d) announce the winner
 *
 * This program was crafted by Marisa, Melissa (Best), Eric, and Ian
 */

import java.util.Scanner; // we need to solicit user input
import java.util.Random; // we need to generate random numbers

public class Nim {

/*
 * The method below is modeled on the "roll" method from the craps prework.
 */
 public static int aiTurn(int n){
   Random random = new Random();
   int number = random.nextInt(n) + 1;
   return number;
 }
 /*
  * The method below is modeled on the "roll" method from the craps prework.
  */
  public static int playerTurn(){ //this method will be the player's turn
    Scanner in = new Scanner(System.in);
    System.out.println("Player 1: How many stones would you like to choose?");
    int playerStones = in.nextInt();
    return playerStones;
  }
/*
  public static void winCondition(int n){
    if (n <= 0){
      System.out.println("Congratulations, you win!");
    }
  }

  public static void round(){ //this method will run a round, and test for wins
    int totalStones = 12;
    int playerStones = 0;
    int aiStones = 0;
    playerTurn();

  }
*/
  public static void main (String[] args) {
    int totalStones = 12; //we start with twelve stones
    System.out.println("This is the game of Nim. We start with 12 stones in a bag.");
    System.out.println("Players choose 1, 2, or 3 stones each turn.");
    System.out.println("The object of the game is to choose the last stone.");
    System.out.println(aiTurn(2));
    System.out.println(aiTurn(2));
    System.out.println(aiTurn(2));
    System.out.println(aiTurn(2));
    playerTurn();
  }
}
