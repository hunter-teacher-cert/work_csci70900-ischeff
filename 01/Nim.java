//01/Nim.java

//Collaborators: Marisa Laks, Michelle Best, Eric Wilson, Ian Scheffler


import java.util.Scanner;
import java.util.Random;


public class Nim {

  public static void main (String[] args) {
    int totalStones = 12;
    int playerStones = 0;
    int aiStones = 0;

    Scanner in = new Scanner(System.in);
    System.out.println("This is the game of Nim. We start with 12 stones in a bag. Players choose 1, 2, or 3 stones each turn. The object of the game is to choose the last stone. \n");

    while(totalStones >= 0){ // we previously had != 0, which meant that negative numbers didn't stop the loop

        System.out.print("Player 1: How many stones would you like to choose? Choose 1, 2, or 3: ");
        playerStones = in.nextInt();

        totalStones = totalStones - playerStones;
        System.out.println("\nRemaining stones: " + totalStones);
        System.out.println();

      if (totalStones <= 0) {
        System.out.println("Congrats, you won!");
        break;
      }

        System.out.print("Player AI: How many stones would you like to choose? ");
        Random random = new Random();
        aiStones = random.nextInt(2) + 1;
        System.out.println(aiStones);

        totalStones = totalStones - aiStones;
        System.out.println("\nRemaining stones: " + totalStones);
        System.out.println();

      if (totalStones <= 0) {
        System.out.println("Sorry, the computer won!");
        break;
      }
    }
  }
}
