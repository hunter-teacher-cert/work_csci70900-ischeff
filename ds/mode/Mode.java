//Ian, Jiyoon, Mr H

import java.io.*;
import java.util.*;

public class Mode{
    private ArrayList<Integer> inputData;
    private Random r;

    public Mode(){
	    r = new Random();
	    inputData = new ArrayList<Integer>();
      for (int i=0; i < 20; i++){
  	    inputData.add(r.nextInt(20));
      }
    }

    public Mode(int size){
    	r = new Random();
    	inputData = new ArrayList<Integer>();
    	for (int i=0; i < size; i++){
    	    inputData.add(r.nextInt(50));
    	}
    }

    /**
     * Warmup 1: Find and return the smallest value in  InputData.
     */

    public int findSmallestValue(){
      int smallIndex = 0;
      // loop from that variable to end and update smallIndex as needed
      for(int i = 1; i < inputData.size(); i++){
      if (inputData.get(i) < inputData.get(smallIndex)){
        smallIndex = i;
        }
      }
      return inputData.get(smallIndex);
      }

    /**
     * Warmup 2

     Returns the frequency of value in inputData, that is, how often value appears
    */
    public int frequency(int value){
      if (inputData.size() == 0){
        System.out.println("empty array");
        return 0;
      }
      int counter = 0;  //counter variable
      for (int i = 0; i < inputData.size(); i++){ //for loop
        if (inputData.get(i) == value){ //value @ index matches value arg --> increment counter
          counter++;
        }
      }
    return counter; //returns counter
    }

    /**
     *
     This function should calculate and return the mode of inputData.
     The mode is the value that appears most frequently so if inputData contained
     5,3,8,2,5,9,12,5,12,6,5, the mode would return 5 since 5 appears four times.

     If there are multiple modes such as in the case with this data set: 5,5,2,9,9,6 you should return
     either of them (the 5 or the 9).

     Note: you will probably use the frequency function you wrote in
     this solution but not findSmallestValue. the findSmallestValue
     function will help you find a strategy for approaching finding the mode.
    */
  public void allFreq(){
    System.out.print("[");
    for (int i = 0; i<inputData.size();i++){
      System.out.print(this.frequency(inputData.get(i))+", ");
    }
  }
  //returns first mode
  public int calcMode(){
    //initiialize mode as int variable set to 0 that will store maximum frequency
    int mode = inputData.get(0);
    //for each check frequency (for loop as big as data.size())
    for (int i = 1; i<inputData.size();i++){
      //System.out.println(mode);//debugging
      if(this.frequency(inputData.get(i)) > this.frequency(mode)){
        mode = inputData.get(i);
      }
    }
    //food for thought: how to find unique numbers to duplicate checking
    //make an array of frequencies
    //dont' update if already there
  	return mode;
    }

  public String toString(){
	   return ""+inputData;
  }
}//end of class
