/**
* Dlist is a class that instantiates doubly-linked lists, or Dlist objects.
*/

import java.io.*;
import java.util.*;

public class Dlist{

  /**
  * Instance variables. Each dlist object begins with two nodes, head and tail.
  * These nodes serve as sentinels. That is, they serve to bookend the data-containing nodes.
  * Each dlist also contains a reference to its own size.
  */
  private Node front;
  private Node tail;
  private int size;

  /**
  * Default constructor. Each dlist object has its head and tail initially point to null.
  * The initial size of the dlist object is zero.
  */
  public Dlist(){
	   front = null;
     tail = null;
     size = 0;
  }

  /**
  * Adds a node to the front of the dlist. When the list is empty (i.e., size == 0),
  * the node is positioned between tail and front. When the list is non-empty (i.e., size > 0),
  * the node is positioned between front and the node that follows front.
  *
  * @param data - the data the node will contain.
  * @return void
  */
  public void addFront(String data){
    if(size == 0){
      Node n = new Node(data, tail, front);
    } else{
      Node n = new Node(data, front.getNext(), front);
    }
    size++;
  }

  /**
  * Adds a node to the tail of the dlist. When the list is empty (i.e., size == 0),
  * the node is positioned between tail and front. When the list is non-empty (i.e., size > 0),
  * the node is positioned between tail and the node that precedes tail.
  *
  * @param data - the data the node will contain.
  *
  * @return void
  */
  public void addTail(String data){
    if(size == 0){
      Node n = new Node(data, tail, front);
    } else{
      Node n = new Node(data, tail, tail.getPrev());
    }
    size++;
  }

  /**
  * Returns a string representing the dlist. Traverses the dlist and adds the data from each
  * node to an initially empty string; then appends an "-->" between nodes. Note that the traversal
  * starts from the node after the front, and ends when we reach the tail.
  *
  * @return the string to be printed.
  */
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

  /**
  * This method returns true if the dlist is empty. This is true if the size is zero.
  *
  * @return true if size of dlist is zero, otherwise false.
  */
  public boolean isEmpty(){
    return(size == 0);
  }

  /**
  * This method returns the size of the queue as an integer.
  *
  * @return the size of the queue, as an integer.
  */
  public int length(){
    return size;
  }

  /**
  * Returns the data contained in a node at a given index.
  * Checks to see if the index is in the half of the dlist closer to head or tail.
  * If the given index is closer to tail, method starts at tail and traverses in reverse to find the index.
  * If the given index is closer to head, method starts at head and traverses forward to find the index.
  * Once the index is found, the method returns the data contained in the node at the given index.
  * If the index is not in bounds, will throw a NullPointerException.
  *
  * @param index - the index from which to return the node's data.
  *
  * @return string data contained by the node at the given index.
  */
  public String get(int index){
    if(index > size || index < 0){
      throw new NullPointerException("Not a valid index!");
    } else if (index > size / 2){
        Node currentNode = tail.getPrev();
        int counter = size - 1;
        while (currentNode != front){
          if (counter == index){
            return currentNode.getData();
          }
          counter--;
          currentNode = currentNode.getPrev();
        }
    } else {
      Node currentNode = front.getNext();
      int counter = 0;
      while (currentNode != tail){
        if(counter == index){
          return currentNode.getData();
        }
        counter++;
        currentNode = currentNode.getNext();
      }
    }
    return null;
  }//end of get

  /**
  * Sets the data contained in a node at a given index.
  * Checks to see if the index is in the half of the dlist closer to head or tail.
  * If the given index is closer to tail, method starts at tail and traverses in reverse to find the index.
  * If the given index is closer to head, method starts at head and traverses forward to find the index.
  * Once the index is found, the method sets the data contained in the node at the given index to the data in the parameter value.
  * If the index is not in bounds, will throw a NullPointerException.
  *
  * @param index - the index at which to set the node's data.
  * @param value - the string with which to set the data of the node at the given index.
  *
  * @return void
  */
  public void set(int index, String value){
    if(index > size || index < 0){
      throw new NullPointerException("Not a valid index!");
    } else if(index > size / 2){
        Node currentNode = tail.getPrev();
        int counter = size - 1;
        while (currentNode != front){
          if (counter == index){
            currentNode.setData(value);
            break;
          }
          counter--;
          currentNode = currentNode.getPrev();
        }
    } else {
      Node currentNode = front.getNext();
      int counter = 0;
      while (currentNode != tail){
        if (counter == index){
          currentNode.setData(value);
          break;
        }
        counter++;
        currentNode = currentNode.getNext();
      }
    }
  }//end of set

  /**
  * Inserts a node at a given index.
  * Checks to see if the index is in the half of the dlist closer to head or tail.
  * If the given index is closer to tail, method starts at tail and traverses in reverse to find the index.
  * If the given index is closer to head, method starts at head and traverses forward to find the index.
  * Once the index is found, the method creates a new node using the data passed as a parameter.
  * The new node is then inserted into the dlist before the node at index.
  * If the index is not in bounds, will throw a NullPointerException.
  *
  * @param index - the index at which to insert the new node.
  * @param value - the data that the new node will contain.
  *
  * @return void
  */
  public void insert(int index, String value){
    if (index > size || index < 0){
      throw new NullPointerException("Can't insert there!");
    } else if (size == 0){
      this.addFront(value);
      size++;
      //break;//do I need these break statements?
    } else if (index > size / 2){
        Node currentNode = tail.getPrev();
        int counter = size - 1;
        while (currentNode != front){
          if (counter == index){
            Node newNode = new Node(value, currentNode, currentNode.getPrev());
            size++;
          //  break;
          }
          counter--;
          currentNode = currentNode.getPrev();
        }
    } else {
      Node currentNode = front.getNext();
      int counter = 0;
      while (currentNode != tail){
        if (counter == index){
          Node newNode = new Node(value, currentNode, currentNode.getPrev());
          size++;
        //  break;
        }
        counter++;
        currentNode = currentNode.getNext();
      }
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
