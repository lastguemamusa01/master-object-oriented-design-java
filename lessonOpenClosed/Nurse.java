package lessonOpenClosed;

public class Nurse extends Employee{

  public Nurse(int id, String name, String department, boolean working) {
    super(id, name, department, working);
    System.out.println("Nurse in action...");
  }

  private void checkVitalsSings() {
    System.out.println("Checking vitals");
  }

  private void drawBlood() {
    System.out.println("drawing blood");
  }

  private void cleanPatientArea() {
    System.out.println("cleaning patient area");
  }

  @Override
  public void performDuties() {
    checkVitalsSings();
    drawBlood();
    cleanPatientArea();
  }



}
