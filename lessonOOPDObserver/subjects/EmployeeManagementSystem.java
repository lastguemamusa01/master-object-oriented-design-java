package lessonOOPDObserver.subjects;

import lessonOOPDObserver.domain.Employee;
import lessonOOPDObserver.domain.EmployeeDAO;
import lessonOOPDObserver.observers.IObserver;
import java.util.*;

public class EmployeeManagementSystem implements ISubject {


  private List<IObserver> observers;
  private List<Employee> employees;
  private EmployeeDAO employeeDAO;
  private Employee employee;
  private String msg;

  public EmployeeManagementSystem() {
    observers = new ArrayList<IObserver>();
    employeeDAO = new EmployeeDAO();
    employees = employeeDAO.generateEmployees();
  }

  @Override
  public void registerObserver(IObserver o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(IObserver o) {
    observers.remove(o);
  }

  @Override
  public void notifyObserver() {

    for(IObserver department: observers) department.callMe(employee, msg);

  }

  public void hireNewEmployee(Employee emp) {
    employee = emp;
    msg = "new Hire: ";
    employees.add(emp);
    // notify the observer
    notifyObserver();
  }

  public void modifyEmployeeName(int id, String newName) {
    boolean notify = false;

    for(Employee emp: employees) {
      if(id == emp.employeeId) {
        emp.setName(newName);
        employee = emp;
        msg = "Employee name has been modified";
        notify = true;
      }
    }

    if(notify) notifyObserver();

  }

}
