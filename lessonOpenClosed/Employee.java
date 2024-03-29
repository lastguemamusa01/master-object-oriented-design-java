package lessonOpenClosed;

abstract public class Employee {

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

  // convert the Employee class to abstract and add abtract class performDuties
  // this is for nurse and doctor call their respective duties and able to call respective doctor or nurse in HospitalManagement class
  public abstract void performDuties();

  @Override
  public String toString() {
    return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' + ", working=" + working + '}';
  }

}
