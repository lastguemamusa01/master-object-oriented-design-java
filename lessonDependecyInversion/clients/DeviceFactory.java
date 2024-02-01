package lessonDependecyInversion.clients;

import lessonDependecyInversion.processes.GeneralManufacturingProcess;
import lessonDependecyInversion.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
  public static void main(String[] args) {
    GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("Iphone");
    manufacturer.launchProcess();
  }
}
