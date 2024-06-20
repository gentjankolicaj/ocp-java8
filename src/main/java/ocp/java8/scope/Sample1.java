package ocp.java8.scope;

public class Sample1 {

  public static void main(String[] args) {
    scopeTesting_0();
    scopeTesting_1();

    Sample1 sample = new Sample1();
    sample.scopeTesting0();
    sample.scopeTesting1();
  }

  public static void scopeTesting_0() {
    System.out.println("Class/static method: scopeTesting_0");
    int i = 0;
    {
      i = 1;
      System.out.println("int of scope:" + i);

    }
    System.out.println("out of scope:" + i);
    System.out.println();
  }

  public static void scopeTesting_1() {
    System.out.println("Class/static method: scopeTesting_1");
    {
      int i = 1;
      System.out.println("in of scope:" + i);

    }
    // System.out.println("out of scope:"+i); compile error because variable is out of scope
    System.out.println();
  }

  public void scopeTesting0() {
    System.out.println("Instance method: scopeTesting0");
    int i = 0;
    {
      i = 2;
      System.out.println("in of scope:" + i);

    }
    System.out.println("out of scope:" + i);
    System.out.println();
  }

  public void scopeTesting1() {
    System.out.println("Instance method: scopeTesting0");
    {
      int i = 2;
      System.out.println("in of scope:" + i);

    }
    // System.out.println("out of scope:"+i); compile error because variable is out of scope
    System.out.println();
  }
}
