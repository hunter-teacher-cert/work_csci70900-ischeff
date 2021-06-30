/*
 * Exercise 2 in Think Java Chapter 3: Write a program that converts
 * a temperature from Celsius to Fahrenheit. It should (1) prompt the user
 * for input, (2) read a double value from the keyboard, (3) calculate
 * the result, and (4) format the output to one decimal place. Be careful
 * not to use integer division!
 */

import java.util.Scanner;

public class Temperature {

  public static void main(String[] args){
    double celsius;
    double fahrenheit;
    Scanner in = new Scanner(System.in);

    /* Prompting the user to input the temperature in degrees Celsius. */
    System.out.print("Exactly what temperature would you like to convert ");
    System.out.println("from degrees Celsius to degrees Fahrenheit?");
    celsius = in.nextDouble();

    /* Converting the temperature and outputing the result. */
    fahrenheit = (celsius * 9/5 + 32);
    System.out.printf("%.1f C = %.1f F \n", celsius, fahrenheit);

   /*
    * Note: I'm aware that Think Java provides instruction in this Chapter
    * on using literals; however, the integers involved in converting
    * the temperature seeemed fairly unambiguous, and the text says that
    * literals are used to avoid ambiguous constants in code.In my attempt
    * to use literals, I also wasn't sure how to chunk the conversion
    * the way the cm<->in one was done in the example,since the
    * temp conversion doesn't involve just one constant. At any rate,
    * I'm open to any feedback!
    */
  }

}
