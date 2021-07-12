import java.io.*;
import java.util.*;

public class Maze{

    private char[][] board;
    private int rows = 25;
    private int cols = 85;

    private String clearScreen="[0;0H\n";

    private void delay(int n)
    {
	try
	    {Thread.sleep(n);}
	catch(InterruptedException e)
	    {}
    }

    public Maze(String filename){
	try{
	    board = new char[cols][rows];
	    int row = 0;
	    int col = 0;

	    for (row = 0; row < rows; row++){
		for (col = 0; col < cols ; col++){
		    board[col][row] = ' ';
		}
	    }


	    File file = new File(filename);
	    FileReader reader = new FileReader(file);
	    BufferedReader breader = new BufferedReader(reader);

	    String line;
	    row = 0;
	    while( (line=breader.readLine()) != null )  {
		for (col = 0; col < line.length()-1 ; col++){
		    board[col][row] = line.charAt(col);
		}
		row++;
	    }

	} catch (IOException e){
	    e.printStackTrace();
	}


    }

    public String toString(){
	int row,col;
	String result = "";
	for (row = 0; row < rows; row++){
	    for (col = 0; col < cols; col++){
		result = result + board[col][row];
	    }
	    result = result +"\n";
	}
	return result;
    }

    public boolean solve(int col,int row){
      boolean solved;
      System.out.println(clearScreen+this);

      //BASE CASE 1 - made it out!
      //if we found the exit we are done - return true
      if (board[col][row]=='$'){
        return true;
      }

      //BASE CASE 2 - dead end
      //if we hit a wall or our path we can't proceed further - return false
      if(board[col][row] == ' ' || board[col][row] == 'z'){
        return false;
      }

      //put ourselves in the Maze
      board[col][row] = 'z';
      //RECURSIVE CALLS
      //try all the space we can
      solved = solve(col+1,row);
      if(!solved){
        solved = solve(col-1,row);
      }
      if(!solved){
        solved = solve(col,row+1);
      }
      if(!solved)
        solved = solve(col,row-1);
      
  return solved;
    }




}
