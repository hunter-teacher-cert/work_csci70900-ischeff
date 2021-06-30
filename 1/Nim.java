//01/Nim.java
//Collaborators: Marisa Laks, Michelle Best, Eric Wilson, Ian Scheffler
import java.util.Scanner;
import java.util.Random;

public class Nim {

  public static void main (String[] args) {
    //initialize and assign the variables
    int totalStones = 12;
    int playerStones = 0;
    int aiStones = 0;

    //create a scanner and explain the rules
    Scanner in = new Scanner(System.in);
    System.out.println("This is the game of Nim. We start with 12 stones in a bag. Players choose 1, 2, or 3 stones each turn. The object of the game is to choose the last stone. \n");

    //loop to keep playing until the break statements are reached. 
    while(true){

        //solicit input from the user
        System.out.print("Player 1: How many stones would you like to choose? Choose 1, 2, or 3: ");
        playerStones = in.nextInt();

        //update the total number of stones
        totalStones = totalStones - playerStones;
        System.out.println("\nRemaining stones: " + totalStones);
        System.out.println();

        //check to see if the user wins
      if (totalStones <= 0) {
        System.out.println("Congrats, you won!");
        break;
      }

        //generate a turn from the AI
        System.out.print("Player AI: How many stones would you like to choose? ");
        Random random = new Random();
        aiStones = random.nextInt(3) + 1; //fixed this based on Liam and Peter's example
        //how can we have the computer NOT draw more stones than are in the bag?
        //maybe we should use Peter and Liam's idea of optimizing the AI's choice at this point?
        System.out.println(aiStones);

        //update the total number of stones
        totalStones = totalStones - aiStones;
        System.out.println("\nRemaining stones: " + totalStones);
        System.out.println();

        //check to see if the AI wins
      if (totalStones <= 0) {
        System.out.println("Sorry, the computer won!");
        break;
      }
    }
  }
}
