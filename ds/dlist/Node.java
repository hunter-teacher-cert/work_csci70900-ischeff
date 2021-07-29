/**
* Node is a class that instantiates Node objects.
*/

import java.io.*;
import java.util.*;

public class Node {

  /**
  * Instance variables. Each node object contains a String and a pointer to the next node and previous node.
  */
  private String data;
  private Node next;
  private Node prev;

  /**
  * Default constructor. Each node object is intialized to contain an empty string and point to null with both prev and next pointers.
  */
  public Node() {
    data = "";
    next = null;
    prev = null;
  }

  /**
  * Value constructor. Each node object can be intialized to contain a given string, while still pointing to null from prev and next.
  *
  * @param value - whatever string you want the node to contain.
  */
  public Node(String value) {
    data = value;
    next = null;
    prev = null;
  }

  /**
  * Value constructor. Each node object can be intialized to contain a given string and point to a given node from prev and next.
  *
  * @param value - whatever string you want the node to contain.
  * @param next - whichever node you want the new node to point to.
  * @param prev - whichever node you want the new node to point to.
  */
  public Node(String value, Node next, Node prev) {
    data = value;
    this.next = next;
    this.prev = prev;
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
  * Repoints a given node's next pointer to another given node.
  *
  * @param n - whichever node you want this node to point to.
  * @return void
  */
  public void setNext(Node n) {
    next = n;
  }

  /**
  * Repoints a given node's prex pointer to another given node.
  *
  * @param p - whichever node you want this node to point to.
  * @return void
  */
  public void setPrev(Node p) {
    prev = p;
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
  * Returns the node to which a given node's next pointer currently points.
  *
  * @return the node to which a given node's next pointer currently points.
  */
  public Node getNext() {
    return next;
  }

  /**
  * Returns the node to which a given node's prev pointer currently points.
  *
  * @return the node to which a given node's prev pointer currently points.
  */
  public Node getPrev() {
    return prev;
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
