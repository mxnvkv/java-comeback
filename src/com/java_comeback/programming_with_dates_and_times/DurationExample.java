package com.java_comeback.programming_with_dates_and_times;

import java.util.Arrays;
import java.util.List;
import java.time.Duration;

public class DurationExample {
  public static void main(String[] args) {

    List<Duration> durationList = Arrays.asList(
      Duration.ofSeconds(100), Duration.ofSeconds(200), Duration.ofSeconds(300)
    );
    Duration runningTotal = Duration.ZERO;
    Duration largestSoFar = Duration.ofSeconds(Long.MIN_VALUE);

    for (Duration d : durationList) {
      runningTotal = runningTotal.plus(d);
      largestSoFar = largestSoFar.compareTo(d) > 0 ? largestSoFar : d;
    }

    System.out.printf("total = %s, largest = %s", runningTotal, largestSoFar);

  }
}
