package ocp.java8.concurrent.fork_join;

import java.util.concurrent.RecursiveTask;


public class Sample1 extends MyTask {

  private final Integer[] elements;
  private final int a;
  private final int b;

  public Sample1(Integer[] elements, int a, int b) {
    this.elements = elements;
    this.a = a;
    this.b = b;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public Integer compute() {
    if ((b - a) < 2) {
      return Math.min(elements[a], elements[b]);
    } else {
      int m = a + ((b - a) / 2);
      System.out.println(a + " " + m + " " + b);
      Sample1 sample = new Sample1(elements, a, m);
      Integer result = (Integer) sample.fork().join();

      return Math.min(new Sample1(elements, m, b).compute(), result);
    }
  }

}

class MyTask extends RecursiveTask {

  @Override
  protected Integer compute() {
    // TODO Auto-generated method stub
    return null;
  }

}
