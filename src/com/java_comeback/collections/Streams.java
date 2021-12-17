package com.java_comeback.collections;

import java.util.List;
import java.util.ArrayList;

public class Streams {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);

    /*
     *
     *  skip() and limit() are often used for pagination
     *
     *  Discard next N elements
     * .skip(elementsOnPage * pageNumber)
     *
     *  Only keep next N elements
     * .limit(elementsOnPage)
     *
     */

    list
      .stream()
      .filter((Integer number) -> number % 2 == 0)
      .map((Integer number) -> number * 2)
      .forEach(System.out::println);

  }
}
