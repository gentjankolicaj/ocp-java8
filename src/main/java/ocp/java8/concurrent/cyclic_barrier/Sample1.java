package ocp.java8.concurrent.cyclic_barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class Sample1 {

  public static void main(String[] args) {

    CyclicBarrier cyclic = new CyclicBarrier(10, () -> System.out.println("Stock Room full"));

    IntStream.iterate(1, i -> 1)
        .limit(9) //reduction of infinite stream
        .parallel()
        .forEach(i -> await(cyclic));


  }

  public static void await(CyclicBarrier cb) {
    try {
      cb.await();
    } catch (InterruptedException | BrokenBarrierException e) {

    }
  }

}
