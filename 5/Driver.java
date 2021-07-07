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
    //System.out.println(t1);
    //1)instantiate a newly-created Time object (aka "instance of class Time") with default value(s)
    Time t2 = new Time();
    //2) instantiate a newly-created Time object with specified value(s)
    Time t3 = new Time(6, 7, 30.0);
    //3) assign a Time var the value null
    Time t4 = null;
    //4) assign a Time var the value of an existing Time var
    //question: is this just aliasing?
    Time t5 = t3; //this should now cause t5 to refer to the same object as t2
    //5) print all of the above (See multiple ways to do this? Try all -- and document in comments!)

    //this first round of printing uses the method printTime from the Time class
    t1.printTime(t1);//should equal 00:00:00.0
    t2.printTime(t2);//should equal 00:00:00.0
    t3.printTime(t3);//should equal 06:07:30.0
    //t4.printTime(t4);//should get NullPointerException
    t5.printTime(t5);//should equal 06:07:30.0

    //this second round of printing use the .toString method
    //First, we instantiate string variables to hold the resulting strings.
    //The values should be the same as the printTime method above.
    String s1 = t1.toString();//should equal 00:00:00.0
    String s2 = t2.toString();//should equal 00:00:00.0
    String s3 = t3.toString();//should equal 06:07:30.0
    //String s4 = t4.toString();//should get NullPointerException
    String s5 = t5.toString();//should equal 06:07:30.0

    //The statements below will then print the strings.
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    //System.out.println(s4);
    System.out.println(s5);



  }//end main

}//end class
