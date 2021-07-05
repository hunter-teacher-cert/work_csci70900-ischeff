//The original version of this (Mancala.java) was written by Daiana, Mr. H, and Ian
//This revised version (which is less buggy and has more features) was coded by Ian
//Ian used work from Eric, Tiffany, Emma Wingreen, and Mr. Bomb Music's groups for inspiration!


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
  //create a counter to check which pit the last stone went into
  public static int counter = 0;

  //method to print the board by looping through board array
  public static void printBoard(int[] a) {
    System.out.print("\t{" + a[13] + "}"); //player2's mancala
    //NOTE: when p2's mancala is in double digits but p1's is not, it throws the board alignment off!
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
      System.out.println("Sorry, pick a pit between 1 and 6!\n");
      p1Input();
    } else if (board[p1PitChoice] == 0){//check if pit has stones
      System.out.println("Sorry, pick a pit with stones in it!\n");
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
    counter = p1PitChoice;
    board[p1PitChoice] = 0;
    for(int i = 1; i <= stonesInHand; i++){
      if (pit + i == 13){
        counter++;
        continue; //skip p2 mancala
        //should you replace the above contiune with just incrementing the next pit?
      }
      if (pit + i > 12){
        pit = (pit - 14);//reset pit to 0 to avoid array out of bounds error
        counter = (counter - 14);
      }
      board[pit + i]++;
      counter++;
    }//end of for loop
    p1Mancala = board[6];
    p2Mancala = board[13];
    //printBoard(board);//test
    System.out.println("The last pit was: " + counter + "\n");//Test
  }//end of moveP1Stones

  //method to see if p1 captures any of p2's stones
  public static void p1Capture(int counter){
    int capturedStones = 0;
    if ((counter >= 0 && counter < 6) && board[counter] == 1){
      capturedStones = board[12 - counter]; //collect captured stones
      board[12-counter] = 0; //remove captured stones from pit
      board[6] = board [6] + capturedStones; //add captured stones to mancala
      p1Mancala = board[6];
      p2Mancala = board[13];
      //printBoard(board);
      System.out.println("Player 1, you captured " + capturedStones + " from player 2!\n");
    }
  }//end of p1Capture

  //method to check if last stone went into p1's mancala
  public static Boolean p1GoAgain(int counter){
    return(counter == 6);
  }//end of p1 go again

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
    counter = p2PitChoice;
    board[p2PitChoice] = 0;
    for(int i = 1; i <= stonesInHand; i++){
      if (pit + i == 6){
        counter++;
        continue;//skip p1 mancala
      }
      if (pit + i > 13){
        pit = (pit - 14);//reset pit to 0 to avoid array out of bounds error
        counter = (counter - 14);
      }
      board[pit + i]++;
      counter++;
    }//end of for loop
    p1Mancala = board[6];
    p2Mancala = board[13];
    //printBoard(board);//test
    System.out.println("The last pit was: " + counter + "\n");//Test
  }//end of moveP2Stones

  //method to see if p1 captures any of p2's stones
  public static void p2Capture(int counter){
    int capturedStones = 0;
    if ((counter >= 7 && counter < 13) && board[counter] == 1){
      capturedStones = board[12 - counter]; //collect captured stones
      board[12-counter] = 0; //remove captured stones from pit
      board[13] = board [13] + capturedStones; //add captured stones to mancala
      p1Mancala = board[6];
      p2Mancala = board[13];
      //printBoard(board);
      System.out.println("Player 2, you captured " + capturedStones + " from player 1!\n");
    }
  }//end of p2Capture

  //method to check if last stone went into p2's mancala
  public static Boolean p2GoAgain(int counter){
    return(counter == 13);
  }//end of p2 go again

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

      //p1's turn
      p1Input();//get input from player 1
      moveP1Stones(p1PitChoice); //move player 1's stones around the board
      p1Capture(counter);//check if p1 captures any stones from p2
      printBoard(board);//print updated board
      isGameOver();
        if (isGameOver() == true){
          break;
        }
      p1GoAgain(counter);
      while (p1GoAgain(counter) == true){
        System.out.println("Player 1, you placed your last stone in your Mancala. Go again!\n");
        p1Input();//get input from player 1
        moveP1Stones(p1PitChoice);//move player 1's stones around the board
        p1Capture(counter);//check if p1 captures any stones from p2
        printBoard(board);//print updated board
        isGameOver();
          if (isGameOver() == true){
            break;
          }
      }//end of p1 go again check

      //p2's turn
      p2Input();
      moveP2Stones(p2PitChoice);
      p2Capture(counter);//check if p2 captures any stones from p1
          if (isGameOver() == true){
            break;
          }
      printBoard(board);//print updated board
      p2GoAgain(counter);
      while (p2GoAgain(counter) == true){
        System.out.println("Player 2, you placed your last stone in your Mancala. Go again!\n");
        p2Input();//get input from player 2
        moveP2Stones(p2PitChoice); //move player 2's stones around the board
        p2Capture(counter);//check if p2 captures any stones from p1
        printBoard(board);//print updated board
          if (isGameOver() == true){
            break;
          }
      }//end of p2 go again loop

      //break;

  }//end of gameplay while loop

    System.out.println("The game is now over!\n");
    System.out.println("Any remaining stones in your pits will be added to your Mancala.\n");
    //add any remaining stones in player 1 pits to their Mancala
    board[6] = board[0] + board[1] + board[2] + board[3] + board [4] + board[5] + board[6];
    //add any remaining stones in player 2 pits to their mancala
    board [13] = board[7] + board[8] + board[9] + board[10] + board[11] + board[12] + board[13];
    //update Mancala variables
    p1Mancala = board[6];
    p2Mancala = board[13];
    //zero out p1's pits
    for(int i = 0; i < 6; i++){
      board[i] = 0;
    }
    //zero out p2's pits
    for(int i = 7; i < 13; i++){
      board[i] = 0;
    }
    //print the final board;
    printBoard(board);
    //check to see who won
    if (p1Mancala > p2Mancala){
      System.out.println("Congratulations, Player 1, you win!");
    } else if (p2Mancala > p1Mancala){
      System.out.println("Congratulations, Player 2, you win!");
    } else{
      System.out.println("It's a tie!");
    }

  }//end of main

}//end of class

//To do:
//fix board print method so that when one player is in double digits but the other is not, the board is still aligned
//figure out why when a player is wrapping around the board the last stone isn't always deposited where necessary (skipping the mancala isn't working quite right--if there is one stone left, it just disappears)
//Note for the above: it appears that when the last stone in the player's hand reaches the index on the array that equals the opponent's mancala, instead of going into the next available pit, it disappears; when passing by it's not a problem.
//capture method currently "captures" stones when there are 0 stones in a parallel pit--nothing should happen!
