//This program was a collaboration among Eric Wilson, Dwayne Levene, and Ian Scheffler

/**
Your driver file should contain code to (in suggested development order)
1) instantiate a newly-created Time object (aka "instance of class Time") with default value(s)
2) instantiate a newly-created Time object with specified value(s)
3) assign a Time var the value null
4) assign a Time var the value of an existing Time var
5) print all of the above (See multiple ways to do this? Try all -- and document in comments!)
6) test for equality of each of the Time instances above. Print results.
7) add two Time objects and print results
8) add two Time objects and save the result in another Time object
*/
import java.io.*;
import java.util.*;

public class Driver {

  public static void main(String[] args) {

    //declare a var of appropriate type to assign an instance of Time to
    Time t;

    //assign var the address of a newly-apportioned Time object
    t = new Time();
    //test below should print hexadecimal address of Time object in memory
    System.out.println(t);
    //1)instantiate a newly-created Time object (aka "instance of class Time") with default value(s)
    Time t1 = new Time();
    //2) instantiate a newly-created Time object with specified value(s)
    Time t2 = new Time(6, 7, 30.0);
    //3) assign a Time var the value null
    Time t3 = new Time();
    t3 = null;
    //4) assign a Time var the value of an existing Time var
    //question: is this just aliasing?
    t3 = t2; //this should now cause t3 to refer to the same object as t2


  }//end main()

}//end class
