import java.io.*;
import java.util.*;


public class Llist{
  private Node front; // the front of the list

  public  Llist(){
	   front = null;
  }//end of Llist

  // Add a new node containing data
  // at the front of the list
  public void addFront(String data){
	// make the new node
    Node n = new Node(data);//how can I make this variable more descripte?
    n.setNext(front);
    front = n;
    // if(front == null){
    //   front = n;
    // } else{
    //   n.setNext(front);
    //   front = n;
    // }
  }//end of addFront

  public String toString(){
  	Node currentNode;
  	currentNode = front;
  	String result = "";
  	while (currentNode != null){
  	    result = result + currentNode + " --> ";
  	    // this is like i=i+1 is for arrays
  	    // but for linked lists
  	    currentNode = currentNode.getNext();
  	}
  	result = result + "null";
  	return result;

  }//end of toString
}//end of class
