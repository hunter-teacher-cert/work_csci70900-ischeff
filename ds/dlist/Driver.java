import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args){
    // System.out.println("Hello, world!");
    // Node d = new Node("Banana");
    // System.out.println(d);
    // d.addFront("Apple");
    // System.out.println(d);
    Dlist d = new Dlist();
    System.out.println(d.isEmpty());
    System.out.println(d.length());
    System.out.println();
    d.addFront("Apple");
    System.out.println(d);
    System.out.println(d.isEmpty());
    System.out.println(d.length());
    System.out.println();
    d.addFront("Banana");
    System.out.println(d);
    System.out.println(d.isEmpty());
    System.out.println(d.length());
    System.out.println();
    System.out.println(d.get(0));
    System.out.println(d.get(1));
    System.out.println(d.get(2));
    System.out.println(d.get(3));
    System.out.println(d.get(-1));

;  }//end of main
}//end of class
