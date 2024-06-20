package ocp.java8.concurrent.parallel_stream;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 4000; i++) {
      list.add(i);
    }

    Sample3 sample = new Sample3();

    long startTime = System.currentTimeMillis();
    sample.processAllDataInSerial(list);
    double duration = (System.currentTimeMillis() - startTime) / 1000;

    long startTime2 = System.currentTimeMillis();
    sample.processAllDataInParallel(list);
    double duration2 = (System.currentTimeMillis() - startTime2) / 1000;

    System.out.println("Duration in serial : " + duration);
    System.out.println("Duration in parallel : " + duration2);

  }

  public int process(int input) {
    try {
      Thread.sleep(1);
    } catch (InterruptedException e) {

    }
    return input + 1;
  }

  public void processAllDataInSerial(List<Integer> data) {
    data.stream().map(a -> process(a)).count();
  }

  public void processAllDataInParallel(List<Integer> data) {
    data.parallelStream().map(a -> process(a)).count();
  }
}
