package lessonSolid.domain;

public class Employee {

  /*
  Class names should be nouns based on their intent

  Hospital Employee Management System
  features :
    - hiring and terminantiong of Employees
    - Print Reports in XML or CSV

  SOLID

  S ingle responsability principle
  O pen closed principle
  L iskov substitution principle
  I nterface segregation principle
  D ependency inversion principle

  responsibility is not behaviors -> single responsability -> a lot of reposibility is bad design
  DRY - dont repeat yourself -> keep application dry

  DAO - Data Access Object
  SRP(single responsability principle) allows for proper separation of concerns
  SRP (classes) -> ReportFormatter, EmployeeReportFormatter, Employee, EmployeeDAO, DatabaseConnectionManager

  class ClientModule -> have the functions to call the features

  Employee is POJO

   */

  private int id;
  private String name;
  private String department;
  private boolean working;

  public Employee(int id, String name, String department, boolean working) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.working = working;
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' + ", working=" + working + '}';
  }

}
