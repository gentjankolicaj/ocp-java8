package ocp.java8.concurrent.collection;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Sample4 {

  public static void main(String[] args) throws InterruptedException {

    LinkedBlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

    addAndPrint(blockingDeque);

  }

  public static void addAndPrint(BlockingDeque<Integer> blockingDeque) throws InterruptedException {
    blockingDeque.offer(103);
    blockingDeque.offerFirst(20, 1, TimeUnit.SECONDS);
    blockingDeque.offerLast(85, 7, TimeUnit.HOURS);

    System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));
    System.out.println(" " + blockingDeque.pollLast(1, TimeUnit.MINUTES));

  }

}
