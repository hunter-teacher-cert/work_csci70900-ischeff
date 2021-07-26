import java.io.*;
import java.util.*;


public class Dlist{
  private Node front; // the front of the list
  //private Node tail; //the end of the list

  public  Dlist(){
	   front = null;
     //tail = null; //should there be another instance variable that points to the end?
  }
  // Add a new node containing data
  // at the front of the list
  public void addFront(String data){
	// make the new node, point to front (shout out to Liam for showing how to simplify this!), and prev to null
    Node n = new Node(data, front, null);
    front = n;
  }
  // should we create this method?
  // public void addTail(String data){
  //
  // }

  public String toString(){
  	Node currentNode = front;
  	String result = "";
  	while (currentNode != null){
  	    result = result + currentNode + " --> ";
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
  public void insert(int index, String value){
    Node currentNode = front;
    int counter = 0;
    if (index == 0){
      Node newNode = new Node(value, front, null);
      front = newNode;
    }
    while (currentNode != null){
      if (counter == index - 1){
        Node newNode = new Node(value, currentNode.getNext(), currentNode);
        currentNode.getNext().setPrev(newNode);//point node after current node back to new node
        currentNode.setNext(newNode);//point current Node to new node
        break;
      }
      counter++;
      currentNode = currentNode.getNext();
    }
  }

  // returns the index of the first item with
  // data value key. Returns -1 if not found
  public int search(String key){
    Node currentNode = front;
    int counter = 0;
    while (currentNode != null){
      if (currentNode.getData() == key){
        return counter;
      }
      counter ++;
      currentNode = currentNode.getNext();
    }
	return -1;
  }

  // removes the node at index.
  // does nothing if index out of bounds
  public void remove(int index){
    Node currentNode = front;
    int counter = 0;
    //edge case: you are trying to delete a node from an index that does not exist
    if (index >= this.length()){
      return;
    }
    //edge case: you are trying to delete the last node from a one-node list.
    if (index == 0 && this.length() == 1){
      front = null;
      return;
    }
    //edge case: you are trying to delete the 0th node from a list with at least two nodes
    if (index == 0){
      front = currentNode.getNext();
      front.setPrev(null);//just to make sure the new front points back to null (not sure if this is necessary)
      return;
    }
    while (currentNode != null){
      //edge case: you are trying to delete the last node from a list with multiple nodes
      if (counter == index - 1 && index == this.length() - 1){
        currentNode.getNext().setPrev(null);
        currentNode.setNext(null);
        break;
      }
      //"regular" case: if you are trying to remove a node NOT at the beginning or end in a multi-node list
      if (counter == index - 1){
        currentNode.setNext(currentNode.getNext().getNext());//need to get the next AFTER the next since we are at index - 1
        currentNode.getNext().setPrev(currentNode);//point new next node's prev pointer to current node
        break;
      }
     counter ++;
     currentNode = currentNode.getNext();
    }
  }//end of remove

}//end of class
