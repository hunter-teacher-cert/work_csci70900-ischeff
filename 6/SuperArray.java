// Group 0
// Ian Scheffler
// Brian Mueller
// Jovani Cardenas

/**
   lab skeleton
   encapsulation / SuperArray

   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
 **/

import java.io.*;
import java.util.*;

public class SuperArray
{
  //instance vars
  private int[] data;           //where the actual data is stored
  private int numberElements;   //number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    this.data = new int[10];
    this.numberElements = 0;
  }

  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    this.data = new int[size];
    this.numberElements = 0;
  }

  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    //default constructor - Number of Elements is zero.
    // test to see if we need to grow, then grow
    // SIMPLE VERSION DOES NOT AUTO-GROW CAPACITY; INSERT MORE CODE HERE LATER
    if (numberElements == data.length){
      grow();
    }
    // add item
    data[numberElements] = value;

    // increment numberElements
    numberElements++;

  }//end add()

  // overloaded method that allows for insertion
  public void add(int index, int value){

  }

  public boolean isEmpty()//we are defining empty as a set of all zeroes.
  {
    for (int i= 0; i<data.length; i++) {
      // if the current element is NOT 0, return false (will exit method early)
      if (data[i] != 0){
        return false;
      }
    }
    return true;
  }//end of isEmpty


  public int get(int index)
  {
    return 0;
  }

  // example: {0,1,2,3,4,0,0,0,0,0}
  // note: tofr swung by and suggested we further discuss what we want toString to print
  //i.e., do we want to print only meaningful data?
  public String toString()
  {
    String s = "{";
    for(int i = 0; i < data.length; i++){
      s += data[i] + ","; // TODO: remove trailing comma at end
    }
    return s+"}";
  }//end toString()


  //helper method for debugging/development phase
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by? we chose +10
    int[] biggerData = new int[numberElements+10];

    // copy over all the elements from the old array to the new one
    for(int i = 0; i < data.length; i++) {
      biggerData[i] = data[i];
    }

    // point data to the new array
    data = biggerData;
    // Q: How does this look when illustrated using encapsulation diagram?

  }//end grow()

}//end class
