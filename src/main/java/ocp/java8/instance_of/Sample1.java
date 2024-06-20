package ocp.java8.instance_of;

public class Sample1 {

  public static void main(String[] args) {

//Compile error because null is not a class		if(null instanceof null) System.out.println("true");

    if (null instanceof Object) {
      System.out.println("Null is instance of Object class");
    }

    Object object = null;

//Compile error because null is not a class		if(object instanceof null) System.out.println("Null reference is instance of null");

  }

}
