import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;//instance variable

    public BSTree(){
    	root = null;//default constructor
    }

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
      return -1;//return null if key not found
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
