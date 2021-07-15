//Group: Marina + Ian; note: we count as inspiration Tofr, as well as the code from Mike, and Liam and Alex's groups

import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
/*
  Node n;
	n = new Node();
	n.setData("Eduardo");


	Node n2 = new Node("Brian");
	n.setNext(n2);

	System.out.println(n);

	System.out.println(n2);

	System.out.println(n.getNext());
	n.getNext().setNext(new Node("Steph"));
	System.out.println(n2.getNext());
	System.out.println(n.getNext().getNext());
*/

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

  //test for addFront
  Llist l = new Llist();
  l.addFront("Apple");
  System.out.println(l.toString());
  l.addFront("Pear");
  System.out.println(l.toString());
  l.addFront("Banana");
  System.out.println(l.toString());
  l.addFront("Raspberry");
  System.out.println(l.toString());
  l.addFront("Blueberry");
  System.out.println(l.toString());


  //L.setNext(new Node("b"));
  //L.setNext(new Node("b")).setNext(new Node("c").setNext(new Node("d")));
  // L.getNext().setNext(new Node("b"));
  // System.out.println(L);
  // System.out.println(L.getNext());
  // System.out.println(L.getNext().getNext());
  // System.out.println(L.getNext().getNext());
  // L.getNext().setNext(new Node("c"));
  // System.out.println(L);
  // System.out.println(L.getNext().getNext());





//Note: the below is based on Brian, Lyuba, and Mamudu's code, as well as Mike's code:


  }//end of main
}//end of class
