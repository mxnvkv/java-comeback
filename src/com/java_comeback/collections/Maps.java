package com.java_comeback.collections;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

public class Maps {
  public static void main(String[] args) {

    String defaultProduct = "default product";

    Map<Integer, String> idToProduct = new HashMap<>();
    idToProduct.put(1, "door");
    idToProduct.put(2, "floor panel");
    idToProduct.put(3, "window");


    // keys
    Set<Integer> ids = idToProduct.keySet();
    System.out.println(ids);
    System.out.println(idToProduct);
    System.out.println();

    ids.remove(1);
    System.out.println(ids);
    System.out.println(idToProduct);
    System.out.println();

    // ids.add(5) <- Won't work


    // values
    Collection<String> products = idToProduct.values();
    System.out.println(products);
    System.out.println(idToProduct);
    System.out.println();

    products.remove(idToProduct.get(3));

    System.out.println(products);
    System.out.println(idToProduct);
    System.out.println();

    // products.add(...) <- Won't work as well


    // entries
    Set<Map.Entry<Integer, String>> entries = idToProduct.entrySet();

    for (Map.Entry<Integer, String> entry : entries) {
      System.out.println(entry);
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
      System.out.println();

      entry.setValue("New window"); // Works very well!
    }

    System.out.println(idToProduct);
    System.out.println();

    // getOrDefault()
    String product = idToProduct.getOrDefault(4, defaultProduct);
    System.out.println(product);
    System.out.println(idToProduct.get(4));
    System.out.println();

    // replace()
    String oldProduct = idToProduct.replace(2, "Even better window");
    System.out.println(oldProduct);
    System.out.println();

    // computeIfAbsent() adds value to the map only if it's absent
    System.out.println(idToProduct);
    String newProduct = idToProduct.computeIfAbsent(1, id -> "Nice door");
    System.out.println(newProduct);
    System.out.println(idToProduct.get(1));
    System.out.println(idToProduct);
    System.out.println();

    // forEach()
    idToProduct.forEach((id, prod) -> {
      System.out.println(prod + " has an ID of " + id);
    });

  }
}
