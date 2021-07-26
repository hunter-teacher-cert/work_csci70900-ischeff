import java.io.*;
import java.util.*;

public class Node {

  private String data;
  private Node next;
  private Node prev;

  public Node() {
    data = "";
    next = null;
    prev = null;
  }

  public Node(String value) {
    data = value;
    next = null;
    prev = null;
  }

  public Node(String value, Node next, Node prev) {
    data = value;
    this.next = next;
    this.prev = prev;
  }

  public void setData(String value) {
    data = value;
  }

  public void setNext(Node n) {
    next = n;
  }

  public void setPrev(Node p) {
    prev = n;
  }

  public String getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }

  public Node getPrev() {
    return prev;
  }

  public String toString() {
    return data;
  }

}//class Node
