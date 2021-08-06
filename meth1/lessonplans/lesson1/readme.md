# Lesson 1: Concatenation

## Context:
- This lesson is designed to be delivered to a mixed-grade group of high school students who have only recently been introduced to java, but who have taken AP CSP. Given that the course would have been taken during the pandemic, there is an explicit goal here of reinforcing and reviewing fundamental CS concepts while learning a new language.  
- Consequently, the lesson focus is concatenation; this is the first day of a two-day lesson, at the end of which students will create and implement a short program that solicits input and returns a string produced by concatenating the input data.

## Lesson objective:
Students will be able to concatenate different data types.  

### Aim:
How can we concatenate different data types?

### Vocab:
Concatenate, concatenation, String, variable, primitive, data type

### Standards:
- 9-12.CT.4: Implement a program using a combination of student-defined and third-party functions to organize the computation.

### Warm up
time: 5 minutes

*Think-Write-Pair-Share:*
- Have you heard the term concatenation before? If so, where have you heard it? What do you recall it signified?
- If you haven't heard the term before, what do you predict it will mean?

**Expected Answers:**
- Adding things together
- Connecting things

---

### Lesson Content
time: 10 minutes

*Mini-lesson:*

Concatenation = when you use the addition operator to combine different data types, typically strings with other strings, or strings with integers.

Data type = another term for primitives in Java, i.e., ints, Strings, Booleans.

*Think-Pair-Share* What do you notice and what do you wonder about lines 9 and 10?
- Expected noticings: there is one variable, the variables and strings are combined, the variable represents temperature, the variable is int type
- Expected wonderings: Why didn't they just write 15 in the print statement?

*Think-Pair-Share* What do you predict lines 9 and 10 will do?
- Expected answer: They will print out the sentence "The temperature today will be 15 degrees."

*Question:*
- Compile and run the program--did it behave as you expected?

*Follow-up Questions:*
- What led you to predict the result?
- What is the "+" operator doing?
- Why do you think this works?

*Quickwrite*
- What are some other ways we might be able to use this technique?

---

### Lesson Activity #1
time: 15 minutes

- Students will individually complete either the mild, medium or spicy versions of this activity.
- They should open the code file of their choice, then follow the instructions. (Everyone will ultimately write lines that print out today's date in both European and American formats.)
- While students work, teacher should circulate and assess who needs extra help and/or feedback.
- If anyone finishes early, they should ask the instructor for feedback; if they still have extra time after implementing any revisions, they can assist their peers.

**Expected/Desired Code:**
```java
public class Concatenation{
  public static void main(String[] args){
     String day = "Friday";
     System.out.println(day);
     int date = 30;
     System.out.println(date);
     String month = "July";
     System.out.println(month);
     int year = 2021;
     System.out.println(year);

    // Now, uncomment the lines below and print out today's date in both formats!
    // American Format: Friday, July 30, 2021.
     System.out.println(day + ", " + month + " " + date + ", " + year ".");
    // European Format: Friday 30 July, 2021.
     System.out.println(day + " " + date + " " + month + ", " + year + ".");
   }
}
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
