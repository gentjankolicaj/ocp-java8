package ocp.java8.concurrent.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample2 {

  public static void main(String[] args) {

    ExecutorService executor = Executors.newSingleThreadExecutor();

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      list.add(i);
    }

    for (int i = 0; i < 4; i++) {
      executor.execute(() -> {
        for (Integer var : list) {
          System.out.print(var + " ");
        }
      });
    }

    executor.shutdown();// must call method shudown in order to initiate shutdown because Executors are non-daemon threads

  }

}
