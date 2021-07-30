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

  /**
  * This method returns the front of the dlist. First, the method checks if the list is empty.
  * If the list is not empty, the dlist returns the data of the node after the front sentinel node.
  *
  * @return the data of the first node after the front sentinel node of the dlist.
  */
  public String getFront(){
    if(isEmpty()){
      return null;
    } else {
      return front.getNext().getData();
    }
  }

  /**
  * This method returns the tail of the dlist. First, the method checks if the list is empty.
  * If the list is not empty, the dlist returns the data of the node before the tail sentinel node.
  *
  * @return the data of the first node before the tail sentinel node of the dlist.
  */
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
  }

  /**
  * Adds a node to the tail of the dlist. Uses the private subroutine insertBetween
  * to create and insert a new node between the node before the tail and the tail.
  *
  * @param data - the data the node will contain.
  *
  * @return void
  */
  public void addTail(String data){
    insertBetween(data, tail.getPrev(), tail);
  }

  /**
  * Private method to insert a node between two other given nodes.
  *
  * @param value - the String you want the new node to include
  * @param predecessor - the Node before the node you want to insert
  * @param successor - the Node after the node you want to insert
  *
  * @return void
  */
  private void insertBetween(String value, Node predecessor, Node successor){
    Node newNode = new Node(value, successor, predecessor);
    predecessor.setNext(newNode);
    successor.setPrev(newNode);
    size++;
  }

  /**
  * Private method to remove a node between two other given nodes.
  *
  * @param node - the node you want to remove
  *
  * @return string contained by the node you want to remove.
  */
  private String removeBetween(Node node){
    Node predecessor = node.getPrev();
    Node successor = node.getNext();
    predecessor.setNext(successor);
    successor.setPrev(predecessor);
    size--;
    return node.getData();
  }

  /**
  * Returns a string representing the dlist. Traverses the dlist and adds the data from each
  * node to an initially empty string; then appends an "<-->" between nodes. Note that the traversal
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
    	    result = result + currentNode + " <--> ";//do I need currentNode.getData()?
    	    currentNode = currentNode.getNext();
      }
      result = "null <--> " + result + "null";
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
    if(index >= size || index < 0){
      throw new NullPointerException(index + " is not a valid index!");
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
    if(index >= size || index < 0){
      throw new NullPointerException(index + " is not a valid index!");
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
  * This method uses the private subroutine insertBetween to create and add the node.
  * If the index is not in bounds, method will throw a NullPointerException.
  *
  * @param index - the index at which to insert the new node.
  * @param value - the data that the new node will contain.
  *
  * @return void
  */
  public void insert(int index, String value){
    if (index >= size || index < 0){
      throw new NullPointerException("Can't insert at " + index + "!");
    } else if (size == 0){
      this.addFront(value);
    } else if (index > size / 2){
        Node currentNode = tail.getPrev();
        int counter = size - 1;
        while (currentNode != front){
          if (counter == index){
            insertBetween(value, currentNode.getPrev(), currentNode);
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
          insertBetween(value, currentNode.getPrev(), currentNode);
          break;
        }
        counter++;
        currentNode = currentNode.getNext();
      }
    }
  }//end of insert

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
  * Throws NullPointerException if the index is out of bounds or the dlist is already empty.
  * Uses the private subroutine removeBetween to repoint the predecessor and successor nodes to each other.
  *
  * @param index - the index at which you want to remove a node from the dlist.
  *
  * @return void
  */
  public void remove(int index){
    if (index >= size || index < 0){
      throw new NullPointerException(index + " is not a valid index!");
    } else if (size == 0){
      throw new NullPointerException("List is aleady empty!");
    } else if (index > size / 2){
      Node currentNode = tail.getPrev();
      int counter = size - 1;
      while (currentNode != front){
        if (counter == index){
          removeBetween(currentNode);
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
          removeBetween(currentNode);
          break;
        }
        counter++;
        currentNode = currentNode.getNext();
      }
    }
  }//end of remove

}//end of class
