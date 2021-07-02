//This project was made by Michelle Best, Chris O'Brian, and Ian Scheffler

import java.io.*;
import java.util.*;

/**
   The Rules of Life:
   Survivals:
   * A cell with 2 or 3 living neighbours will survive for the next generation.
   Death:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Birth:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation
*/

public class Cgol
{

  //initialize empty board (all cells dead)
  public static char[][] createNewBoard(int rows, int cols) {
    char[][] board = new char[rows][cols];
    return board;
  }


  //print the board to the terminal
  public static void printBoard(char[][] board) {
    for (char[] rows : board){
      for (char cell : rows){
        System.out.print(cell + " ");

      }
      System.out.print("\n");
    }
    System.out.print("\n");
  }


  //set a single cell  located at (rows, cols) to value val
  public static void setCell(char[][] board, int rows, int cols, char val){
      board[rows][cols] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours(char[][] board, int rows, int cols) {
    //Chris: what if we treat this method as the following:
    //search the area around a given r,c by summing the space around import junit.framework.TestCase;
    //as a 3x3 2D array. (See image on slack)
    //we need to check if the neighboring cell has a neighbor
    int sum = 0;
    for (int r = rows -1; r < rows+2; r++){
      if (r <board.length && r > 0){
        for (int c = cols -1; c < cols+2; c++){
            if (c <board[r].length && c > 0 && !(r == rows && c ==cols)){
              if (board[r][c] == 'X'){
                sum +=1;
              }
            }
        }  //end of inner loop
      }//end of if statement for the outer loop
    } //end of outer loop
    return sum;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell(char[][] board,int rows, int cols) {
    char a = 65;
    return a;
  }


  //generate new board representing next generation
  public static char[][] generateNextBoard(char[][] board) {
    char[][] hello = new char[1][1];
    return hello;
  }


  public static void main( String[] args )
  {

    char[][] board;
    board = createNewBoard(25,25);
    //testing if board exists.
  //  System.out.println("# of rows: " + board.length);
  //  System.out.println("# of columns: " + board[0].length);

    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    printBoard(board);
    System.out.println("# of neighbors: " + countNeighbours(board, 0 ,0));
    setCell(board, 0, 1, 'X');
    printBoard(board);
    System.out.println("# of neighbors: " + countNeighbours(board, 0 ,0));
    setCell(board, 1, 0, 'X');
    printBoard(board);
    System.out.println("# of neighbors: " + countNeighbours(board, 0 ,0));

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class
