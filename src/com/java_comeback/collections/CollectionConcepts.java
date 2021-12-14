package com.java_comeback.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {
  public static void main(String[] args) {

    Collection<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    System.out.println(list);

    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
      int number = iterator.next();

      if (number % 2 == 0) {
        iterator.remove();
      }
    }

    System.out.println(list);
    System.out.println(list.size());
    System.out.println(list.isEmpty());
    System.out.println(list.contains(1));
    System.out.println(list.remove(1));
    System.out.println(list.contains(1));

    list.add(1);
    list.add(2);

    Collection<Integer> secondList = new ArrayList<>();
    secondList.add(3);

    list.removeAll(secondList);

    System.out.println(list);

  }
}
