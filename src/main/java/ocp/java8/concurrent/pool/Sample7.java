package ocp.java8.concurrent.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Sample7 {

  private static final AtomicInteger i1 = new AtomicInteger(0);
  private static int i2 = 0;

  public static void main(String[] args) throws InterruptedException {

    ExecutorService service = Executors.newSingleThreadExecutor();
    //Because we are using singleThreadExecutor=> we have only one thread in pool ,se we can use only that to execute out task
    //Since we are executing with only one thread,we don't have problems for read/write on variables i1 & i2
    // an this lead to i1=100 & i2=100

    try {

      for (int i = 0; i < 100; i++) {
        service.execute(() -> {
          i1.getAndIncrement();
          i2++;
        });
      }
      Thread.sleep(10);
      System.out.println(i1 + " " + i1);
    } finally {
      if (service != null) {
        service.shutdown();
      }
    }

  }

}
