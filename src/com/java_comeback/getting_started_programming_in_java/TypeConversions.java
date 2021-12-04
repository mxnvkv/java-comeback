package com.java_comeback.getting_started_programming_in_java;

public class TypeConversions {
  public static void main(String[] args) {

    float floatVal = 1.0f;
    double doubleVal = 4.0;
    byte byteVal = 7;
    short shortVal = 7;
    long longVal = 5;

    short result1 = (short) longVal;
    short result2 = (short) (byteVal - longVal);
    float result3 = longVal - floatVal;

  }
}
