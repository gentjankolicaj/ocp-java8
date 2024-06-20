package ocp.java8.concurrent.collection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class Sample2 {

  public static void main(String[] args) {

    ConcurrentHashMap map = new ConcurrentHashMap(); //Key==object , Value==object types

    ConcurrentHashMap<Integer, String> map2 = new ConcurrentHashMap<>();

    ConcurrentSkipListMap<String, Object> skipListMap = new ConcurrentSkipListMap<>(); //Like treeMap //sorted

    ConcurrentSkipListSet<String> skipListSet = new ConcurrentSkipListSet<>(); //Like treeSet //sorted


  }

}
