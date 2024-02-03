package lessonOOPDObserver.domain;

import java.util.*;

public class EmployeeDAO {


  // mocked DAO, real implementation need JDBC connector to database to write
  Employee emp1 = new Employee("mike", null, 5000, false);
  Employee emp2 = new Employee("stve", null, 5000, false);
  Employee emp3 = new Employee("jhon", null, 5000, false);
  Employee emp4 = new Employee("pat", null, 5000, false);
  Employee emp5 = new Employee("joe", null, 5000, false);

  List<Employee> employees;

  public List<Employee> generateEmployees() {

    employees = new ArrayList<Employee>();

    employees.add(emp1);
    employees.add(emp2);
    employees.add(emp3);
    employees.add(emp4);
    employees.add(emp5);

    return employees;
  }

  public void addEmployee(Employee emp) {
    employees.add(emp);
  }

}
