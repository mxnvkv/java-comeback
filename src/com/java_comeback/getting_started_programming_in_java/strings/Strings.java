package com.java_comeback.getting_started_programming_in_java.strings;

public class Strings {
  public static void main(String[] args) {

    String s1 = "I love";
    s1 += " Java";
    String s2 = "I";
    s2 += " love Java";

    if (s1 == s2) { // false, because we have different references
      // do something
    }

    // intern() gets the value of the string, checks if there is an intern version
    // of it. If it can't find, it provides an intern version of it. Use this method
    // when you're frequently comparing strings
    String s3 = s1.intern();
    String s4 = s2.intern();

    if (s3 == s4) { // true
      // do something
    }


    // *** String builder ***

    String location = "New York";
    int flightNumber = 172;
    StringBuilder sb = new StringBuilder();

    sb.append("I flew to ");
    sb.append(location);
    sb.append(" on Flight #");
    sb.append(flightNumber);

    String time = "9:00";
    int pos = sb.indexOf(" on");
    sb.insert(pos, " at ");
    sb.insert(pos + 4, time);

    System.out.println(sb.toString());

  }
}
