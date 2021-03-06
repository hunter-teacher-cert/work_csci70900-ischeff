import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;//instance variable

    public BSTree(){
    	root = null;//default constructor
    }

    public TreeNode findMax(TreeNode start){
      if (start.getRight()==null){ //base case
        return start;
      }
      return findMax(start.getRight());
    }

    public void delete(int key){
      // if the tree is empty, nothing to delete
      if (root == null){
        return;
      }
      // find the node that we want to delete
      // and the node above it using piggybacking
      TreeNode front = root;
      TreeNode trailer = root;
      // do the piggyback loop
      // until we either find the node or null
      // if the key isn't present
      while (front != null && front.getData() != key ){
        if (front.getData() < key){
          trailer = front;
          front = front.getRight();
        } else {
          trailer = front;
          front = front.getLeft();
        }
      }
      // if the key wasn't in the tree
      if (front == null){
        return;
      }
      // if we get here
      // front points to the node we want to delete
      // and trailer points to the one above it

      // case 1 -- the node we want to delete is a leaf (no children)
      if (front.getLeft() == null && front.getRight() == null) {
        if(front.getData() < trailer.getData()){
          trailer.setLeft(null);
        } else{
          trailer.setRight(null);
        }
      //case 2 = the node we want to delete has one child
      } else if (front.getLeft() == null || front.getRight() == null){
        if(front.getData() < trailer.getData()){
          if(front.getRight() == null){
            trailer.setLeft(front.getLeft());
          } else {
            trailer.setLeft(front.getRight());
          }
        } else {
          if(front.getRight() == null){
            trailer.setRight(front.getLeft());
          } else {
            trailer.setRight(front.getRight());
          }
        }
        // // //~~~~~~~~~~~~~~~~~~~~~~~~
        // // //note: this implementation of the second case doesn't use trailer
        // // //instead, we rewrite the data in front with its child's data, then delete the child.
        // // //(this seemed conceptually more straightforward to me, but might be less efficient)
        // if(front.getRight() == null){
        //   front.setData(front.getLeft().getData());
        //   front.setLeft(null);
        //   return;
        // } else {
        //   front.setData(front.getRight().getData());
        //   front.setRight(null);
        //   return;
        // }
        // // //~~~~~~~~~~~~~~~~~~~~~~~~~

        //case 3 - front has two children
      } else {
            TreeNode max = findMax(front.getLeft());
            this.delete(max.getData());
            front.setData(max.getData());
            //if you are deleting the root, make sure to repoint root to its replacement
            // note: as Brian pointed out, root still points to the same object, so we don't need the code below!
            // if (root.getData() == key){
            //   root = max;
            // }
      }
    }//end of delete

    private void preorderTraverse(TreeNode current){
      if (current == null)
      return;
      //process the current node
      System.out.print(current.getData()+", ");
      // recursively print out the left subtree
      preorderTraverse(current.getLeft());
      // recursively print out the right subtree
      preorderTraverse(current.getRight());
    }

    public void preorderTraverse(){
      preorderTraverse(root);
      System.out.println();
    }

    private void postorderTraverse(TreeNode current){
      if (current == null)
      return;
      // recursively print out the left subtree
      postorderTraverse(current.getLeft());
      // recursively print out the right subtree
      postorderTraverse(current.getRight());
      //process the current node
      System.out.print(current.getData()+", ");
    }

    public void postorderTraverse(){
      postorderTraverse(root);
      System.out.println();
    }

    private void inorderTraverse(TreeNode current){
      if (current == null)
      return;
      // recursively print out the left subtree
      inorderTraverse(current.getLeft());
      //process the current node
      System.out.print(current.getData()+", ");
      // recursively print out the right subtree
      inorderTraverse(current.getRight());
    }

    public void inorderTraverse(){
      inorderTraverse(root);
      System.out.println();
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
