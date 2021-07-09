import java.io.*;
import java.util.*;

public class SortDemoDriver {
    public static void main(String[] args) {

	SortDemo sd = new SortDemo();
	System.out.println(sd);

	SortDemo sd2 = new SortDemo(20);
	System.out.println(sd2);

	int i;
	i = sd.findSmallestIndex(0);
	System.out.println("sd["+ i + "] = "+sd.get(i)+" : " + sd);
	i = sd2.findSmallestIndex(0);
	System.out.println("sd2["+ i + "] = "+sd2.get(i)+" : " + sd2);


	  System.out.println(sd);
	  sd.sort();
	  System.out.println(sd);

  System.out.println("Does sd contain the numbers 5, 6, or 7?");
  System.out.println("If so, the values will appear below. If not, the method will return -1.");
  System.out.println(sd.linearSearch(5));
  System.out.println(sd.linearSearch(6));
  System.out.println(sd.linearSearch(7));

    }
}
