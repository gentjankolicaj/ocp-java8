package ocp.java8.advance_class;

public class Sample1 {

  public static void main(String[] args) {

    Employee one = new Employee();
    one.employeeId = 101;

    Employee two = new Employee();
    two.employeeId = 101;

		if (one.equals(two)) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}

  }

}

class Employee {

  public int employeeId;
  public String firstName, lastName;
  public int yearStarted;

  @Override
  public int hashCode() {
    return employeeId;
  }

  public boolean equals(Employee employee) {
    return this.employeeId == employee.employeeId;
  }
}
