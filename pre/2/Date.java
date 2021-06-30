/* Exercise 2 in Think Java Chapter 2 */
public class Date {

    public static void main(String[] args) {
     /*
      * 1) Create a new program called Date.java. Copy or type
      * in something like the hello world program and make sure you can
      * compile and run it.
      */
      System.out.println("Hello!");
      System.out.println("What day is it?");

     /*
      * 2) Following the example in Section 2.4, write a program that
      * creates variables named day, date, month, and year.
      * Assign values to those variables that represent today's date.
      */
      String day = "Tuesday";
      int date = 26;
      String month = "January";
      int year = 2021;

     /*
      * 3) Display (print out) the value of each variable on a line
      * by itself. Compile and run your program before moving on.
      */
      System.out.println(day);
      System.out.println(date);
      System.out.println(month);
      System.out.println(year);

     /*
      * 4) Modify the program so that it displays the date in standard
      * American format, for example: Thursday, July 16, 2015.
      */
      System.out.println("American format:");
      System.out.println(day + ", " + month + " " + date + ", " + year);

     /*
      * 5) Modify the program so it also displays the date in European format.
      */
      System.out.println("European format:");
      System.out.println(day + " " + date + " " + month + " " + year);
    }
}
