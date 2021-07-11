# Assignment 1:
Hello, world!

Link to assignment walkthrough video: [[https://youtu.be/Owqp3MIZG9E][link]]

## First time only setup

- Accept this GitHub assignment by following
  this [[https://classroom.github.com/a/BKJdJVBT][link]].


Once finished, click on the repo link (or go to your GitHub account
and then to this new repo). clone by doing the following:

1. open a terminal
2. switch to the directory under which you want to clone the
   repository. I recommend your Desktop if you're using Windows.
3. Clone the repo using the *ssh* option.
4. Edit the README.org file by adding your name and GitHub user name.
5. Save the file
6. ~git commit README.org -m "added names"
7. ~git push~

## Every time Setup:

Make sure this repo is up to date by:
1. opening a terminal
2. Switching directories (folders) to the assignments repo
3. Run the ~git pull~ command.

Set up the directory for the assignment.
1. Make a new folder named pre01 under the assignment repo by:
   1. Make sure you're in the assignments repo directory (folder)
   2. type ~mkdir pre01~ *note: all lower case letters*
   3. Move into that folder

## Assignment:

You are going to write your first Java program. Open your editor
(notepad++, gedit, other) and create a file named *Hello.java*. Note
that the *H* is upper case. In that file, write and save this program:

#+begin_src java
  import java.io.*;
  import java.util.*;

  public class Hello {
      public static void main(String[] args){
          System.out.println("Hello world!");
      }
  }
#+end_src

Now, from the terminal run the ~ls~ (Linux, Mac, GitBash) or ~dir~
(windows cmd) command. Note that your directory should have one file
named ~Hello.java~.

To compile Hello.java into Java Byte Code that can be run by the Java
Virtual Machine, type ~javac Hello.java~. If the prompt comes back
with no errors, everything worked. If you see any errors, read them
carefully and try to fix your program. Repeat until your program
compiles.

Look at the files in the directory again (ls, dir) and you'll see an
additional file named ~Hello.class~ - this is the compiled Java Byte
Code that can be run. Now run your program by typing ~java Hello~.

Congratulations!!!!

Put an error in your program - remove a quote or a bracket and
recompile using ~javac Hello.java~ - read the error. Fix it and try to
generate another error. Finally fix and text the program again so that
it works.

As a final step, add the program to git using the sequence:

#+begin_src bash
git add Hello.java
git commit Hello.java -m "added my first Java program"
git push
#+end_src

References for this assignment:
| Reference        | Chapter(s)   |
|------------------+--------------|
| [[https://books.trinket.io/thinkjava/][Think Java]]       | 1            |
| [[https://introcs.cs.princeton.edu/java/10elements/][Sedgwick / Wayne]] | 1.1.1, 1.1.2 |
| [[https://chortle.ccsu.edu/Java5/index.html#03][ Kjell]]           | 1 through 7  |

 Please review and consider the questions at the end of the chapters.

Congratulations again, you've successfully written your first program
and pushed it to GitHub!!!!!
