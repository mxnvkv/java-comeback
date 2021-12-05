package com.java_comeback.getting_started_programming_in_java;

public class Loops {
  public static void main(String[] args) {

    // *** While loop ***

    int someValue = 4;
    int factorial = 1;

    while(someValue > 1) {
      factorial *= someValue;
      someValue--;
    }

    System.out.println(factorial); // 24


    // *** Do-while loop ***

    int iVal = 80;

    do {
      System.out.print(iVal);
      System.out.print(" * 2 = ");
      iVal *= 2;
      System.out.println(iVal);
    } while (iVal < 25);


    // *** For loop ***

    for (int i = 1; i < 100; i *= 2) {
      System.out.println(i);
    }


    // *** For-each loop ***

    float[] theVals = { 10.0f, 20.0f, 15.0f };
    float sum = 0.0f;

    for (float currentValue : theVals) {
      sum += currentValue;
    }

    System.out.println(sum);

  }
}
