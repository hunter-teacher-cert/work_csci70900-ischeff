import java.io.*;
import java.util.*;

public class Knights{


    // the board is of ints rather than chars like the maze
    // since we want to track the moves by number

    //instance variables: board of ints, number of rows, columns, and size of board
    private int[][] board;
    private int rows = 5;
    private int cols = 5;
    private int size=5;
    private String clearScreen="[0;0H\n";//control character to move back to upper left

    private void delay(int n)//delay method from animate.java file
    {
	try
	    {Thread.sleep(n);}
	catch(InterruptedException e)
	    {}

    }

  //this is the value constructor, which can we use to create a board of any size
  //the variables below overwrite the values of the instance variables in lines 12-14
  public Knights(int size){
  	rows = size;
  	cols = size;
  	this.size=size;
  	int row,col;//don't we already have these integers?

	// Notice that the board is 4 bigger in both directions with 0's
	// in the middle and a 2 row/col border of -1.
	// Why are we doing this?

  //We're doing this b/c the 0s = legal positions and the -1s are the illegal area outside the board
  //Presumably the -1s outside the legal move space are indicators that we are "off the board"
	board = new int[cols+4][rows+4];
	for (row = 0; row < rows+4; row++){
	    for (col = 0; col < cols+4 ; col++){
		board[col][row] = -1;
	    }
	}
	for (row = 2; row < rows+2; row++){
	    for (col = 2; col < cols+2 ; col++){
		board[col][row] = 0;
	    }
	}


    }

    public String toString(){
	int row,col;
	int value;
	String result = "";
  //the two lines below loop through the entire board--legal and illegal
	for (row = 0; row < rows+4; row++){
	    for (col = 0; col < cols+4; col++){
    //value in the line below will collect the value of EVERY element on the board--including the -1s in the illegal area
    value = board[col][row];

		// Why do we have this if as opposed to
		// just adding the next value to the string?
		if (value < 10 && value >= 0){
		    result = result + "0" + value+ " ";
		} else {
		    result = result + value + " ";
		}
	    }
	    result = result +"\n";
	}
	return result;
    }

    public boolean solve(int col,int row, int count){
	boolean solved = false;


	// This should return true when we've solved the problem
	// What should CHANGETHIS be?
	// in the maze we knew we were done when we found the exit
	// here, when do we know when we're done?
	// HINT: you have an nxn board and are done when you've visited
	// every board location
	if (count>25){//25 right? b/c you have "won" when you have visited all the legal spaces.
	    System.out.println(this);
	    return true;
	}


	// this should return false when we're at an illegal locaiton
	// change CHANGETHIS to the appropriate boolean
	// HINT: we are tracking our moves in the board
	// and also built that border of -1 values.
	if (CHANGETHIS){
	    return false;
	}


	// what do we put into the board
	// Change CHANGETHIS
	board[col][row]=CHANGETHIS;

	delay(50);
	System.out.println(clearScreen+this);


	// Here we need to do try to do the 8 recursive calls
	// one for each knight's move.
	// It should be almost the same as the maze routine except:
	// 1. The maze had only four calls.
	// 2. The parameters for the call are a little different.
	// Add the recursive calls here




	// Here we unset where we were for the backtracking

	board[col][row]=0;
	return solved;
    }




}
