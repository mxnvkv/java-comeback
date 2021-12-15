package com.java_comeback.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Lists {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    List<Integer> sublist1;
    List<Integer> sublist2;

    // add
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    // set
    int indexOfNumber3 = list.indexOf(3);
    list.set(indexOfNumber3, 0);

    // replace
    list.replaceAll((Integer num) -> num * 2);

    // sort
    list.sort(Comparator.reverseOrder());

    // sublist
    sublist1 = list.subList(0, 2);
    sublist2 = list.subList(2, list.size());

    System.out.println(list);
    System.out.println(sublist1);
    System.out.println(sublist2);

  }
}
