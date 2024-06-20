package ocp.java8.random_samples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Sample3 {

  public static void main(String[] args) {

    //CE	HashSet<Number> hs=new HashSet<Integer>();
    HashSet<? super ClassCastException> hs2 = new HashSet<Exception>();
    List<String> list = new Vector<String>();
    //CE	List<Object> list2=new ArrayList<? extends Object>();
    Map<String, ? extends Number> hm = new HashMap<String, Integer>();
  }

}
