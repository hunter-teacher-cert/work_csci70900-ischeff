import java.io.*;
import java.util.*;

public class Test{

    public static String myAgeIs(String firstName, String lastName, int age){
      //first, we create an empty string to store the output.
      String result = "";
      //then we assign the empty string to the concatenation of the parameters.
      result = firstName + " " + lastName + " is " + age + " years old.";
      //then we return the result.
      return result;
    }

    public static String euroDate(String month, String day, int date, int year){
      String result = "";
      result = day + " " + date + " " + month + ", " + year + ".";
      return result;
    }

    public static String amDate(String month, String day, int date, int year){
      String result = "";
      result = day + ", " + month + " " + date + ", " + year + ".";
      return result;
    }

    public static String getMonth(){
      Scanner in = new Scanner(System.in);
      System.out.println("What is the current month?");
      String month = in.nextLine();
      return month;
    }

    public static String getDay(){
      Scanner in = new Scanner(System.in);
      System.out.println("What is the current day of the week?");
      String day = in.nextLine();
      return day;
    }

    public static int getYear(){
      Scanner in = new Scanner(System.in);
      System.out.println("What year is it?");
      int year = in.nextInt();
      return year;
    }

    public static int getDate(){
      Scanner in = new Scanner(System.in);
      System.out.println("What day of the month is it?");
      int date = in.nextInt();
      return date;
    }

    public static Boolean getFormat(){
      Scanner in = new Scanner(System.in);
      System.out.println("Would you prefer the date in American (1) or European (2) format?");
      int format = in.nextInt();
      return(format == 2);
    }

    public static String date(String month, String day, int date, int year, boolean euroFormat){
      String result = "";
      if(euroFormat == true){
        result = day + " " + date + " " + month + ", " + year + ".";
      } else {
        result = day + ", " + month + " " + date + ", " + year + ".";
      }
      return result;
    }

    public static void main(String[] args){
      System.out.println(myAgeIs("Ian", "Scheffler", 30));
      System.out.println(euroDate("August", "Thursday", 5, 2021));
      System.out.println(amDate("August", "Thursday", 5, 2021));
      System.out.println(date("August", "Thursday", 5, 2021, true));
      System.out.println(date("August", "Thursday", 5, 2021, false));
      System.out.println(date(getMonth(), getDay(), getDate(), getYear(), getFormat()));

    }
}
