/**
* This program was a collaboration among Eric Wilson, Dwayne Levene, and Ian Scheffler
* NOTE: after looking at Emma Wingreen's code, and looking back at Chapters 10 + 11,
* I realized that it makes more sense (indeed, it's necessary, to put the methods
* for the Time class IN the Time class--as in the diagram in the text that shows
* how the classes Point and Rectangle contain both the data and the methods with
* which to operate on them!)
*/

/**
* The Time class represents the data and methods that pertain to Time objects.
* The blueprint for a Time object should contain the instance variables hour,
* minute, and second, which are of the type int, int, and double, respectively.
*
* In addition, the Time class contains both a default constructor, which initializes
* the variables to zero, and a value constructor, which allows for specific values
* to be assigned to those variables.
*
* Finally, the Time class contains the methods that can [should?] be used to
* manipulate Time objects--namely, as far as this lab goes, the ability to
* print them, and to add them.
*
* Interestingly, I found that this method compiles, but if you try to run it, you
* get the following error message:
*
* Error: Main method not found in class Time, please define the main method as:
*    public static void main(String[] args)
* or a JavaFX application class must extend javafx.application.Application
*
* I assume this is by design, since you only want one class to be able to start
* the program, which is in this case the Driver program. (If you could start a
* program from multiple classes, I assume that might cause problems of many types!)
*/
import java.io.*;
import java.util.*;

public class Time {

  //every time object will have the following instance variables
  private int hour, minute;
  private double second;

  //this method, aka the constructor, initializes the default values of each
  //instance variable for a Time object.
  public Time(){
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
  }

  /**
  * this method, aka the value constructor, allows one to instantiate Time objects
  * with instance variables of one's choice, i.e., not the default values
  */
  public Time(int hour, int minute, double second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  /**
  * the following methods are "getters", that is, they allow us to access
  * the instance variables in Driver, even though the variables are private.
  * This allows an added layer of security, since the variables themselves
  * can't be directly changed (i.e., "set" using setters) using the Time class
  * does not provide setters--you can only instantiate new Time objects, not
  * change existing ones, at least for the purposes of this lab. In practical
  * terms, what this means is that when we write "this.hour" in Driver,
  * we will be able to access the private variables contained in the Time object!
  */

  public int getHour() {
    return this.hour;
  }

  public int getMinute() {
      return this.minute;
  }

  public double getSecond() {
      return this.second;
  }

  /**
  * Below are several methods to print a Time object; there is more than one way
  * to do this, since we can either create a method of our own (printTime) which takes
  * as input a Time object and prints out each of the object's instance variables,
  * or we can use the .toString method, which I believe exists in java.lang package.
  */

  //note: syntax for using this method is t.printTime(t);
  public static void printTime(Time t) {
    System.out.printf("%02d:%02d:%04.1f\n",
        t.hour, t.minute, t.second);
  }

  //note: to use this method, you need to create a String i.e., String s
  //then set the string = t.toString;
  //in other words, the syntax for this method is t.toString
  //(you just need a String variable to refer to to the string that results!
  public String toString() {
    return String.format("%02d:%02d:%04.1f\n",
        this.hour, this.minute, this.second);
  }

  /**
  * This method sidesteps around the fact that ==, which we have used to compare
  * primitives in other programs, doesn't work to evaluate whether two objects
  * have equivalent contents. We need to actually compare their instance variables
  * one at a time, by passing a Time object to the method.
  */
  public boolean equals(Time that) {
    return this.hour == that.hour
        && this.minute == that.minute
        && this.second == that.second;
  }


}//end class
