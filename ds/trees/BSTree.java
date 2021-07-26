import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;//instance variable

    public BSTree(){
    	root = null;//default constructor
    }

    //this method inserts an int into the tree
    public void insert(int key){
      TreeNode newNode = new TreeNode(key); //create new node
      //edge case: if tree is empty, make root the new node
      if(root == null){
        root = newNode;
        return;//exit if this happens
      }
      //point front toward the root
      TreeNode front = root;
	    TreeNode trailer = root;//piggyback off front
      //loop until you're off the tree
      while (front != null){
        int frontValue = front.getData();
        if (frontValue == key){
          // in a real BSTree, we would update the value somehow
          return;//exit loop
        } else if (frontValue < key){
          trailer = front;
          front = front.getRight();//go right on tree for values > current
        } else {
          trailer = front;
          front = front.getLeft();//go left on tree for values < current
        }
      }//end of while loop
      //trailer points to new node
      if (key > trailer.getData()){
        trailer.setRight(newNode);
      } else {
        trailer.setLeft(newNode);
      }
    } //end of insert

    //method to search for a specified value in the BSTree
    //returns value if found or null otherwise
    public int search(int key){
      TreeNode current = root;//start at root
      //loop until you are off tree
      while (current != null){
        int currentValue = current.getData();
        if (currentValue == key){
          return currentValue;//return value if found
        } else if (currentValue < key){
          current = current.getRight();//go right on tree for values > current
        } else {
          current = current.getLeft();//go left on tree for values < current
        }
      }//end of while loop
      throw new NullPointerException();//return null if key not found
    } //end of search

    //method below creates a tree of specified design
    public void seed(){
	    TreeNode t;
    	t = new TreeNode(10);
    	root = t;
    	t = new TreeNode(5);
    	root.setLeft(t);
    	t = new TreeNode(20);
    	root.setRight(t);
    	root.getLeft().setRight(new TreeNode(8));
    	t = new TreeNode(15);
    	root.getRight().setLeft(t);
    	t = new TreeNode(22);
    	root.getRight().setRight(t);
  	}
}//end of class
