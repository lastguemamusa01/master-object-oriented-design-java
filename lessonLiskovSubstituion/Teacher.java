package lessonLiskovSubstituion;

public abstract class Teacher {

  /*

  liskov substitution - subtypes must be substitutable for their base types

  example of OpenClosed principile
  the nurse and doctor were substitutable for their base class Employee

  LSP violation is SubstituteTeacher class in inherited from Teacher class
  because SubstituteTeacher cannot teach new things, only the thing is approved by the specific teacher
  not real teacher

  this need to be deleted


   */

  private String name;

  public abstract void teach();

  private void makeAnnouncements() {
    System.out.println("made announcements....");

  }

  private void takeAttendence() {
    System.out.println("take Attendence....");
  }

  private void collectPaperWorks() {
    System.out.println("collect paperworks....");
  }

  private void conductHallwayDuties() {
    System.out.println("conduct hallway duties....");
  }

  public void performOtherResponsibilities() {
    makeAnnouncements();
    takeAttendence();
    collectPaperWorks();
    conductHallwayDuties();
    performOtherResponsibilities();
  }


}
