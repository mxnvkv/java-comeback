package com.java_comeback.getting_started_programming_in_java.string_formatting;

public class Grouping {
  public static void main(String[] args) {

    int iVal = 1234567;
    double dVal = 1234567.0;

    String s1 = String.format("%d", iVal);
    String s2 = String.format("%,d", iVal);
    String s3 = String.format("%,.2f", dVal);

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

  }
}
