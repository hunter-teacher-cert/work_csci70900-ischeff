public class Mancala2{

  //create 1-D array with 4 stones in each pit and 0 in each mancala
  public static int[] board = {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
  //create the Mancalas for each player as global variables
  public static int player1Mancala = board[6];
  public static int player2Mancala = board[13];

  public static void main(String[] args){
    //Test that the program compiles
    System.out.println("This will be a game of Mancala!");
    //Test that the gameboard array was created; expect a hexadecimal address
    System.out.println(board);
    //Test the mancala variables are assigned correctly
    System.out.println(player1Mancala);//should be zero at start
    System.out.println(player2Mancala);//should be zero at start

    //create the mancala board (as a single 1-D array)

    //print the board (with a for loop)

    //while loop as long as win conditions haven't been met

      //player turn
        //check if player wins

      //ai turn

    //print winning statement/final scores?

  }//end of main

}//end of class
