package com.java_comeback.getting_started_programming_in_java.string_formatting;

public class Radix {
  public static void main(String[] args) {

    int iVal = 32;

    String s1 = String.format("%d", iVal);
    String s2 = String.format("%x", iVal);

    String s3 = String.format("%#x", iVal);
    String s4 = String.format("%#X", iVal);

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);

  }
}
