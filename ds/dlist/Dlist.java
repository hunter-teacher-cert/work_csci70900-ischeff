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
	   front = new Node();
     tail = new Node();
     front.setNext(tail);
     tail.setNext(front);
     size = 0;
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
  * This method returns true if the dlist is empty. This is true if the size is zero.
  *
  * @return true if size of dlist is zero, otherwise false.
  */
  public boolean isEmpty(){
    return(size == 0);
  }

  //method to check header
  public String getFront(){
    if(isEmpty()){
      return null;
    } else {
      return front.getNext().getData();
    }
  }

  //method to check tail
  public String getTail(){
    if(isEmpty()){
      return null;
    } else {
      return tail.getPrev().getData();
    }
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
    insertBetween(data, front, front.getNext());
      // Node n = new Node(data, front.getNext(), front);
      // size++;
    // }
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
    insertBetween(data, tail.getPrev(), tail);
    // if(size == 0){
    //   Node n = new Node(data, tail, front);
    // } else{
    //   Node n = new Node(data, tail, tail.getPrev());
    // // }
    // size++;
  }

  //method to insert node in between existing nodes (private methodt o be used in other methods)
  private void insertBetween(String value, Node predecessor, Node successor){
    Node newNode = new Node(value, successor, predecessor);
    predecessor.setNext(newNode);
    successor.setPrev(newNode);
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
    if (size == 0){
      return ("List is empty!");
    } else {
      Node currentNode = front.getNext();
      String result = "";
      while (currentNode != tail){
    	    result = result + currentNode + " --> ";//do I need currentNode.getData()?
    	    currentNode = currentNode.getNext();
      }
      result = result + "null";
    	return result;
  	}
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
    //  return;
    } else if (index > size / 2){
        Node currentNode = tail.getPrev();
        int counter = size - 1;
        while (currentNode != front){
          if (counter == index){
            Node newNode = new Node(value, currentNode, currentNode.getPrev());
            currentNode.getPrev().setNext(newNode);//think this was missing!
            currentNode.setPrev(newNode);
            size++;
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
          Node newNode = new Node(value, currentNode, currentNode.getPrev());
          currentNode.getPrev().setNext(newNode);//think this was missing!
          currentNode.setPrev(newNode);
          size++;
          break;
        }
        counter++;
        currentNode = currentNode.getNext();
      }
    }
  }

  /**
  * Returns the index of the first node with the data value key.
  * Returns -1 if the key is not found in the dlist.
  *
  * @param key - the data for which you are searching in the dlist.
  *
  * @return the index of the first node with the data value key.
  * @return -1 if the key is not found.
  */
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

  /**
  * Removes the node at the given index by pointing the previous and next nodes to each other.
  * Severs all connection to the node at index by also pointing that node to null for prev and next.
  * Throws NullPointerException if the index is out of bounds or the dlist is already empty.
  *
  * @param index - the index at which you want to remove a node from the dlist.
  *
  * @return void
  */
  public void remove(int index){
    if (index > size || index < 0){
      throw new NullPointerException("Not a valid index!");
    } else if (size == 0){
      throw new NullPointerException("List is aleady empty!");
    } else if (index > size / 2){
      Node currentNode = tail.getPrev();
      int counter = size - 1;
      while (currentNode != front){
        if (counter == index){
          (currentNode.getPrev()).setNext(currentNode.getNext());
          (currentNode.getNext()).setPrev(currentNode.getPrev());
          currentNode.setPrev(null);
          currentNode.setNext(null);
          size--;
          //break;
        }
      }
    } else {
      Node currentNode = front.getNext();
      int counter = 0;
      while (currentNode != tail){
        if (counter == index){
          (currentNode.getPrev()).setNext(currentNode.getNext());
          (currentNode.getNext()).setPrev(currentNode.getPrev());
          currentNode.setPrev(null);
          currentNode.setNext(null);
          size--;
          //break;
        }
      }
    }
  }//end of remove

}//end of class
