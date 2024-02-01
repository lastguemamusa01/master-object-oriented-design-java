package lessonOODPDependencyInjection;

public class App {

  /*

  Class Car
  have Engine polymorphism new LargeEngine
  have Windshield polymorphism new BulletProofWindShield
  FuelTank -> LargeFuelTank
  Battery -> LargeBattery
  Radiator -> Radiator

  Object Oriented Design Pattern -> Dependency Injection pattern

  Dependency Injection allows us to do is to get rid of all these new Keywords that
  inside of this specific objects, so those objects are not tied to those specific implementations

  DI(Dependency Injection) - powerful mechanism for separating the contruction of an object from its eventual use

  object should not be responsible for instantiating each other-> because that leads tightly coupling

  Spring framework or another framework -> provide DI -> named spring containers

   */

  public static void main(String[] args) {
    // Vehicle raceCar = new Vehicle(); // alway will be 500 hoursepower , not good design
    Vehicle raceCar = new Vehicle(new LargeEngine(500)); // dependency injection in action
    Vehicle normalCar = new Vehicle(new SmallEngine(100));
    raceCar.crankIgnition();
    normalCar.crankIgnition();
  }

}
