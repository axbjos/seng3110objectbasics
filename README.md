# SENG3110 Software Testing

## Object Oriented & JUnit 4 Basics

### Sample Code for the Coursera Related Labs

This repository contains the code necessary to complete Lab 3

### Demo.java File

This is the source Java class that is to be unit tested.

It is a simple program with two static methods:

- A main method that includes code that prompts the user for the lengths of three sides.  

- A method named "isTriangle" that computes if the lengths of the sides create a triangle.  The method returns a simple boolean true or false.

Compile this code using the following:

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

The objective of the assignment is to implement JUnit4 Unit Tests for the two methods in the Demo.java class.

DemoTestIsTriangle.java contains two unit tests for the *isTriangle* static method.

One tests for a "true" condition by passing 1,1,1 to the method.
The other tests for a "false" condition by passing 2,2,0

### isTriangle Unit Tests

Compile the isTriangle Unit Test class by doing the following:

Unix Systems:
``` javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar DemoTestIsTriangle.java ```

Windows Systems (Powershell or CMD):
``` javac -cp .;junit-4.13.2.jar;hamcrest-core-1.3.jar DemoTestIsTriangle.java ```

Run the Unit Tests by having the JUnit runner invoke the test methods:

Unix Systems:
``` java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore DemoTestIsTriangle ```

Windows Systems (Powershell or CMD)
``` java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore DemoTestIsTriangle ```
