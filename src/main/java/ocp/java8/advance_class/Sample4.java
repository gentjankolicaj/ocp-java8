package ocp.java8.advance_class;

public class Sample4 {

  private final int x = 24;

  public static void main(String[] args) {

    new Sample4().getX();

  }

  public int getX() {
    String message = "x is ";

    class LocalInnerClass {

      private final int x = Sample4.this.x;

      public void getX() {
        System.out.println(message + x);
      }
    }

    LocalInnerClass lic = new LocalInnerClass();
    lic.getX();

    return x;
  }

}
