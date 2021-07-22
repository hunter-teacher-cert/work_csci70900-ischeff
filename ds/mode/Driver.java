import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {
  	Mode m = new Mode(100000);
  	//System.out.println(m);
    //m.allFreq();
    //System.out.println();
    long start = System.currentTimeMillis();
    System.out.println("find mode: "+m.calcMode());
    long end = System.currentTimeMillis() -start;
    System.out.println(end+" ms");
  }
}
