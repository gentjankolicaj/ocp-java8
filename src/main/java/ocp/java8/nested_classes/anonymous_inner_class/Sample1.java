package ocp.java8.nested_classes.anonymous_inner_class;

interface Worker {

  int works();
}

public class Sample1 {

  public static void main(String[] args) {

    calculateStudentWork(10);

    new Sample1().calculateStudentWork1(8);

  }

  //I can use anonymous inner class in static methods
  public static void calculateStudentWork(int numberOfStudents) {
    int i = 0;
    while (i < numberOfStudents) {
      Student student = new Student() {
        public int works() {
          return 1;
        }
      };
      i++;
      System.out.println(student.works());
    }

    System.out.println();
  }

  //I can use anonymous inner class in instance methods
  public void calculateStudentWork1(int numberOfStudents) {
    int i = 0;
    while (i < numberOfStudents) {
      Student student = new Student() {
        public int works() {
          return 2;
        }
      };

      i++;

      System.out.println(student.works());
    }
  }

}

class Student implements Worker {

  @Override
  public int works() {
    return 0;
  }

}
