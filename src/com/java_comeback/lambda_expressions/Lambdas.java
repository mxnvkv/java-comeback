package com.java_comeback.lambda_expressions;

import java.sql.SQLOutput;
import java.util.function.*;

public class Lambdas {
  public static void main(String[] args) {

    // Supplier
    Supplier<String> supplier = () -> "Hello from supplier!";
    String supplierResult = supplier.get();
    System.out.println(supplierResult);

    // Consumer
    Consumer<String> consumer =
      (String string) -> System.out.println("Message from consumer: " + string);
    consumer.accept("Hi there!");

    // Predicate ( used or filters )
    Predicate<String> isEmpty = (String string) -> string.length() == 0;
    Predicate<String> isLengthGreaterThanFive = (String string) -> string.length() > 5;

    // Function ( used for mapping )
    DoubleFunction<Integer> transformDoubleToInt = (double number) -> (int) number;

    // Runnable ( apart from Supplier, Runnable doesn't return anything )
    Runnable runnable = () -> System.out.println("And that's a runnable right here");
    runnable.run();


    // Chaining Consumers
    Consumer<String> c1 = (String string) -> System.out.println("c1 consumes: " + string);
    Consumer<String> c2 = (String string) -> System.out.println("c2 consumes: " + string);

    Consumer<String> c3 = c1.andThen(c2);

    c3.accept("in the chain!");

    // Chaining Predicates
    System.out.println("For 'computer' = " + isEmpty.test("computer"));
    System.out.println("For '' = " + isEmpty.test(""));

    System.out.println("For 'computer' = " + isLengthGreaterThanFive.test("computer"));
    System.out.println("For 'four' = " + isLengthGreaterThanFive.test(""));

    Predicate<String> p3 = isEmpty.negate().and(isLengthGreaterThanFive.negate());
    System.out.println("For 'computer' = " + p3.test("computer"));
    System.out.println("For '' = " + p3.test(""));
    System.out.println("For 'four' = " + p3.test("four"));

  }
}
