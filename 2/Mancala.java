//This exercise was made by Daiana, Ian, and Mr. H.
//Note: Ian got some inspiration from Emma Wingreen's code!
//Note: I'm trying to rewrite this so the prior code is commented out below.
import java.io.*;
import java.util.*;

public class Mancala{

  //static Scanner in = new Scanner (System.in);

  //method to display the board
  public static void printBoard(int[] a) {
    //prints AI mancala
    System.out.print("\t{" + a[13] + "}");
    //prints AI pits
    for (int i = 12; i > 6; i--) {
        System.out.print(" | " + a[i]);
    }
    System.out.print(" |");
    //skips to the next line
    System.out.println("");
    //prints human player pits and aligns them with AI pits
    System.out.print("\t    | " + a[0]);
    for (int i = 1; i < 6; i++) {
        System.out.print(" | " + a[i]);
    }
    //prints human player Mancala and skips a line
    System.out.print(" | {" + a[6] + "}" + "\n" + "\n");
  }//end of printBoard

  //method to check if the human player has no more stones
  public static Boolean didPlayerWin(int[] a){
    int playerSum = 0;
    for(int i = 0; i < 5; i++){
      playerSum += a[i];
    }
    if (playerSum == 0){
      System.out.println("Congratulations, you win!");
      return true;
    } else return false;
  }//end of didPlayerWin

  //method to check if the AI player has no more stones
  public static Boolean didAIWin(int[] a){
    int aiSum = 0;
    for(int i = 7; i < 13; i++){
      aiSum += a[i];
    }
    if (aiSum == 0){
      System.out.println("The computer wins! Better luck next time.");
      return true;//should this go before the println?
    } else return false;
  }//end of didAIWin

  //public static Boolean isPitEmpty()

  public static int playerTurn(){
    //Create a scanner for input
    Scanner in = new Scanner(System.in);
    //create a variable to hold user input
    int pit;
    //Create loop to check user input is valid (shoutout to Emma Wingreen!)
    do{
      //solicit user input
      System.out.println("From which pit would you like to pick stones?\n");
      //collect the user input
      pit = in.nextInt();
      //error message for invalid user input
      if (pit < 0 || pit > 5){
        System.out.println("Remember, the pits are numbered 0 to 5! Try again!\n");
      }
    } while(pit < 0 || pit > 5);
    return pit;
  } //end of playerTurn

  //public static void AITurn(){

//} end of AI Turn

  public static void main(String[]args){
    //Introduce the game!
    System.out.println("Let's play Mancala!\n");
    System.out.println("Here is the board:\n");
    //Initialize an array with the starting values of the board
    int[] initialBoard = {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
    //display the starting conditions of the board
    printBoard(initialBoard);
    //create variable for the pit (i.e., index)
    int pit;
    //create variable for number of stones in each pit
    int stones;//create for player and others?
    //check if the game is over (i.e., one player has no more stones)
    //System.out.println(didPlayerWin(initialBoard));
    //System.out.println(didAIWin(initialBoard));
    System.out.println("You go first.\n");
    System.out.println("Your stones are in the bottom row.\n");
    System.out.println("The pits are numbered 0 to 5, from left to right.\n");
    playerTurn();
    //while (didPlayerWin(initialBoard) == false && didAIWin(initialBoard) == false){
      //invoke Player Turn
      //invoke AI Turn
    //}//end of while loop
  }//end of main
} //end of class






























/*import java.io.*;
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


//Note: if you want to switch this to one array, you could create functions to check if the pit is valid (like if it's a certain number it's not valid--just make that function really simple)
*/
