package lessonSingleReponsability.clients;

import lessonSingleReponsability.domain.Employee;
import lessonSingleReponsability.domain.dao.EmployeeDAO;
import lessonSingleReponsability.reporting.EmployeeReportFormatter;
import lessonSingleReponsability.reporting.FormatType;

public class ClientModule {

  public static void main(String[] args) {
    Employee min = new Employee(1, "min", "it", true);
    hireNewEmployee(min);
    printEmployeeReport(min,FormatType.XML);
    terminatedEmployee(min);


  }

  public static void hireNewEmployee(Employee employee) {
    EmployeeDAO employeeDAO = new EmployeeDAO(); // clientModule is very tightly coupled to the employee
    employeeDAO.saveEmployee(employee);
  }

  public static void terminatedEmployee(Employee employee) {
    EmployeeDAO employeeDAO = new EmployeeDAO();
    employeeDAO.deleteEmployee(employee);
  }

  public static void printEmployeeReport(Employee employee, FormatType formatType) {
    EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
    System.out.println(formatter.getFormattedEmployee());
  }

}
