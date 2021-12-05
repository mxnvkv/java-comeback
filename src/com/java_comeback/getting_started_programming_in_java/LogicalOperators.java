package com.java_comeback.getting_started_programming_in_java;

public class LogicalOperators {
  public static void main(String[] args) {

    boolean trueValue = true;
    boolean falseValue = false;


    // *** Logical operators ***

    if (trueValue & trueValue) {
      System.out.println("&");
    }

    if (falseValue | trueValue) {
      System.out.println("|");
    } else if (trueValue | falseValue) {
      System.out.println("|");
    } else if (trueValue | trueValue) {
      System.out.println("|");
    }

    if (trueValue ^ falseValue) {
      System.out.println("^");
    } else if (falseValue ^ trueValue) {
      System.out.println("^");
    }

    if (!falseValue) {
      System.out.println("!");
    }


    // *** Conditional logical operators ***

    // the difference between | and ||, and & and && is that || and && check
    // right side only if necessary

    // && executes only if the left side is true
    if (trueValue && trueValue) {
      System.out.println("&");
    }

    // left side is false - go and check right side
    if (falseValue || trueValue) {
      System.out.println("|");

      // for both examples down below, right side won't be checked
    } else if (trueValue || falseValue) {
      System.out.println("|");
    } else if (trueValue || trueValue) {
      System.out.println("|");
    }

  }
}
