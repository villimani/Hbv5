# HBV202GAssignment5
A very simple integer stack implementation to be tested using JUni4. Maven POM is provided.

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE hopefully understands when you `git clone` it. 

Both the implementation and the tests are in Java package `is.hi.hbv202g.ass5`, 
but in the usual separate Maven `src` directories:

- `src/main/java`:
  - `IntStack.java`: Implementation of a simple stack.
  - `IntStackMain.java`: A class a main method demonstrating same sample usage of the stack.

- `src/test/java`:
  - `IntStackTest.java`: A skeleton for a class containing JUnit4 test cases for the `IntStack` class.

Maven:

- `mvn compile` compiles all implementation classes.
- `mvn exec:java` executes the main method of the implementation.
- `mvn test` runs all test cases. 
