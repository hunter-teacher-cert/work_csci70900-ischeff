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
