package ocp.java8.concurrent.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample4 {

  public static void main(String[] args) {
    int cpuCores = Runtime.getRuntime().availableProcessors();

    ExecutorService executorService = Executors.newFixedThreadPool(cpuCores);

    List<Future<float[]>> list = new ArrayList<>();
    Sample4 sample = new Sample4();
    CyclicBarrier cyclicBarrier = new CyclicBarrier(cpuCores);

    for (int i = 0; i < cpuCores; i++) {
      Future<float[]> result = executorService.submit(
          () -> sample.completeChallenges(cyclicBarrier));
      list.add(result);

    }

    try {
      //sleep for Thread 'main'
      Thread.sleep(2000);

    } catch (InterruptedException e) {

    }

    for (Future<float[]> var : list) {
      if (var.isDone()) {
        try {
          float[] array = var.get();
          System.out.println(array[0] + " " + array[1] + " " + array[2]);
        } catch (InterruptedException | ExecutionException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    }

    executorService.shutdown();
  }

  public float completeFirstChallenge() {
    long sleep = new Random().nextInt(10);
    long startTime = System.currentTimeMillis();
    try {
      Thread.sleep(sleep);
    } catch (InterruptedException e) {

    }
    return (float) (System.currentTimeMillis() - startTime) / 1000.0f;

  }

  public float completeSecondChallenge() {
    long sleep = new Random().nextInt(10);
    long startTime = System.currentTimeMillis();
    try {
      Thread.sleep(sleep);
    } catch (InterruptedException e) {

    }
    return (float) (System.currentTimeMillis() - startTime) / 1000.0f;
  }

  public float completeThirdChallenge() {
    long sleep = new Random().nextInt(10);
    long startTime = System.currentTimeMillis();
    try {
      Thread.sleep(sleep);
    } catch (InterruptedException e) {

    }
    return (float) (System.currentTimeMillis() - startTime) / 1000.0f;
  }

  public float[] completeChallenges(CyclicBarrier cyclicBarrier) {
    float[] durationArray = new float[3];
    try {
      durationArray[0] = completeFirstChallenge();
      cyclicBarrier.await();
      durationArray[1] = completeSecondChallenge();
      cyclicBarrier.await();
      durationArray[2] = completeThirdChallenge();
    } catch (InterruptedException | BrokenBarrierException e) {

    }
    return durationArray;

  }
}
