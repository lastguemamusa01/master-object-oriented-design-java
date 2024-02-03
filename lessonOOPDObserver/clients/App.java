package lessonOOPDObserver.clients;


import lessonOOPDObserver.domain.Employee;
import lessonOOPDObserver.observers.HRDepartment;
import lessonOOPDObserver.observers.IObserver;
import lessonOOPDObserver.observers.PayrollDepartment;
import lessonOOPDObserver.subjects.EmployeeManagementSystem;

import java.util.Date;

public class App {

  /*

  Observer Pattern - sued to notfity objects of state changes and these objects
  are basically interested in changes to another object.

  Subject - maintain list of observers
  observer can be abtract class or interface
  ConcreteObserverA and ConcreteObserverB

   */

  public static void main(String[] args) {

    IObserver payroll = new PayrollDepartment();
    IObserver hrSystem = new HRDepartment();

    EmployeeManagementSystem ems = new EmployeeManagementSystem();

    ems.registerObserver(payroll);
    ems.registerObserver(hrSystem);

    Employee min = new Employee("min", new Date(), 35000, true);
    ems.hireNewEmployee(min);

    ems.modifyEmployeeName(5, "Dan");

  }


}
