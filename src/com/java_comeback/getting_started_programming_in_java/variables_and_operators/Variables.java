package com.java_comeback.getting_started_programming_in_java.variables_and_operators;

public class Variables {
  public static void main(String[] args) {

    // variables assigned with final cannot be modified
    final int maxStudents = 25;

    // however, we can initialize variable with final modifier
    // and assign value to it later
    final int someVariable;
    int someOtherVariable = 100;
    someVariable = someOtherVariable;

  }
}
