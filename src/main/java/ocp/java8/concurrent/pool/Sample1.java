package ocp.java8.concurrent.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample1 {

  public static void main(String[] args) {
    int cpuCores = Runtime.getRuntime().availableProcessors();
    System.out.println("Cpu cores :" + cpuCores);

    ExecutorService executor = Executors.newFixedThreadPool(cpuCores);

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10000; i++) {
      list.add(i);
    }

    for (int i = 0; i < cpuCores; i++) {
      executor.submit(() -> print(list));

    }
    executor.shutdown();

  }

  //For this method to be synchronized each thread must aquire the intrisic lock of object Sample1.class
  public static synchronized void print(List<Integer> list) {
    System.out.println();
    for (Integer var : list) {
      System.out.print(var + " ");
    }
  }

}
