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

  public static void main(String[] args){
    //Test that the program compiles
    System.out.println("This will be a game of Mancala!");
    //Test that the gameboard array was created; expect a hexadecimal address
    System.out.println(board);
    //Test the mancala variables are assigned correctly
    System.out.println(player1Mancala);//should be zero at start
    System.out.println(player2Mancala);//should be zero at start
    printBoard(board);//print the starting board

    //while loop as long as gameOver conditions haven't been met
      //gameOver conditions: one player's side has no more stones in the pits.

      //player 1 turn
        //get player 1 input
          //check if input is valid
            //if not valid, ask for input again
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

    //print winning statement/final scores?

  }//end of main

}//end of class
