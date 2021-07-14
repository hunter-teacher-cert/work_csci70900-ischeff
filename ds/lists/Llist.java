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

	// point it to what front points to
    n.setNext(front.getNext());//set n's next to the node after front.

	// point front to the new node
    front.setNext(n);

    }

    public String toString(){
	Node currentNode;
	currentNode = front;
	String result = "";
	while (currentNode != null){
	    result = result + currentNode;
	    // this is like i=i+1 is for arrays
	    // but for linked lists
	    currentNode = currentNode.getNext();
	}
	result = result + "null";
	return result;

    }

}