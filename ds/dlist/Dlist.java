import java.io.*;
import java.util.*;

public class Dlist{
  private Node front; // the front of the list
  private Node tail; //the end of the list
  private int size; //size of list

  public Dlist(){
	   front = null;
     tail = null;
     size = 0;
  }
  // Add a new node containing data
  // at the front of the list
  public void addFront(String data){
    if(size == 0){
      Node n = new Node(data, tail, front);
    } else{
      Node n = new Node(data, front.getNext(), front);
    }
    size++;
  }

  // should we create this method?
  public void addTail(String data){
    if(size == 0){
      Node n = new Node(data, tail, front);
    } else{
      Node n = new Node(data, tail.getPrev(), tail)
    }
    size++;
  }

  public String toString(){
  	Node currentNode = front.getNext();
  	String result = "";
  	while (currentNode != tail){
  	    result = result + currentNode + " --> ";//do I need currentNode.getData()?
  	    currentNode = currentNode.getNext();
  	}
  	result = result + "null";
  	return result;
  }

  // returns True if there is nothing in the list
  // False otherwise
  //note: if the list points to null, it is empty.
  public boolean isEmpty(){
    return(size == 0);
  }

  // returns the number of items in the list
  // Hint: look at the toString
  // to remind you how to traverse down the list
  public int length(){
    return size;
  }

  //need to refactor get, set, and insert to take advantage of double linkage
  //you should compare the index to the size --> if closer to tail (i.e., greater than half of size, then traverse in reverse)
  //otherwise, traverse going forwards.

  // returns the item at location index;
  // returns null if there aren't enough
  // items. Starts with index 0
  public String get(int index){
    if (index > size / 2){
      Node currentNode = tail.getPrev();
      int counter = 0;
      while (currentNode != front){
        if (counter == size - 1){
          return currentNode.getData();
        }
        counter++
        currentNode = currentNode.getPrev();
      }
    } else {
      Node currentNode = front.getNext();
      int counter = 0;
      while (currentNode != tail){
        if(counter = index){
          return currentNode.getData();
        }
        counter++;
        currentNode = currentNode.getNext();
      }
    }
    return null;
  }//end of get

  // sets the item at location index (starting
  // with 0) to value.
  // only sets if the index is within range
  public void set(int index, String value){
    if(index > size / 2){
      Node currentNode = tail.getPrev();
      int counter = 0;
      while (currentNode != front){
        if (counter == size - 1){
          currentNode.setData(value);
          break;
        }
      }
    } else {
      Node currentNode = front.getNext();
      into counter = 0;
      while (curentNode != tail){
        if (counter == index){
          currentNode.setData(value);
          break;
        }
      }
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
    Node currentNode = front.getNext();
    int counter = 0;
    while (currentNode != tail){
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
