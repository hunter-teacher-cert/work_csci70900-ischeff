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
- 9-12.DL.2: Communicate and work collaboratively with others using digital tools to support individual learning and contribute to the learning of others.

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

*Formative Assessment:*
- Using your analog feedback device (i.e., raising number of fingers from closed fist to 5 fingers), how clear are you on your next steps?
---

### Lesson Activity #1
time: 20 minutes

- Students will individually complete either the mild, medium or spicy versions of this activity.
- They should open the code file of their choice, then follow the instructions. (Everyone will ultimately write a method or methods that print out any date in both European and American formats.)
- While students work, teacher should circulate and assess who needs extra help and/or feedback.
- If anyone finishes early, they should ask the instructor for feedback; if they still have extra time after implementing any revisions, they can assist their peers.
- Note: there is an extension activity in the Spicy file, in which students create a scanner to solicit user input.

**Expected/Desired Code:**
```java

```

**Expected Misconceptions:**
- Students may misremember Java fundamentals, like compiling before running.
- Students may forget semicolons and make other syntax errors.
- Students may not understand that to concatenate strings in a grammatical fashion, you need to add in the spaces you want--even though there are multiple ways to do this, you need to be intentional about it!
- Students may try to write out their code without planning it first.
- Students may struggle to generalize the relationship among the concatenated data types.
- Students may struggle to conceptualize the relationship between the main method and the other methods they will create. (This may present as students not being sure how or where to write out the generalized relationship.)

*Think-Pair-Share:*
What was easy about this activity? What was hard? Why?

---

### Lesson Activity #2
time: 10 minutes

- Students leave their laptops open, then stand up, and participate in a musical-chairs-style gallery walk to give and receive feedback. (When music plays, get up and dance; when music ends, take seat nearest to you, read over their code, then leave a glow, grow, and wondering question.)
- There should be time for at least 2 cycles.
- Students will then take their seat and read over the feedback they were left.

### Closing
time: 5 minutes

*Think-Write-Pair-Share:*
Based on the feedback you received, what next steps--if any-should you take tonight to revise your code? s

---
