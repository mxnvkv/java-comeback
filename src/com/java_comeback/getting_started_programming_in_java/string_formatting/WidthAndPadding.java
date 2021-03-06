package com.java_comeback.getting_started_programming_in_java.string_formatting;

public class WidthAndPadding {
  public static void main(String[] args) {

    int w = 5, x = 235, y = 481, z = 12;

    String s1 = String.format("W:%d, X:%d", w, x);
    String s2 = String.format("Y:%d, Z:%d", y, z);

    String s3 = String.format("W:%4d, X:%4d", w, x);
    String s4 = String.format("Y:%4d, Z:%4d", y, z);

    String s5 = String.format("W:%04d, X:%04d", w, x);
    String s6 = String.format("Y:%04d, Z:%04d", y, z);

    String s7 = String.format("W:%-4d, X:%-4d", w, x);
    String s8 = String.format("Y:%-4d, Z:%-4d", y, z);

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
    System.out.println(s7);
    System.out.println(s8);

  }
}
