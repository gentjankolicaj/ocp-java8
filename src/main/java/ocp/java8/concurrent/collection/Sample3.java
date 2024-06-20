package ocp.java8.concurrent.collection;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Sample3 {

  public static void main(String[] args) {

    CopyOnWriteArrayList arrayList = new CopyOnWriteArrayList(); // concurrent colletion of list
    CopyOnWriteArrayList<Double> arrayList2 = new CopyOnWriteArrayList<>(); // concurrent collection of set

    CopyOnWriteArraySet arraySet = new CopyOnWriteArraySet();
    CopyOnWriteArraySet<Integer> arraySet2 = new CopyOnWriteArraySet<>();

    // Local class
    class A {

      final String id;
      final String name;

      A(String id, String name) {
        this.id = id;
        this.name = name;
      }

    }

    CopyOnWriteArrayList<? extends A> concurrentArrayList = new CopyOnWriteArrayList<>();
    CopyOnWriteArraySet<? extends A> concurrentArraySet = new CopyOnWriteArraySet<>();


  }

}
