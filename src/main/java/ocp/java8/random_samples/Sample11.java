package ocp.java8.random_samples;

public class Sample11 {

  public static void main(String[] args) {

    //if generic is declared in method then we have <T> before return type of method
    print(2);

    print("String");

    print(23.23);


  }

  public static <T> T print(T t) {
    System.out.println(t);
    return t;
  }

}
