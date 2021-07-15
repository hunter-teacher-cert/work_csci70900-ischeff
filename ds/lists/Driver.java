//Group: Marina + Ian; note: we count as inspiration Tofr, as well as the code from Mike, and Liam and Alex's groups

import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {

// 1.Create a new  list that looks like:
//   L->"a"->"b"->"c"->"d"
	Node L; //L points to a node
  Node a = new Node("a");//this line and the next three lines
  Node b = new Node("b");
  Node c = new Node("c");
  Node d = new Node("d");
//Note: we really like how Lyuba's group went in reverse!

  //the code below links together the nodes
  L = a;
  a.setNext(b);
  b.setNext(c);
  c.setNext(d);
  //test print (after mike's example)
  while (L != null){
    System.out.print(L + " --> ");
    L = L.getNext();
  }
  System.out.println("null");

  //L --> a --> b --> c --> d --> Null

  // 2. Write the code to insert an "x"
  //    between the b and the c
  Node x = new Node("x");
  x.setNext(c);
  b.setNext(x);
  L = a;//repointing L to the start of the list
  while (L != null){//test print
    System.out.print(L + " --> ");
    L = L.getNext();
  }
  System.out.println("null");

  //L --> a --> b --> x --> c --> d --> Null

  // 3. Write the code to delete the c
  b.setNext(d);
  L = a;//repointing L to the start of the list
  while (L != null){//test print
    System.out.print(L + " --> ");
    L = L.getNext();
  }
  System.out.println("null");

  //Below are tests for the new methods add to the LList class;
  Llist l = new Llist();

  System.out.print("Test for isEmpty: {");
  System.out.println("expected: true | actual: " + l.isEmpty() + "}");//test for isEmpty (should return true)

  System.out.print("Test for addFront: {");
  System.out.print("expected: Apple --> null | actual: ");
  l.addFront("Apple");
  System.out.println(l + "}");

  System.out.print("Test for length: {");
  System.out.println("expected: 1 | actual: " + l.length() + "}");

  System.out.println("Add more fruits to list:");
  l.addFront("Pear");
  System.out.println(l);
  l.addFront("Banana");
  System.out.println(l);
  l.addFront("Raspberry");
  System.out.println(l);
  l.addFront("Blueberry");
  System.out.println(l);

  System.out.print("Test for length: {");
  System.out.println("expected: 5 | actual: " + l.length() + "}");

  System.out.print("Test for get at index 0: {");
  System.out.println("expected: Blueberry | actual: " + l.get(0) + "}");

  System.out.print("Test for get at index 6: {");
  System.out.println("expected: null | actual: " + l.get(6) + "}");

  System.out.println("Test for set(0, Kumquat):");
  System.out.println("\t expected: Kumquat --> Raspberry --> Banana --> Pear --> Apple --> null");
  l.set(0, "Kumquat");
  System.out.println("\t actual: " + l);

  System.out.println("Test for set(6, Kumquat):");
  System.out.println("\t expected: Kumquat --> Raspberry --> Banana --> Pear --> Apple --> null");
  l.set(6, "Kumquat");
  System.out.println("\t actual: " + l);

  System.out.println("Test for insert(2, Pluot):");
  System.out.println("\t expected: Kumquat --> Raspberry --> Pluot --> Banana --> Pear --> Apple --> null");
  l.insert(2, "Pluot");
  System.out.println("\t actual: " + l);

  System.out.println("Test for insert(10, Pluot):");
  System.out.println("\t expected: Kumquat --> Raspberry --> Pluot --> Banana --> Pear --> Apple --> null");
  l.insert(10, "Pluot");
  System.out.println("\t actual: " + l);

  }//end of main
}//end of class
