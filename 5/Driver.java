//This program was a collaboration among Eric Wilson, Dwayne Levene, and Ian Scheffler
//Ian also got inspiration from Emma Wingreen's code, specifically in regards to the relatinoship of the Time methods and the Time class.
import java.io.*;
import java.util.*;

public class Driver {

  public static void main(String[] args) {

    //declare a var of appropriate type to assign an instance of Time to
    Time t1;
    //assign var the address of a newly-apportioned Time object
    t1 = new Time();
    //test below should print hexadecimal address of Time object in memory
    System.out.println(t1);
    //1)instantiate a newly-created Time object (aka "instance of class Time") with default value(s)
    Time t2 = new Time();
    //2) instantiate a newly-created Time object with specified value(s)
    Time t3 = new Time(6, 7, 30.0);
    //3) assign a Time var the value null
    Time t4 = null;
    //4) assign a Time var the value of an existing Time var
    //question: is this just aliasing?
    Time t5 = t2; //this should now cause t5 to refer to the same object as t2



  }//end main

}//end class
