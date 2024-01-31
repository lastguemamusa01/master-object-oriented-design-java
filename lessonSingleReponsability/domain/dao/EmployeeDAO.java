package lessonSingleReponsability.domain.dao;

import lessonSingleReponsability.domain.Employee;

public class EmployeeDAO {

  public void saveEmployee(Employee employee) {
//    DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//    connectionManager.connect();
//    connectionManager.getConnectionObject().prepareStatement("insert into Employee_tbl");
//    connectionManager.disconnect();
    System.out.println("saved employee to the database " + employee);
  }

  public void deleteEmployee(Employee employee) {
      System.out.println("deleted emplloy from the database " +employee);
  }

}
