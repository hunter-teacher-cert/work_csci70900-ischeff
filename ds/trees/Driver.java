import java.io.*;
import java.util.*;


public class Driver {
    public static void main(String[] args) {
      BSTree t = new BSTree();
      //create tree of specified design
      t.seed();
      //create an int to hold values
      int value;
      //search for 10 in the tree (should be there--it's the root!)
      value = t.search(10);
      System.out.println(value);
      //search for 15 in the tree (should be there)
      value = t.search(15);
      System.out.println(value);
      //search for 17 in tree (should NOT be there)
      try {
        value = t.search(17);
        System.out.println(value);
      } catch (NullPointerException e) {
        System.out.println("17 not in tree");
      }
      BSTree t2 = new BSTree();
      //insert tests
      t2.insert(10);
      t2.insert(20);
      t2.insert(5);
      t2.insert(7);
      t2.insert(8);
      t2.insert(3);
      t2.insert(25);
      //traversal tests
      t2.preorderTraverse();
      t2.postorderTraverse();
      t2.inorderTraverse();
      //deletion tests
    }//end of main
}//end of class
