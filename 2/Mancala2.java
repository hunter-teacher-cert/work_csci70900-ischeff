import java.io.*;
import java.util.*;

public class Mancala2{

  //create 1-D array with 4 stones in each pit and 0 in each mancala
  public static int[] board = {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
  //create the Mancalas for each player as global variables
  public static int p1Mancala = board[6];
  public static int p2Mancala = board[13];
  //create a scanner for input
  public static Scanner in = new Scanner(System.in);
  //create the player pit choices as global variables
  public static int p1PitChoice = 0;
  public static int p2PitChoice = 0;

  //method to print the board by looping through board array
  public static void printBoard(int[] a) {
    System.out.print("\t{" + a[13] + "}"); //player2's mancala
    for (int i = 12; i > 6; i--) { //player 2's pits
        System.out.print(" | " + a[i]);
    }
    System.out.print(" |");
    System.out.println("");
    System.out.print("\t    | " + a[0]);//player 1's pits
    for (int i = 1; i < 6; i++) {
        System.out.print(" | " + a[i]);
    }
    System.out.print(" | {" + a[6] + "}" + "\n" + "\n");//player 1's mancala
    System.out.println("Player 1 Mancala: " + p1Mancala);
    System.out.println("Player 2 Mancala: " + p2Mancala + "\n");
  }//end of printBoard

  //method to check if game is over (will return true if game is over)
  public static Boolean isGameOver(){
    return(board[0] + board [1] + board[2] + board [4] + board [5] == 0 || board [7] + board [8] + board [9] + board [10
    ] + board[11] + board [12] == 0); //check if either player's pits are empty
  }

  //get input from player 1
  public static int p1Input(){
    System.out.println("Player 1: input a number between 1 and 6.");
    p1PitChoice = (in.nextInt() - 1);
    if (p1PitChoice < 0 || p1PitChoice > 5){//check if pit exists
      System.out.println("Sorry, pick a pit between 1 and 6!");
      p1Input();
    } else if (board[p1PitChoice] == 0){//check if pit has stones
      System.out.println("Sorry, pick a pit with stones in it!");
      p1Input();
    } else{
      //System.out.println(p1PitChoice);//test
      return p1PitChoice;
    }
    return 0;
  }//end of player 1 input

  //this method will move player 1's stones around the board.
  public static void moveP1Stones(int p1PitChoice){
    //System.out.println("This method will move stones on the board.");//test
    int pit = p1PitChoice;
    //System.out.println(p1PitChoice);//test
    int stonesInHand = board[p1PitChoice];
    //System.out.println(stonesInHand);//test
    board[p1PitChoice] = 0;
    for(int i = 1; i <= stonesInHand; i++){
      if (pit + i == 13){
        continue; //skip p2 mancala
      }
      if (pit + i > 13){
        pit = (pit - 14);//reset pit to 0 to avoid array out of bounds error
      }
      board[pit + i]++;
    }//end of for loop
    p1Mancala = board[6];
    p2Mancala = board[13];
    printBoard(board);//test
  }//end of moveP1Stones

  //get input from player 2
  public static int p2Input(){
    System.out.println("Player 2: input a number between 1 and 6.");
    p2PitChoice = (in.nextInt() + 6);
    if (p2PitChoice < 7 || p2PitChoice > 12){//check if pit exists
      System.out.println("Sorry, pick a pit between 1 and 6!");
      p2Input();
    } else if (board[p2PitChoice] == 0){//check if pit has stones
      System.out.println("Sorry, pick a pit with stones in it!");
      p2Input();
    } else{
      //System.out.println(p2PitChoice);//test
      return p2PitChoice;
    }
    return 0;
  }//end of player 2 input

  //this method will move player 2's stones around the board.
  public static void moveP2Stones(int p2PitChoice){
    //System.out.println("This method will move stones on the board.");//test
    int pit = p2PitChoice;
    //System.out.println(p2PitChoice);//test
    int stonesInHand = board[p2PitChoice];
    //System.out.println(stonesInHand);//test
    board[p2PitChoice] = 0;
    for(int i = 1; i <= stonesInHand; i++){
      if (pit + i == 6){
        continue;//skip p1 mancala
      }
      if (pit + i > 13){
        pit = (pit - 14);//reset pit to 0 to avoid array out of bounds error
      }
      board[pit + i]++;
    }//end of for loop
    p1Mancala = board[6];
    p2Mancala = board[13];
    printBoard(board);//test
  }//end of moveP2Stones

  public static void main(String[] args){
    //Test that the program compiles
    System.out.println("This will be a game of Mancala!\n");
    //Test that the gameboard array was created; expect a hexadecimal address
    //System.out.println(board);
    //Test the mancala variables are assigned correctly
    //System.out.println(p1Mancala);//should be zero at start
    //System.out.println(p2Mancala);//should be zero at start
    printBoard(board);//print the starting board
    //System.out.println(isGameOver());//test if game is over

    //loop for gameplay (will break when isGameOver evaluates to true in body)
    while(true){
      //printBoard(board);
      p1Input();//get input from player 1
      moveP1Stones(p1PitChoice); //move player 1's stones around the board
      //check if player 1's last stone went into their Mancala
        //if so, player 1's turn repeats
      //check if player 1's last stone went into an empty pit on their side
        //if so, check if parallel player2 pit has any stones
          //if so, zero out that p2 pit and the p1 pit that is parallel
            //add sum of stones to p1 mancala
      //check if game is over
        //if so, break
      p2Input();
      moveP2Stones(p2PitChoice);
    //check if player 2's last stone went into their Mancala
      //if so, player 1's turn repeats
    //check if player 1's last stone went into an empty pit on their side
      //if so, check if parallel player2 pit has any stones
        //if so, zero out that p2 pit and the p1 pit that is parallel
          //add sum of stones to p1 mancala
    //check if game is over
      //if so, break
      break;

  }//end of gameplay while loop

    //add any remainig stones in player 1 pits to their Mancala
    //add any remaining stones in player 2 pits to their mancala
    //check to see who won
      //if no one wins, it's a tie
    //print winning statement/final scores?

  }//end of main

}//end of class
