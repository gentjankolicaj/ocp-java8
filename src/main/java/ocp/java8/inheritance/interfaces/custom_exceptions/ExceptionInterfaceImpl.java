package ocp.java8.inheritance.interfaces.custom_exceptions;

public class ExceptionInterfaceImpl implements ExceptionInterface {

  @Override
  public void test1() {
    System.out.println("Inside method test1()");

  }

  @Override
  public void test2() throws Exception {
    System.out.println("Inside method test2() throws Exception");

  }

  @Override
  public void test3() {
    System.out.println("Inside method test3() throws RuntimeException");

  }

  @Override
  public void test4() throws Error {
    System.out.println("Inside method test4() throws Error");

  }

  @Override
  public void test5() throws Throwable {
    System.out.println("Inside method test5() throws Throwable");

  }

  @Override
  public void test6() {
    System.out.println("Inside method test6() Exception, RuntimeException");

  }

  @Override
  public void test7() throws CheckedException, UncheckedException {
    System.out.println("Inside method test7() throws CheckedException, UncheckedException");

  }

}
