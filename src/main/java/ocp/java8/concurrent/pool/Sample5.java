
package ocp.java8.concurrent.pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample5 {

  public static void main(String[] args) throws InterruptedException, ExecutionException {

    Object o1 = new Object();
    Object o2 = new Object();

    ExecutorService service = Executors.newFixedThreadPool(2);

    Future<?> result1 = service.submit(() -> {
      synchronized (o1) {
        synchronized (o2) {
          System.out.println("Tortoise");
        }
      }
    });

    Future<?> result2 = service.submit(() -> {
      synchronized (o2) {
        synchronized (o1) {
          System.out.println("Hare");
        }
      }
    });

    result1.get();
    result2.get();


  }

}
