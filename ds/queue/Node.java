/**
* Node is a class that instantiates Node objects.
*/

import java.io.*;
import java.util.*;

public class Node {

  /**
  * Instance variables. Each node object contains a String and a pointer to the next node.
  */
  private String data;
  private Node next;

  /**
  * Default constructor. Each queue object is intialized to contain an empty string and point to null.
  */
  public Node() {
    data = "";
    next = null;
  }

  /**
  * Value constructor. Each queue object can be intialized to contain a given string.
  *
  * @param value - whatever string you want the node to contain.
  */
  public Node(String value) {
    data = value;
    next = null;
  }

  /**
  * Value constructor. Each queue object can be intialized to contain a given string and point to a given node.
  *
  * @param value - whatever string you want the node to contain.
  * @param next - whichever node you want the new node to point to.
  */
  public Node(String value, Node next) {
    data = value;
    this.next = next;
  }

  /**
  * Replaces the data contained in a given node with a given string input.
  *
  * @param value - whatever string you want the node to contain.
  * @return void
  */
  public void setData(String value) {
    data = value;
  }

  /**
  * Repoints a given node to another given node.
  *
  * @param n - whichever node you want this node to point to.
  * @return void
  */
  public void setNext(Node n) {
    next = n;
  }

  /**
  * Returns the string contained in a node.
  *
  * @return the string contained in a node.
  */
  public String getData() {
    return data;
  }

  /**
  * Returns the node to which a given node currently points.
  *
  * @return the node to which a given node currently points.
  */
  public Node getNext() {
    return next;
  }

  /**
  * Returns the string contained in a given node. .
  *
  * @return he string contained in a given node.  
  */
  public String toString() {
    return data;
  }

}//class Node
