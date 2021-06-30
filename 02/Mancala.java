import java.io.*;
import java.util.*;
import java.util.Scanner; //not necessary
import java.util.Random;  //not necessary

public class Mancala{

  //method for the player's turn
  public static int playerInput{
    Scanner in = new Scanner(System.in);
    do {
      //ask the user to pick stones from a pit
      System.out.println("From which pit would like to pick stones? Please pick a number from 1 to 6.");
      playerPitChoice = in.nextInt();

      //check to see if the input is invalid
      if (playerPit != 1 && != 2 && != 3 && != 4 && != 5 && != 6){
      System.out.println("That's not a valid pit. Pick a number from 1 to 6!");
      }//end if statement to catch invalid input
    } while (playerPit != 1 && != 2 && != 3 && != 4 && != 5 && != 6);
    return playerPitChoice;
  }//end player input

  public static int aiInput{
    int aiPitChoice;
    aiPitChoice =0;
    while (aiPitChoice==0 ){
      aiPitChoice = aiBoard[rand.nextInt(5) +1]
    }
    //to choose a pit to pick from (at random); we need to check tom ake sure that the pit actually has stones in it; we can do this with a loop
  }//end aiTurn

  public static void main (String[]args){
    int aiBoard[]={0,4,4,4,4,4,4};
    int playerBoard[]={0,4,4,4,4,4,4};
    Random rand = new Random();
    System.out.println("Welcome to Mancala! Here is the board:");
    board();



  }//end main
public static void board{
  // will this print or will i have to make this a method? i am using things from the main :/
  System.out.println("ai position: 1 2 3 4 5 6");
  System.out.println("ai:"+ Arrays.toString(aiBoard));
  System.out.println("        ai:"+ Arrays.toString(aiBoard));
  System.out.println("             "Arrays.toString(playerBoard)+ "player");
  System.out.println("              1 2 3 4 5 6: player position");
// display(example)
// ai poition:1 2 3 4 5 6
//         ai:4 4 4 4 4 4
//            4 4 4 4 4 4:player
//            6 5 4 3 2 1:player position
//  Mancala: ai= 0 player= 0
// last stone droped: ai position: 2

}//end board




}//end class



// variables: 2 arrays for players (ai and player)
// indeces are 0-6 (0 for each player is the mancala)
//initialize all except [0] to 4. (4 stones to start)
// main method to initiate game
// method for AI turn (random pick of pit)
// and method for player turn (solicit input for which pit you want to pick from)
// method for checking gameOver (when one side has no more stones - when sum of all indices not including mancala is 0, that equals empty)
// method for checking if last stone dropped in an empty pit on your side and the other side is not empty
// variable for what you first pick up(what will be subtracted and added to each index)



//we can just print the [0] index for each array for the score
