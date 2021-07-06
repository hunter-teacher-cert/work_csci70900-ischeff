# Work:
Recursion -- Have it your way

## GOAL:
Implement a mechanism to calculate the nth value in the Fibonacci sequence.

## GUIDELINES:
Some test calls and associated return values:

fib(0) -> 0
fib(1) -> 1
fib(2) -> 1
fib(3) -> 2
fib(4) -> 3
fib(5) -> 5
Hallmarks of a Recursive Function:

A BASE CASE, which is a simple case value we know how to evaluate without a recursive call. It stops the recursion.
a.k.a. "exit case."
E.g., 0! => 1 for factorial(n)
A RECURSIVE REDUCTION, wherein the function calls a simpler version of itself or a version closer to "the answer."
This must lead toward the base case... Or else?
E.g., (n-1)! for factorial(n)

## STEPS FOR DEVELOPING A RECURSIVE PROCEDURE:
Write down simple cases & expected outputs.
Write down a case slightly more complex than base case (e.g. factorial(2) )
Ask Q: How can I get from this case to a base case? (Ans is key to developing recursive reduction.)
Q: What must be done in addition to the reduction? (e.g. +1, +n, *n, etc...) As you design your algorithms, brainstorm on paper. Work out the base case and recursive reduction BEFORE you start coding...
YOUR CODING MISSION:

Discuss, as a team, how you will approach this. Pick the approach that makes the most sense to all teammates, and implement it.
Once you get that working, entertain alternate approaches.
Discuss pros/cons of each approach, and record these as part of the comments preceding each method.
Comment out your existing fib() implementation, and implement your new version.
Repeat for as many different approaches as you can.

## PROTIPS:
Design first. Sketch out your plan on paper ("keys to success"), transcribe into comments in your code file.
Get something, however, minimal, to compile and run ASAP. Incrementally grow it until it aligns with your goal.
Start with test calls like fib(0) and fib(1)... and only test larger inputs once you have a working function.
Never stray far from runnable code.
Grow cohort KB ("knowledge base") on slack:
Have a Q? Ask.
Confident in your skills/knowledge? See how well you can explain it.

## DELIVERABLE:
Save in your_work_repo: 5/Fib.java
Include heading at top of file, as comment. List all collaborators and consultants.

# Work:
Intro to Classes and Objects

## GOAL:
Gain familiarity with basics of classes in Java.

## GUIDELINES:

##Starter kit:
This daily directory has two Java files:

Time.java
Driver.java

Time.java will hold the Time class. Driver.java holds the main method that will be used to test the functionality of Time.

To compile, run javac Driver.java Time.java -- which will compile both Java files.
To run, use java Driver.

##YOUR CODING MISSION:

Fetch KtS.

Discuss questions/comments/concerns regarding chapter 10 in ThinkJava with your team.

Copy Time.java and Driver.java into your work repo.

Discuss questions/comments/concerns regarding chapter 11 in ThinkJava with your team.

Fill in your Time class implementation in Time.java. Grow it incrementally, testing as you go. Some things you should be able to do below...

Your driver file should contain code to (in suggested development order)

instantiate a newly-created Time object (aka "instance of class Time") with default value(s)

instantiate a newly-created Time object with specified value(s)
assign a Time var the value null

assign a Time var the value of an existing Time var

print all of the above (See multiple ways to do this? Try all -- and document in comments!)

test for equality of each of the Time instances above. Print results.

add two Time objects and print results

add two Time objects and save the result in another Time object

Your Time class definition file should contain code to
tell a Time object how to do the tasks necessary to achieve the above

## PROTIPS:
Copy the "todo-list" above into your code as comments, then use as your development guide...
Design first. Sketch out your plan on paper ("keys to success"), transcribe into comments in your code file.
Get something, however, minimal, to compile and run ASAP. Incrementally grow it until it aligns with your goal.
Never stray far from runnable code.

Grow cohort KB ("knowledge base") on slack:
Have a Q/C/C? Post. Especially to the java channel, while working on this assignment...
Confident in your skills/knowledge? See how well you can explain it.

## DELIVERABLE:
Save in your_work_repo: 5/Time.java and 5/Driver.java
Include heading at top of file, as comment. List all collaborators and consultants.
