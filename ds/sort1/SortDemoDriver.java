import java.io.*;
import java.util.*;

public class SortDemoDriver {
    public static void main(String[] args) {

	SortDemo sd = new SortDemo();
  System.out.println("Below is an array of 15 random ints between 0 and 19, built with the default constructor:");
	System.out.println("sd[]: " + sd);
  System.out.println();
	SortDemo sd2 = new SortDemo(20);
  System.out.println("Below is an array of 20 random ints between 0 and 19, built with the value constructor:");
	System.out.println("sd2[]: " +sd2);
  System.out.println();
	int i;
	i = sd.findSmallestIndex(0);
  System.out.println("Below are tests for findSmallestIndex, using sd and sd2:");
	System.out.println("sd["+ i + "] = "+sd.get(i)+" : " + sd);
	i = sd2.findSmallestIndex(0);
	System.out.println("sd2["+ i + "] = "+sd2.get(i)+" : " + sd2);
  System.out.println();
  System.out.println("Here is sd again, which is unsorted:");
  System.out.println(sd);
  sd.sort();
  System.out.println();
  System.out.println("Here is the same array, sorted:");
  System.out.println(sd);
  System.out.println();
  System.out.println("Linear Search test:");
  System.out.println("Does sd contain the numbers 5, 6, or 7?");
  System.out.println("If so, the values will appear below. If not, the method will return -1.");
  System.out.println(sd.linearSearch(5));
  System.out.println(sd.linearSearch(6));
  System.out.println(sd.linearSearch(7));
  System.out.println();
  System.out.println("Binary Search test:");
  System.out.println("Does sd contain the numbers 5, 6, or 7?");
  System.out.println("If so, the values will appear below. If not, the method will return -1.");
  System.out.println(sd.binarySearch(5));
  System.out.println(sd.binarySearch(6));
  System.out.println(sd.binarySearch(7));
  System.out.println();
  System.out.println("Merge Sort Test:");
  sd.testMerge();
  System.out.println();
  sd.msortTest();
  //System.out.println(sd);


    }
}
