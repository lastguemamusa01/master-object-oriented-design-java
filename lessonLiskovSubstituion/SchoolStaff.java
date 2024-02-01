package lessonLiskovSubstituion;

public class SchoolStaff {

  private String name;

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
