/* Exercise 3 in Chapter 2 of Think Java */
public class Time{

  public static void main (String [] args) {
   /*
    * 1) Create a new program called Time.java. From now on, we
    * won't remind you to start with a small, working program
    * but you should.
    */
    System.out.println("What time is it?");
    System.out.println("I don't know! Let me check my watch.");

   /*
    * 2) Following the example in Section 2.4, create variables
    * named hour, minute, and second. Assign values that are roughly
    * the current time. Use a 24-hour clock so that at 2pm the value
    * of hour is 14.
    */
    int hour = 0;
    int minute = 39;
    int second = 45;

   /* Testing the variables by printing them */
    System.out.print("It's currently ");
    System.out.println(hour + ":" + minute + ":" + second + ".");

   /*
    * 3) Make the program calculate and display the number of
    * seconds since midnight.
    */
    int seconds_elapsed = minute * 60 + second;
    System.out.println("How many seconds has it been since midnight?");
    System.out.println("It's been " + seconds_elapsed + " seconds.");

   /* 4) Calculate and display the number of of seconds remaining in the day. */
    System.out.println("How many seconds before the day is over?");
    int total_daily_seconds = 24 * 60 * 60;
    System.out.println(total_daily_seconds - seconds_elapsed + " seconds.");

   /*
    * 5) Calculate and display the percentage of the day that has passed.
    * You might run into problems when computing percentages with
    * integers, so consider using floating-point.
    */
    System.out.println("What percentage of the day has passed?");
    double minutes = 39.0;
    double seconds = 24.0 * 60.0 * 60.0;
    System.out.print(((minutes * 60.0 + 45.0)/seconds) * 100.0);
    System.out.println(" percent of the day has passed.");

   /*
    * 6) Change the values of hour, minute, and second to reflect the
    * current time. Then write code to compute the elapsed time since
    * you started working on this exercise.
    */
    hour = hour + 2;
    minute = minute - 8;
    second = second - 5;

   /* Printing the updated time to confirm the variables are correct. */
    System.out.println("What time is it now?");
    System.out.println("Now, it's " + hour + ":" + minute + ":" + second + ".");

   /* Calculating how many seconds have elapsed. */
    System.out.print("How much time has passed since you started ");
    System.out.println("this exercise?");
    int seconds_now = (hour * 60 * 60) + (minute * 60) + second;
    System.out.print(seconds_now - seconds_elapsed);
    System.out.println(" seconds.");

   /* Calculating how many minutes have elapsed. */
    System.out.println("How many minutes is that?");
    System.out.print("That's about ");
    System.out.print((seconds_now - seconds_elapsed) / 60);
    System.out.println(" minutes.");

   /* Making the conversion to minutes more accurate by using floating-point. */
    System.out.println("Are you sure that's accurate?");
    System.out.print("It's really closer to ");
    double seconds_now_float = seconds_now;
    double seconds_elapsed_float = seconds_elapsed;
    System.out.print((seconds_now_float - seconds_elapsed_float) / 60.0);
    System.out.println(" minutes.");
    System.out.println("You're dragging it.");

  }
}
