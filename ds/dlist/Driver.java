import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args){
    Dlist d = new Dlist();
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println();
    d.addFront("Apple");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println("Front: " + d.getFront());
    System.out.println("Tail: " + d.getTail());
    System.out.println();
    d.addTail("Peach");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println("Front: " + d.getFront());
    System.out.println("Tail: " + d.getTail());
    System.out.println();
    d.insert(1, "Papaya");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println("Front: " + d.getFront());
    System.out.println("Tail: " + d.getTail());
    System.out.println();
    System.out.println("What's at index 0? " + d.get(0));
    System.out.println("What's at index 1? " + d.get(1));
    System.out.println("What's at index 2? " + d.get(2));
    // System.out.println("What's at index 3? " + d.get(3)); //(should throw exception)
    // d.insert(-1, "Apple");//should throw exception
    // d.insert(-15, "Apple");//should throw exception
    // d.insert(25, "Apple");//should throw exception
    System.out.println();
    d.set(2, "Plum");
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println("Front: " + d.getFront());
    System.out.println("Tail: " + d.getTail());
    System.out.println();
    System.out.println("At what index is Apple? " + d.search("Apple"));
    System.out.println("At what index is Papaya? " + d.search("Papaya"));
    System.out.println("At what index is Plum? " + d.search("Plum"));
    // d.set(-15, "Plum");//should throw an exception
    // d.set(25, "Plum");//should throw an exception
    System.out.println();
    d.remove(2);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println("Front: " + d.getFront());
    System.out.println("Tail: " + d.getTail());
    System.out.println();
    // d.remove(2);//should throw an exception
    // d.remove(-1); //should throw an exception
    // d.remove(25); //should throw an exception
    d.remove(1);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println("Front: " + d.getFront());
    System.out.println("Tail: " + d.getTail());
    System.out.println();
    d.remove(0);
    System.out.println(d);
    System.out.println("IsEmpty: " + d.isEmpty());
    System.out.println("Length: " + d.length());
    System.out.println("Front: " + d.getFront());
    System.out.println("Tail: " + d.getTail());
  }//end of main
}//end of class
