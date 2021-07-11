# Assignment 2:
## Data Types

References for this assignment:
| Reference        | Chapter(s)    |
|------------------+---------------|
| [[https://books.trinket.io/thinkjava/][Think Java]]       | 2, 3          |
| [[https://introcs.cs.princeton.edu/java/10elements/][Sedgwick / Wayne]] | 1.2.1 - 1.2.5 |
| [[https://chortle.ccsu.edu/Java5/index.html#03][Kjell]]            | 8 - 11        |


Read chapters 2 and three from [[https://books.trinket.io/thinkjava][Think Java]].

This section deals with basic data types. Java differs from Python and
Javascript in that you have to declare variables before you use them
and in that declaration tell the compiler what type of data they'll
represent.

For example in Python, if you wanted to use a variable ~intval~ to hold
an integer value and ~doubval~ a floating point number you could just
write:

#+begin_src python
intval = 5
doubval = 123.45
#+end_src

whereas in Java you have to first declare the variables and then
assign them:

#+begin_src java
int intval;
double doubval;

intval = 5;
doubval = 123.45
#+end_src

You can though combine the steps:

#+begin_src java
int intval = 5;
double doubval = 123.45;
#+end_src

Read the chapters for details. You can also find more information in
the other supplemental materials linked on the prework page.

## For submission
Complete Exercise 2 and 3  from section 2.12 of [[https://books.trinket.io/thinkjava][Think Java]]
Also complete any one of the programming exercises from section 3.12
of [[https://books.trinket.io/thinkjava][Think Java]]
Add the ~.java~ files for your solutions to the assignment repo
under a folder named ~pre02~ and push them up to GitHub.
