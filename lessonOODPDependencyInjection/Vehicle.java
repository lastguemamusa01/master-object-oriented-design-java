package lessonOODPDependencyInjection;

public class Vehicle {

  // hard coding the dependency to a specific implementation of large engine with 500 words of hoursePower
  // Engine racingEngine = new LargeEngine(500);

  // we changed hardcoded implementation to more generic -> using constructor
  Engine myEngine;

  public Vehicle(Engine anEngine) {
    myEngine = anEngine;
  }

  public void crankIgnition() {
    myEngine.startEngine();
    System.out.println("Vehicle is running");
  }

}
