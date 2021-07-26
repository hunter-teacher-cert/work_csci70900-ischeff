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
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    d.addFront("Apple");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    d.addFront("Banana");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    System.out.println(d.get(0));
    System.out.println(d.get(1));
    System.out.println(d.get(2));
    System.out.println(d.get(3));
    System.out.println(d.get(-1));
    System.out.println();
    d.set(0, "Pear");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    d.set(1, "Peach");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    d.set(0, "Pear");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    d.set(-1, "Peach");
    System.out.println();
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    d.insert(1, "Pineapple");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    d.insert(1, "Starfruit");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    d.insert(2, "Durian");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    d.insert(0, "Crabapple");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    d.insert(5, "Blackberry");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    System.out.println(d.search("Pineapple"));
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println(d.search("Pear"));
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println(d.search("Watermelon"));
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    System.out.println("Tests for remove:");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    d.remove(7);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    // d.remove(0);
    // System.out.println(d);
    // System.out.println("IsEmpty: " + d.isEmpty());
    // System.out.println("Length: " + d.length());
    // System.out.println();
    d.remove(6);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    d.remove(5);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    d.remove(4);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    d.remove(3);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    d.remove(2);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    d.remove(1);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    d.remove(0);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    d.remove(0);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    d.remove(-1);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
  }//end of main
}//end of class
