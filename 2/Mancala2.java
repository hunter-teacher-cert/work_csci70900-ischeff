public class Mancala2{

  //create 1-D array with 4 stones in each pit and 0 in each mancala
  public static int[] board = {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
  //create the Mancalas for each player as global variables
  public static int player1Mancala = board[6];
  public static int player2Mancala = board[13];

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

  public static void main(String[] args){
    //Test that the program compiles
    System.out.println("This will be a game of Mancala!");
    //Test that the gameboard array was created; expect a hexadecimal address
    System.out.println(board);
    //Test the mancala variables are assigned correctly
    System.out.println(player1Mancala);//should be zero at start
    System.out.println(player2Mancala);//should be zero at start
    printBoard(board);

    //print the board (with a for loop)

    //while loop as long as win conditions haven't been met

      //player turn
        //check if player wins

      //ai turn

    //print winning statement/final scores?

  }//end of main

}//end of class
