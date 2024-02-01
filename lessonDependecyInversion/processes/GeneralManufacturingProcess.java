package lessonDependecyInversion.processes;

public abstract class GeneralManufacturingProcess {

  /*
  violation of Dependecy inversion happens

  when higher level modules depend on lower level ones suspectible to change

  tightly coupling
  Dependecy inversion - high level modules should not depend on low level modules. both depend on abstractions

  abstract classes and interfaces don't change as often as concrete derivatives

  goal of using packages -  cohesion - keep releated things together.
  package should have a single feature


   */


  private String processName;
  public GeneralManufacturingProcess(String name) {
    processName=name;
  }
  protected abstract void assembleDevice();
  protected abstract void testDevice();
  protected abstract void packageDevice();
  protected abstract void storeDevice();

  // template design pattern
  public void launchProcess() {

    if (processName != null && !processName.isEmpty()) {
      assembleDevice();
      testDevice();
      packageDevice();
      storeDevice();
    }
    else {
      System.out.println("no process name was specified");
    }
  }

}
