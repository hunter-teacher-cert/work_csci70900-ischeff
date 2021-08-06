# Lesson 2: Concatenation + Methods

## Context:
- This lesson is designed to be delivered to a mixed-grade group of high school students who have only recently been introduced to java, but who have taken AP CSP. Given that the course would have been taken during the pandemic, there is an explicit goal here of reinforcing and reviewing fundamental CS concepts while learning a new language.  
- Consequently, the lesson focus is concatenation; this is the second day of a two-day lesson, during which students create and implement a short program that solicits input and returns a string produced by concatenating the input data.

## Lesson objective:
Students will be able to create a method or methods that take different data types as parameters, then concatenate and return the inputs as one concatenated String.  

### Aim:
How can we create methods that concatenate inputs?

### Vocab:
Method, main, parameter, return, return type

### Standards:
- 9-12.CT.4: Implement a program using a combination of student-defined and third-party functions to organize the computation.

### Warm up
time: 5 minutes

*Think-Pair-Share:*
- Look back at your work from yesterday. How do you think we can generalize or abstract the concatenated string we wrote, so that we can print ANY date in either European or American format?

**Expected Answers:**
- Create separate methods
- Create one method and solicit user input.
- Create a template and fill it in differently each time.

---

### Lesson Content
time: 10 minutes

*Mini-lesson:*
- Before you start the live coding demo, tell students that you will be doing a live code demo of how to write a method in Java.
**Vocab:**
- Method = what we call a function in Java
- Parameter = input data/variables
- Return = the value produced by the method
- Return type = the type of data returned
- Main = the method that "runs" a program--you can create other methods that are called in main!

**Live Code Finished Product:**

```Java
public class Methods{
  //This is ANOTHER method, outside main
  public String myAgeIs(String firstName, String lastName, int age){
    System.out.println(firstName + " " + lastName + "is " + age + " years old.");
  }

  //This is my main method
  public static void main(String[] args){
    myAgeIs(Ian, Scheffler, 30);

  }
}
```
*Think-Pair-Share* Why do you think I wrote the program the way that I did? Why not write everything inside main?

**Expected Answers:**
- To compartmentalize/separate what you want to do.
- To be able to apply it anywhere.
- To make it better organized.

*Follow-up Questions:*
- What did you notice?
- What did you wonder?
- How do you think you can apply this demo to your own next steps?

---

### Lesson Activity #1
time: 15 minutes

- Students will individually complete either the mild, medium or spicy versions of this activity.
- They should open the code file of their choice, then follow the instructions. (Everyone will ultimately write lines that print out today's date in both European and American formats.)
- While students work, teacher should circulate and assess who needs extra help and/or feedback.
- If anyone finishes early, they should ask the instructor for feedback; if they still have extra time after implementing any revisions, they can assist their peers.

**Expected/Desired Code:**
```java
 String day = Friday;
 System.out.println(day);
 int date = 30;
 System.out.println(date);
 String month = July;
 System.out.println(month);
 int year = 2021;
 System.out.println(year);

// Now, uncomment the lines below and print out today's date in both formats!
// American Format: Friday, July 30, 2021.
 System.out.println(day + ", " + month + " " + date + ", " + year ".");
// European Format: Friday 30 July, 2021.
 System.out.println(day + " " + date + " " + month + ", " + year + ".");
```

**Expected Misconceptions:**
- Students may misremember Java fundamentals, like compiling before running.
- Students may forget semicolons and make other syntax errors.
- Students may not understand that to concatenate strings in a grammatical fashion, you need to add in the spaces you want--even though there are multiple ways to do this, you need to be intentional about it!
- Students may try to write out their code without planning it first.

*Think-Pair-Share:*
What was easy about this activity? What was hard? Why?

---

### Lesson Activity #2
time: 15 minutes

- Students will complete the mild, medium, or spicy version of this activity.
- While students work, teacher should circulate and assess who needs extra help and/or feedback.
- If anyone finishes early, they should ask the instructor for feedback; if they still have extra time after implementing any revisions, they can assist their peers.

**Expected/Desired Pseudocode:**
```Java
// Create a method for European date and American date
// OR a method that produces either based on user input
// So TWO separate methods or ONE method
// These are OUTSIDE the main method
// But are called/given input in main
// Each method should take as a parameter EACH of the data types to be concatenated.
// I.e., you would want to input the date, day, month, etc.
// Then the method would essentially return a string that uses the concatenated string in activity 1 as a template.
//If someone wanted to, they could also create a scanner to solicit user input. (This is going to be an extension activity tomorrow.)
```

**Expected Misconceptions:**
- Students may struggle to generalize the relationship among the concatenated data types.
- Students may struggle to conceptualize the relationship between the main method and the other methods they will create. (This may present as students not being sure how or where to write out the generalized relationship.)

*Question*
- What was easy? What was hard? Why?
- What next steps will you take tomorrow?

### Closing
time: 5 minutes

*Think-Write-Pair-Share:*
If you were to analogize concatenation--that is, to compare concatenation to something else, to help express what concatenation is--what would you compare it to and why?

---
