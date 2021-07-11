# Assignment 5 - Value Methods

References for this assignment:

Reference	Chapter(s)
Think Java	6
Sedgwick / Wayne	2.1,2.2

Earlier we looked at the anatomy of a method:

public static RETURNTYPE NAME(ARGUMENTS){
 BODY
}
We discussed all the components except the RETURNTYPE. In addition to having a RETURNTYPE of void we can specify any other data type as the RETURNTYPE. In the example below, the method returnHello does not output anything. Instead it returns a String value. Note how this differs from printHello which outputs “Hello World!” but returns nothing.

import java.io.*;
import java.util.*;

public class Hello {

    public static void printHello(){
        System.out.println("Hello world!");
    }

    public static String returnHello(){
        return "Hello world!";
    }

    public static void main(String[] args){
        String s;
        printHello();
        s = returnHello();
        System.out.println(s);
    }

}
Finally, a method can call another method:

import java.io.*;
import java.util.*;

public class Hello {

    public static void printHello(String name){
        String result;
        result = returnHello(name);
        System.out.println(result);
    }

    public static String returnHello(String name){
        String result;
        return "Hello " + name + "!";
    }

    public static void main(String[] args){
        String s;
        printHello("Thomas");
        s = returnHello("Jane");
        System.out.println(s);
    }

}
## Submission

Create a folder named pre05 under the assignment repo. Write a program named Methods.java with methods that solve exercises 2, 3, and 8 from Chapter 6 in Think Java.
