package ocp.java8.nested_classes.member_inner_class;

public class Parent {

  public static void main(String[] args) {
    //Since enclosing class is parent and nested classes are member inner class then in order for us to create
    //Instances of child classes first we must create instance of parent

    Parent parent = new Parent();

    Child1 c1 = parent.new Child1();
    Parent.Child2 c2 = parent.new Child2();  //Child2 and Parent.Child2 are the same
    Parent.Child3 c3 = parent.new Child3();
    Parent.Child4 c4 = parent.new Child4("Hello child 4");

    System.out.println(c4);


  }

  public class Child1 {

    public String name = "Child";

    {
      name = "Child1";
    }
  }

  protected class Child2 {

    protected String name = "Child";

    {
      name = "Child2";
    }
  }

  class Child3 {

    String name = "Child";

    {
      name = "Child3";
    }
  }

  private class Child4 {

    private String name = "Child";

    {
      name = "Child4"; //because instance block is always called before constructor and contructor is the last called
    }

    public Child4(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "Child4 [name=" + name + "]";
    }


  }

}
