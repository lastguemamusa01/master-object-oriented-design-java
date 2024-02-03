package lessonOOPDObserver.domain;

import org.w3c.dom.css.Counter;

import java.util.Date;

public class Employee {

  private String name;
  private Date hireDate;
  private int salary;
  public int employeeId;
  private boolean working = false;


  private static int COUNTER;

  public Employee(String name, Date hireDate, int salary, boolean working) {
    this.name = name;
    this.hireDate = hireDate;
    this.salary = salary;
    this.employeeId = ++COUNTER;
    this.working = working;
  }

  @Override
  public String toString() {
    return "Employee{" + "name='" + name + '\'' + ", hireDate=" + hireDate + ", salary=" + salary + ", employeeId=" + employeeId + ", working=" + working + '}';
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return employeeId;
  }
}
