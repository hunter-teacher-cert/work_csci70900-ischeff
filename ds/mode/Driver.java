import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {
  	Mode m = new Mode();
  	System.out.println(m);
    m.allFreq();
    System.out.println();
    System.out.println("find mode: "+ m.calcMode());
  }
}//end of class
