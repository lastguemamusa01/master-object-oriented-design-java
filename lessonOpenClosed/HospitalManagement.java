package lessonOpenClosed;

public class HospitalManagement {


  // the Open extension and closed to modification
  // this could be done using an interface rather than making the Employee class abstract
  // this is strategy pattern -> design pattern
  // strategy pattern - enables and algorithms behavior to be selected at runtime
  // unit test of the HospitalManagement will be not changed

  public void callUpon(Employee employee) {
    employee.performDuties(); // we are calling the abstract method of the Employee class
  }

  /*
  red flag - there is no employee behavior in employee object

   */
//  public void callUpon(Employee employee) {
//    // this class will be messy with more employee classes like ceo, janitor, etc
//    // violate Open closed principle
//    // this class open to modification
//    if(employee instanceof Nurse) { // bad use instanceof
//      checkVitalsSings();
//      drawBlood();
//      cleanPatientArea();
//    } else if(employee instanceof  Doctor) {
//      prescribeMedicine();
//      diagnosePatiente();
//    }
//  }

  // single responsablity violations
  // Nurses
//  private void checkVitalsSings() {
//    System.out.println("Checking vitals");
//  }
//
//  private void drawBlood() {
//    System.out.println("drawing blood");
//  }
//
//  private void cleanPatientArea() {
//    System.out.println("cleaning patient area");
//  }

  // doctor
//  private void prescribeMedicine() {
//    System.out.println("Prescribed medicine");
//  }
//
//  private void diagnosePatiente() {
//    System.out.println("Dianosing Patient");
//  }

}
