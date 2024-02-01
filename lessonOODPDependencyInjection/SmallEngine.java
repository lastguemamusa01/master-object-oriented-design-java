package lessonOODPDependencyInjection;

public class SmallEngine implements Engine {

  private int hoursePower;

  public SmallEngine(int hoursePower) {
    this.hoursePower = hoursePower;
  }

  @Override
  public void startEngine() {
    System.out.println("started small" + hoursePower + " hp engine");
  }

}
