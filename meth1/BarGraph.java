import java.io.*;
import java.util.*;

public class BarGraph{
  // public static int bar(){
  //
  // }//end bar
  public static int userInput(){
    int input = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("How many values do you want in your bar graph?");
    input =in.nextInt();
    //System.out.println(input);
    return input;
  }//end userInput

  public static int[] arrayMaker(int a){
    int[] pos = new int[a];
    Random rando = new Random();
    for(int i = 0; i < pos.length; i++){
      pos[i] = rando.nextInt(10);
    }//end of for loop
    System.out.println(Arrays.toString(pos));
    return pos;
  }//end arrayMaker

  public static void horBar(int[] a){
    for(int i =0;i < a.length;i++){
      System.out.print(i + " :  ");
      int value = a[i];
        for(int j = 0;j < value; j++){
            //String barLen = " ";
            //barLen = barLen + "=";
            System.out.print("=");
        }//end of nested for loop
      System.out.println();
    }//end of for loop
//  print out each index + : + number of = equal to the value at that index
  }//horbar end

  public static void vertBar(int[] a){
    //not sure how we would approach this yet--might be easier to actually approach the problem totally differently, since we can't really print things vertically (I'm imagining printing this as a 2D array makes more conceptual sense?)
  }//end of vertBar

  public static void main(String[] args){
    //System.out.println("Hello, world!");
    //userInput();
    horBar(arrayMaker(userInput()));
    //create a scanner
    //random input(4 ints)
  }//end of main
}//end of class
