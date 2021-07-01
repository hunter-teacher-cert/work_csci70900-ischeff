//This exercise was made by Daiana, Ian, and Mr. H.
//Note: Ian got some inspiration from Emma Wingreen's code for soliciting valid input!
import java.io.*;
import java.util.*;

public class Mancala{

  //Initialize an array with the starting values of the board
  static int[] board = {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
  //create a global variable for the pit, which will also serve as index
  static int pit;
  //create a global variable for stones
  static int stones;
  //Create a scanner for input
  static Scanner in = new Scanner(System.in);

  //method to display the board
  public static void printBoard(int[] a) {
    //prints player two's mancala with brackets around it
    System.out.print("\t{" + a[13] + "}");
    //prints player two's pits and separates them with lines
    for (int i = 12; i > 6; i--) {
        System.out.print(" | " + a[i]);
    }
    System.out.print(" |");
    //skips to the next line
    System.out.println("");
    //prints player one pits, separates them with lines and aligns them
    System.out.print("\t    | " + a[0]);
    for (int i = 1; i < 6; i++) {
        System.out.print(" | " + a[i]);
    }
    //prints player one Mancala with brackets around it and skips a line
    System.out.print(" | {" + a[6] + "}" + "\n" + "\n");
  }//end of printBoard

  //method to check if player one has no more stones
  public static Boolean didPlayerOneWin(int[] a){
    //sums the stones in the pits on player one's side of the array
    int playerOneSum = 0;
    for(int i = 0; i < 6; i++){
      playerOneSum += a[i];
    }
    //sets a condition for winning--no more stones on player one's side
    if (playerOneSum == 0){
      System.out.println("Congratulations, Player One, you win!");
      return true;
    } else return false;
  }//end of didPlayerOneWin

  //method to check if player two has no more stones
  public static Boolean didPlayerTwoWin(int[] a){
  //sums the stones in the pits on player two's side of the array
    int playerTwoSum = 0;
    for(int i = 7; i < 13; i++){
      playerTwoSum += a[i];
    }
    //sets a condition for winning--no more stones on player two's side
    if (playerTwoSum == 0){
      System.out.println("Congratulations, Player Two, you win!");
      return true;//should this go before the println?
    } else return false;
  }//end of didplayerTwoWin

  //method to solicit player one's input
  public static int playerOneInput(){
    //Create loop to check user input is valid (shoutout to Emma Wingreen!)
    do{
      //solicit user input
      System.out.println("Player 1, from which pit would you like to pick stones?\n");
      //collect the user input
      pit = in.nextInt();
      //error message for invalid user input (invalid pit)
      if (pit < 0 || pit > 5){
        System.out.println("Remember, the pits are numbered 0 to 5! Try again!\n");
      }
      //error message for invalid user input (no stones in pit)
      if (board[pit] == 0){
        System.out.println("You can't pick a pit without stones! Try again!\n");
        playerOneInput();
      }
    } while(pit < 0 || pit > 5);
    //System.out.println(pit);
    return pit;
  } //end of playerInput

  //method for playe one's turn, taking their choice of pit and the board as input
  public static void playerOneTurn(int pit, int[] board){
    //set stones equal to number in pit
    stones = board[pit];
    //loop through array, depositing stones, but skipping player two's mancala
    for (int i = 1; i < (stones + 1); i++){
      if (board[i] == board[13]){
        continue;
    } else {
      board[pit + i]++;
    }
    //set stones in pit to zero
    board[pit] = 0;
  }//end of for loop

    //check to see if player deposited final stone in mancala; if so, go again!
  }//end playerTurn

  //method to solicit player two's input
  public static int playerTwoInput(){
    //Create loop to check user input is valid (shoutout to Emma Wingreen!)
    do{
      //solicit user input
      System.out.println("Player 2, from which pit would you like to pick stones?\n");
      //collect the user input
      pit = in.nextInt();
      //error message for invalid user input (invalid pit)
      if (pit < 7 || pit > 12){
        System.out.println("Remember, your pits are numbered 7 to 12! Try again!\n");
      }
      //error message for invalid user input (no stones in pit)
      if (board[pit] == 0){
        System.out.println("You can't pick a pit without stones! Try again!\n");
        playerTwoInput();
      }
    } while(pit < 7 || pit > 12);
    //System.out.println(pit);
    return pit;
  } //end of playerInput

  //method for the player's turn, taking their choice of pit and the board as input
  public static void playerTwoTurn(int pit, int[] board){
    //set stones equal to number in pit
    stones = board[pit];
    //loop through array, depositing stones, but skipping player two's mancala
    for (int i = 1; i < (stones + 1); i++){
     //try{
        if (board[i] == board[6]){
        continue;
    } else {
      board[pit + i]++;
    }
  //}//catch(ArrayIndexOutOfBoundsException e){
    // i = 0;
   //}
  }//end of for loop
  //set stones in pit to zero
    board[pit] = 0;
    //System.println("The last pit in which stones were placed is " + board[pit + stones] + " .");
    //check to see if player deposited final stone in mancala; if so, go again!
  }//end playerTurn
  public static void main(String[]args){
    //Introduce the game!
    System.out.println("Let's play Mancala!\n");
    System.out.println("Here is the board:\n");
    //display the starting conditions of the board
    printBoard(board);
    //Give some directions to user
    System.out.println("Player 1, you go first.\n");
    System.out.println("Your stones are in the bottom row.\n");
    System.out.println("Your pits are numbered 0 to 5, from left to right.\n");
    System.out.println("Player 2, you go second.\n");
    System.out.println("Your stones are in the top row.\n");
    System.out.println("Your pits are numbered 7 to 12, from right to left.\n");
    //playerInput();
    //playerOneTurn(playerOneInput(), board);
    //printBoard(board);
    while (didPlayerOneWin(board) == false && didPlayerTwoWin(board) == false){
      playerOneTurn(playerOneInput(), board);
      printBoard(board);
      if (didPlayerOneWin(board) == true){
        break;
      }
      playerTwoTurn(playerTwoInput(), board);
      printBoard(board);
      if (didPlayerTwoWin(board) == true){
        break;
      }
    }//end of while loop
    //add option to play again!*/
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
