package ocp.java8.concurrent.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample3 {

  public static void main(String[] args) {
    int cpuCores = Runtime.getRuntime().availableProcessors();

    ExecutorService executor = Executors.newFixedThreadPool(cpuCores);

    List<Integer> list = new ArrayList<>();
    for (int i = -100; i < 0; i++) {
      list.add(i);
    }

    Sample3 sample = new Sample3();

    for (int i = 0; i < cpuCores; i++) {
      executor.execute(() -> sample.process(list));
    }

    executor.shutdown();

  }

  public void process(List<Integer> list) {
    System.out.println();
    synchronized (this) {
      for (int i = 0; i < list.size(); i++) {
        Integer var = list.get(i);
        int updatedValue = var + i;
        list.add(i, updatedValue);
        System.out.print(list.get(i) + " ");
      }
    }
  }

}
