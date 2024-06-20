package ocp.java8.advance_class;

public class Sample3 {

  public static void main(String[] args) {

    IceCreams[] enumArrayValues = IceCreams.values();

		for (IceCreams iceCream : enumArrayValues) {
			System.out.println(iceCream.ordinal() + " " + iceCream.name());
		}

  }

  enum IceCreams {

    VANILLA, CHOCOLATE, STRAWBERRY
  }

}
