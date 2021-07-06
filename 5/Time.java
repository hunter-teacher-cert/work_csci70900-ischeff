//This program was a collaboration among Eric Wilson, Dwayne Levene, and Ian Scheffler

/**
* Your Time class definition file should contain code to:
* tell a Time object how to do the tasks necessary to achieve the above
*/
import java.io.*;
import java.util.*;

//this class is an object that will serve as a blueprint for Time objects
public class Time {

  //every time object will have the following instance variables
  private int hour, minute;
  private double second;

  //this method, aka the constructor, initializes the default values of each instance variable for a Time object.
  public Time(){
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
  }

  //this method, aka the value constructor, allows one to instantiate Time objects with instance variables of one's choice, i.e., not the default values
  public Time(int hour, int minute, double second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
}//end class
