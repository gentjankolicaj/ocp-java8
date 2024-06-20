package ocp.java8.concurrent.parallel_stream;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Sample7 {

  public static void main(String[] args) {

    Stream<String> cats = Stream.of("leopard", "lynx", "ocelot", "puma").parallel();
    Stream<String> bears = Stream.of("panda", "grizly", "polar").parallel();

    ConcurrentMap<Boolean, List<String>> map = Stream.of(cats, bears)
        .flatMap(s -> s)
        .collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));

    System.out.println(map.get(false).size() + " " + map.get(true).size());

  }

}
