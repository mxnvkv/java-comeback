package com.java_comeback.handling_exceptions_in_java;

public class WorkingWithTryCatch {
  public static void main(String[] args) {

    int i = 12;
    int j = 5;

    try {
      int result = i / (j - 2);
      System.out.println(result);
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
      ex.printStackTrace();
    }

  }
}
