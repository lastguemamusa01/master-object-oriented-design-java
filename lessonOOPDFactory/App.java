package lessonOOPDFactory;


public class App {

  /*
  factory pattern - useful when we want to use another class(factory class) to create objects for us
  client don't need to know about the implementation that create objects

   */

  public static void main(String[] args) {
    VehicleFactory vehicleFactory = new VehicleFactory();
    Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.ELECTRIC_CAR);
    vehicle.startEngine();
  }

}
