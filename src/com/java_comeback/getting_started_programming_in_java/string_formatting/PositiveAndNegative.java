package com.java_comeback.getting_started_programming_in_java.string_formatting;

public class PositiveAndNegative {
  public static void main(String[] args) {

    int posVal = 123, negVal = -456;

    String s1 = String.format("%d", posVal);
    String s2 = String.format("%d", negVal);

    String s3 = String.format("% d", posVal);
    String s4 = String.format("% d", negVal);

    String s5 = String.format("%+d", posVal);
    String s6 = String.format("%+d", negVal);

    String s7 = String.format("%(d", posVal);
    String s8 = String.format("%(d", negVal);
    String s9 = String.format("% (d", posVal);

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
    System.out.println(s7);
    System.out.println(s8);
    System.out.println(s9);

  }
}
