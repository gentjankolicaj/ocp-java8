package ocp.java8.inheritance.interfaces.custom_exceptions;

public interface ExceptionInterface {

  void test1();

  void test2() throws Exception;

  void test3() throws RuntimeException;

  void test4() throws Error;

  void test5() throws Throwable;

  void test6() throws Exception;

  void test7() throws CheckedException, UncheckedException;

}
