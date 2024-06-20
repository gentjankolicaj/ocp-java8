package ocp.java8.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Sample1 {

  public static void main(String[] args) {

    ArrayDeque<Double> doubleQueue = new ArrayDeque<>();
    for (double i = 0; i < 11; i++) {
      doubleQueue.offer(i);
    }

    Queue<Integer> intQueue = new ArrayDeque<>();
    for (int i = 0; i < 10; i++) {
      intQueue.offer(i);
    }

    while (!doubleQueue.isEmpty()) {
      System.out.println(doubleQueue.pollLast());
    }

    System.out.println();

    while (!intQueue.isEmpty()) {
      System.out.println(intQueue.poll());
    }

  }

}
