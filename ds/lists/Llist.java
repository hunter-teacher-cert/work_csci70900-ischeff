import java.io.*;
import java.util.*;


public class Llist{
  private Node front; // the front of the list
  //private int size = 0; //the magnitude of the list

  public  Llist(){
	   front = null;
  }

  // Add a new node containing data
  // at the front of the list
  public void addFront(String data){
	// make the new node, point to front (shout out to Liam for showing how to simplify this!)
    Node n = new Node(data, front);
    front = n; //now n is the front
    //size++;
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


  // returns True if there is nothing in the list
  // False otherwise
  //note: if the list points to null, it is empty.
  public boolean isEmpty(){
    return(front == null); // this will return true if the list points to null
  }

  // returns the number of items in the list
  // Hint: look at the toString
  // to remind you how to traverse down the list
  public int length(){
    Node currentNode = front;
  	int counter = 0;
  	while (currentNode != null){
  	    counter++;
  	    currentNode = currentNode.getNext();
  	}
  	return counter;
  }

  // returns the item at location index;
  // returns null if there aren't enough
  // items. Starts with index 0
  public String get(int index){
    Node currentNode = front;
    int counter = 0;
    while (currentNode!= null){
      if(counter == index){
        return currentNode.getData();
      }
      counter++;
      currentNode = currentNode.getNext();
    }
    return null;
    // if (index >= size){
    //   System.out.println(size);
    //   return null;
    // }
    // for(int i = 0; i < index; i++){
    //   currentNode = currentNode.getNext();
    // }
    // return currentNode.getData();
    //if the index is greater than the lenght of the linked list return null
    //return null;
  //Ian's questions: how do we create the index? Can we use the .length method?
  }//end of get

  // sets the item at location index (starting
  // with 0) to value.
  // only sets if the index is within range
  public void set(int index, String value){
    Node currentNode = front;
    int counter = 0;
    while (currentNode!= null){
      if(counter == index){
        currentNode.setData(value);
        break;
      }
      counter++;
      currentNode = currentNode.getNext();
    }
  }//end of set

  // insert an item before index.
  // only inserts if the index is within bounds
  // Hint: look at toString for hints on
  // traversal and draw out a diagram.
  // You will need a variable that refers to
  // the node BEFORE you want to do the insertion.
  public void insert(int index, String value){

  }

  // returns the index of the first item with
  // data value key. Returns -1 if not found
  public int search(String key){
	return -1;
  }

  // removes the node at index.
  // does nothing if index out of bounds
  public void remove(int index){

  }


  }//end of class
