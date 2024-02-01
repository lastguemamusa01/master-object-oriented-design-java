package lessonOODPDependencyInjection;

public class LargeEngine implements Engine{

  private int hoursePower;

  public LargeEngine(int hoursePower) {
    this.hoursePower = hoursePower;
  }

  @Override
  public void startEngine() {
    System.out.println("started large" + hoursePower + " hp engine");
  }

}
