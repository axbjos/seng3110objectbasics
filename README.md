# SENG3110 Software Testing

## Object Oriented & JUnit 4 Basics

### Sample Code for Canvas Lab 3 (the "first" Coursera Week 1 JUnit Lab)

This repository contains the code necessary to complete Lab 3

Pick a location on your computer and clone the repo:

``` git clone https://github.com/axbjos/seng3110objectbasics.git ```

### Demo.java

This is the source Java class that is to be unit tested:  the "class under test"

It is a simple program with two static methods:

- A main method that with code that prompts the user for the lengths of the three sides of a triangle.  

- A method named *isTriangle* that computes if the lengths of the sides would actually create a triangle.  The method returns a simple boolean *true* or *false*.

Compile this Demo.java class using the following:

``` java Demo.java ```

Then run with:

``` java Demo ```

Try it with the following input:

```  
Enter side 1:
1
Enter side 2:
1
Enter side 3:
1
This is a triangle. 
```

```  
Enter side 1:
1
Enter side 2:
1
Enter side 3:
0
This is not a triangle. 
```

The objective of the Lab 4 is to implement JUnit4 tests for the two methods in the Demo.java class: *main* and *isTriangle*

DemoTestIsTriangle.java contains **two** unit tests for the *isTriangle* static method.

- One tests for a "true" condition by passing 1,1,1 to the method.
- The other tests for a "false" condition by passing 2,2,0

### isTriangle Unit Tests

**Compile** the *isTriangle* Unit Test class by doing the following:

Unix Systems:
``` javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar DemoTestIsTriangle.java ```

Windows Systems (Powershell or CMD):
``` javac -cp .;junit-4.13.2.jar;hamcrest-core-1.3.jar DemoTestIsTriangle.java ```

**Run** the Unit Tests by having the JUnit *runner* invoke the test methods:

Unix Systems:
``` java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore DemoTestIsTriangle ```

Windows Systems (Powershell or CMD)
``` java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore DemoTestIsTriangle ```

The following output should be displayed.  If not...you did something wrong....check your work!

```
JUnit version 4.13.2
..
Time: 0.008

OK (2 tests)
```

Since there were no errors, both unit tests passed.

## Main Method Unit Test

Compile and run the Main Method Unit Test by doing the following

**Compile** the *isTriangle* Unit Test class by doing the following:

Unix Systems:
``` javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar DemoTestMain.java ```

Windows Systems (Powershell or CMD):
``` javac -cp .;junit-4.13.2.jar;hamcrest-core-1.3.jar DemoTestMain.java ```

**Run** the Unit Tests by having the JUnit *runner* invoke the test methods:

Unix Systems:
``` java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore DemoTestMain ```

Windows Systems (Powershell or CMD)
``` java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore DemoTestMain ```

The following output should be displayed.  If not...you did something wrong....check your work!

```
JUnit version 4.13.2
.
Time: 0.023

OK (1 test)
```

### Refer to Lab 3 Instructions on Canvas for what to submit!


