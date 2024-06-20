package ocp.java8.concurrent.fork_join;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class Sample2 extends RecursiveAction {

  private final int start;
  private final int end;

  public Sample2(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public static void main(String[] args) {

    ForkJoinTask<?> task = new Sample2(0, 4);

    ForkJoinPool pool = new ForkJoinPool();

    Object result = pool.invoke(task);

  }

  @Override
  protected void compute() {
    if (start < 0) {
    } else {
      int middle = start + ((end - start) / 2);
      invokeAll(new Sample2(start, middle), new Sample2(middle, end));
    }

  }

}
