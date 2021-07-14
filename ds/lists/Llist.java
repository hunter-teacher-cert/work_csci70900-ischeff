import java.io.*;
import java.util.*;


public class Llist{
    private Node front; // the front of the list

    public  Llist(){
	front = null;
    }

    // Add a new node containing data
    // at the front of the list
    public void addFront(String data){
	// make the new node
    Node n = new Node(data);//how can I make this variable more descripte?
    if(front != null){//check if list is NOT empty, basically
      n.setNext(front.getNext());// point it to what front points to
      front.setNext(n);// point front to the new node
    } else{
      front = n;
    }


    }

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

    }

}
