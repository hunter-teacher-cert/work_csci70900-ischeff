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
      System.out.println(p1PitChoice);//test
      return p1PitChoice;
    }
    return 0;
  }//end of player input

  //this method will move player 1's stones around the board.
  public static void moveP1Stones(int p1PitChoice){
    System.out.println("This method will move stones on the board.");
    int pit = p1PitChoice;
    System.out.println(p1PitChoice);
    int stonesInHand = board[p1PitChoice];
    System.out.println(stonesInHand);
    board[p1PitChoice] = 0;
    for(int i = 1; i <= stonesInHand; i++){
      board[pit + i]++;
    }//end of for loop
    printBoard(board);
  }//end of moveP1Stones

  public static void main(String[] args){
    //Test that the program compiles
    System.out.println("This will be a game of Mancala!");
    //Test that the gameboard array was created; expect a hexadecimal address
    System.out.println(board);
    //Test the mancala variables are assigned correctly
    System.out.println(p1Mancala);//should be zero at start
    System.out.println(p2Mancala);//should be zero at start
    printBoard(board);//print the starting board
    System.out.println(isGameOver());//test if game is over

    //loop for gameplay (will break when isGameOver evaluates to true in body)
    while(true){
      printBoard(board);
      p1Input();//think this works now!
      moveP1Stones(p1PitChoice);
      break;
      //player 1 turn
        //set the value of stones in the players' "hand" equal to the number of stones in the pit they selected.
        //increment the array based on the number of stones.
          //note: can you make a general mancala algorithm that moves stones, and just takes the board and n as an input?
        //check if player 1's last stone went into their Mancala
          //if so, player 1's turn repeats
        //check if player 1's last stone went into an empty pit on their side
          //if so, check if parallel player2 pit has any stones
            //if so,
        //check if player 1 wins

      //player 2 turn
        //check if player 2 wins
  }//end of gameplay while loop

    //add any remainig stones in player 1 pits to their Mancala
    //add any remaining stones in player 2 pits to their mancala
    //check to see who won
    //print winning statement/final scores?

  }//end of main

}//end of class
