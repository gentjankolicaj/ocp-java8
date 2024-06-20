package ocp.java8.advance_class;

public class Sample6 {

  public static void main(String[] args) {

    Chipmunk c = new Chipmunk();
    Mammal m = c;
    Furry f = c;

    int result = 0;

		if (c instanceof Mammal) {
			result += 1;
		}

		if (c instanceof Furry) {
			result += 2;
		}

		if (null instanceof Chipmunk) {
			result += 4;
		}

    System.out.println(result);
  }

  interface Mammal {

  }

  static class Furry implements Mammal {

  }

  static class Chipmunk extends Furry {

  }

}
