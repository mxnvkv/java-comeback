package com.java_comeback.getting_started_programming_in_java;

public class ArithmeticOperators {
  public static void main(String[] args) {

    // *** Prefix and Postfix operators ***
    int someValue = 5;
    System.out.println(++someValue); // 6
    System.out.println(someValue);   // 6

    int someOtherValue = 5;
    System.out.println(someOtherValue++); // 5
    System.out.println(someOtherValue);   // 6

    // *** Compounding operators ***
    int myOtherValue = 100;
    int val1 = 5;
    int val2 = 10;
    myOtherValue /= val1 * val2;

  }
}
