//Collab between Steph and Ian; this program is for a pair programming exercise.
/*
barGraphify(nums) takes a list of non-negative integers and prints a horizontal bar for each index, commensurate with the value at said index. Exempli gratia, for x = {0,1,2,3}:
barGraphify(x)
0:
1: =
2: ==
3: ===
and for x = {1,0,3,2}
barGraphify(x)
0: =
1:
2: ===
3: ==
*/

import java.io.*;
import java.util.*;

public class BarGraph{

  /*
  * This method has no parameters, and is designed to solicit user input.
  * It will validate user input, and only accept non-negative and nonzero ints.
  * It will then return one non-negative and nonzero int.
  */
  public static int userInput(){
    int input = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("How many values do you want in your bar graph?");
    input =in.nextInt();
    while (input <= 0){
      System.out.println("Sorry! Non-negative and nonzero integers only. Please try again!");
      input =in.nextInt();
    }
    return input;
  }

  /*
  * This method accepts one int "a" as a parameter. It then creates an array
  * of size a, and populates the array with random numbers. The range of the
  * random numbers is arbitrary and hardcoded on line 48. The method returns an int array.
  */
  public static int[] arrayMaker(int a){
    int[] pos = new int[a];
    Random rando = new Random();
    for(int i = 0; i < pos.length; i++){
      pos[i] = rando.nextInt(10);
    }
    //System.out.println(Arrays.toString(pos));
    return pos;
  }

  /*
  * This method accepts an int array as a parameter. It then loops through
  * the array, and prints out each index on a separate line, along with
  * a string of equals signs commensurate with the value at each index.
  * In this way, the method generates the bar graph asked for in the instructions.
  * The method does not return anything and must be called in main to print.
  */
  public static void horBar(int[] a){
    for(int i =0;i < a.length;i++){
      System.out.print(i + " :  ");
      int value = a[i];
        for(int j = 0;j < value; j++){
            System.out.print("=");
        }
      System.out.println();
    }
  }

  /*
  * If I have time, this method will take the same array as horBar, but print it as a vertically
  * oriented bar graph. Obviously, this will be more challenging, since you have to print one line at a time.
  * Note to self: might make sense to use a 2-D array.
  */
  public static void vertBar(int[] a){
    //not sure how we would approach this yet--might be easier to actually approach the problem totally differently, since we can't really print things vertically (I'm imagining printing this as a 2D array makes more conceptual sense?)
  }//end of vertBar

  /*
  * The main method calls horBar, to generate the graph, taking arrayMaker as input.
  * In turn, arrayMaker takes userInput as input.
  */
  public static void main(String[] args){
    horBar(arrayMaker(userInput()));
  }//end of main
}//end of class
