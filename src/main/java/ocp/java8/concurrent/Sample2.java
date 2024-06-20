package ocp.java8.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample2 {

  private int counter;

  public static void main(String[] args) {

    ExecutorService service = Executors.newFixedThreadPool(10);
    try {

      Sample2 var = new Sample2();

      for (int i = 0; i < 10; i++) {
        service.submit(() -> var.increment());
      }

    } finally {

      if (service != null) {
        service.shutdown();
      }

    }
  }

  public void increment() {
    synchronized (this) { // This block can only be executed by the thread which has intrinsic lock of
      // this instance
      System.out.println(counter++ + "");
    }
  }

}
