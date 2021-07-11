# Assignment 3 - Void methods

References for this assignment:

Reference	Chapter(s)
Think Java	4
Read Chapter 4 in Think Java.

While we haven’t discussed this yet, Java is an Object Oriented language. That means pretty much everything is written inside of a Object. Take our Hello.java:

import java.io.*;
import java.util.*;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello world!");
    }
}
Take away the two import lines at the top and we’re left with a class named Hello. The main that we wrote inside the Hello class is a method. For those of you with Python or Javascript backgrounds, for the time being you can think of a method as a function declared inside of a class.

Let’s look at the anatomy of a method

public static RETURNTYPE NAME(ARGUMENTS){
 BODY
}
For now we’ll treat public and static as boilerplate. We’ll explain them when we get to Objects. The name of the method can be any valid identifier. The method name main though, has a special meaning. It’s what the Java Virtual Machine (JVM) runs automatically when you run your program. The return type for main is void. That means it doesn’t return any value. For this section we will limit ourselves to void methods. Here’s a program with two methods. The first is void and prints out Hello world!, the second is our required main method.

import java.io.*;
import java.util.*;

public class Hello {

    public static void printHello(){
        System.out.println("Hello world!");
    }

    public static void main(String[] args){
        String s;
        printHello();
    }

}
Java does have a return statement like other languages but in the case of a void method, if you omit it, the function will just return to the caller after the last statement. If a void method has and encounters a return statement, control is immediately returned to the caller.

The last piece of the method are the ARGUMENTS. The ARGUMENTS are a list of arguments sent to the method. This acts in the same way as arguments to a Python or Javascript function except you have to specify types. For example, if you had a Python function f that accepted first an integer into parameter a and a then string into parameter b and returned a string you would write

def f(a,b):
  # do stuff

In Java the corresponding method would be:

public static void m(int a, String b){
  // dostuff


}
## Submission

Complete exercise 1 from Chapter 4 of Think Java. Either type up your answer in a file named answer.txt or write it by hand and scan it into answer.pdf. Add the file to a folder named pre03 in the assignments repo and push to GitHub.
