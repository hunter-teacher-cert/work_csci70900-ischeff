import java.io.*;
import java.util.*;

/*
Setup:
 1.Make a folder under your work repo named: ds
 2. Make another folder under that named sort1
 3. Copy this file and SortDemoDriver.java into the ds/sort1 folder

Lab:
Part 1:
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortDemoDriver.java and SortDemo.java) and confirm
   the behavior of the constructors.
Part 2:
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortDemoDriver to test.
Part 3:
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortDemoDriver to test.
*/

public class SortDemo{

    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data (an Array List of integers)
    private Random r; // a random integer is the other instance variable

    //this is the default constructor and will initialize an ArrayList of random integers between 0 and 19 of length 15
    public SortDemo(){
	data = new ArrayList<Integer>(); //{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} (an array list of zeroes)
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));  //{array list is now full of random numbers between 0 and 19}
	}

    }

    //this is the value constructor and will initialize an ArrayList of random integers between 0 and 19 of length size
    public SortDemo(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}

    }

    public int get(int index){
      return this.data.get(index);
    }

    /*
      return the index of the ArrayList data from index start to the end
      Example, if the arraylist has:
      index: 0 1  2  3 4
             5 3 10  6 8
      if start was 2 (start at index 2, value 10) then it woudl return 3 which is the index of the value
      6 which is the index with the smallest value from start to end
    */
    public int findSmallestIndex(int start){
	int smallIndex = start;

	// start a variable at the one after start
	int next = start + 1;//note: you could have NOT used this variable and instead modified the loop starting point to be for(i = start + 1; )

	// loop from that variable to end and update smallIndex as needed
	for(int i = next; i < data.size(); i++){
    if (data.get(i) < data.get(smallIndex)){
      smallIndex = i;
    }
  }
	return smallIndex;

    }



    public void sort(){
      int start, smallestIndex, temp;
    	for (start = 0;start < data.size() - 1; start++){
    	    // find the smallest index from i to end
          smallestIndex = findSmallestIndex(start);
    	    // swap the item at that index and i
          temp = this.data.get(start); //equivalent of temp = data[start]
          this.data.set(start, this.data.get(smallestIndex)); //equivalent of data[start] = data[smallestIndex]
          this.data.set(smallestIndex, temp);//equivalent of data[smallestIndex] = temp
  	     }
    }



    /* If you finish the lab early you can get started on this */
    public int linearSearch(int value){
	// loop through the ArrayList data
  for(int i = 0; i < data.size(); i++){
    // and if the value you're searchign for is in the ArrayList, return it.
    if (data.get(i) == value){
      return data.get(i);
    }
  }
	// return -1 if it isn't there.
	return -1;
    }

    /* If you finish the lab early you can get started on this */
  public int binarySearch(int value){
	//boolean replacethiswithrealexpression=false; //not sure why we can't just have a statement that evaluates to true in the while statement!
	int lowerIndex = 0;
	int upperIndex = data.size();
	//int middleIndex = data.size()/2;//not sure why we can't just create the middle in the loop, based on upper and lower!

  while (upperIndex >= lowerIndex){
    //I moved the middleIndex here b/c we need to update it each time; not sure why it would need to be in two places (top and here otherwise)
    int middleIndex = (lowerIndex + upperIndex) / 2;
    if (value < data.get(middleIndex)){
      upperIndex = middleIndex - 1;
    }
    else if (value > data.get(middleIndex)){
      lowerIndex = middleIndex + 1;
    } else {
      return data.get(middleIndex);
    }
  }

	return -1;
}


  public String toString(){
	   return ""+data;
  }

  /*------------------------- MERGESORT STUFF -----------------*/


  // Preconditions: a and b are ArrayLists of Integers and
  //                both are in increasing order
  // Return: a new ArrayList of Integers that is the result
  //         of merging a and b. The new ArrayList
  //         should be in increasing order
  private ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
    ArrayList<Integer> c = new ArrayList<Integer>();//create the new array list that will contain the merged data
    int i = 0; //index for ArrayList a
    int j = 0; //index for ArrayList b
    while(i < a.size() && j < b.size()){//loop until you reach the end of BOTH arraylists
      if (a.get(i) < b.get(j)){
        c.add(a.get(i));
        i++;
      } else{
        c.add(b.get(j));
        j++;
      }//if statement to compare elements in arraylists
    }//end of while loop
    return c;
  }//end of merge

  /*
  * This method takes as input an int and returns an arraylist of corresponding size.
  * This arraylist is already sorted, since it is created by first generating a random number
  * between 0 and 9, then adding another random number between 0 and 9 to that number to create the
  * following term; hence, every term is larger than the term that precedes it.
  */
  private ArrayList<Integer> fillForMerge(int size){
  	ArrayList<Integer> a = new ArrayList<Integer>();
  	int lastVal = r.nextInt(10);
  	for (int i = 0 ; i < size ; i++){
  	    a.add(lastVal);
  	    lastVal = lastVal + r.nextInt(10);
  	}
  	return a;

  }//end of fillForMerge


  public void testMerge(){
  	ArrayList<Integer> a = new ArrayList<Integer>();
  	ArrayList<Integer> b = new ArrayList<Integer>();
  	a = fillForMerge(20);
  	b = fillForMerge(20);
    System.out.println("Here are two sorted ArrayLists, ready to be merged:");
  	System.out.println("a[]: " + a);
  	System.out.println("b[]: " + b);
    System.out.println();
    System.out.println("Now, here is the merged ArrayList:");
    System.out.println(merge(a, b));

  }//end of testMerge


}//end of class
