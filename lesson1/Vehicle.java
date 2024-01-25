package lesson1;

public class Vehicle {

  // composition association - vehicle class that is composed of an engine object
  // engine only lives in the context of a vehicle object
  // Vehicle owns an Engine
  Engine myEngine;

  public Vehicle(Engine anEngine) {
    myEngine = anEngine;
  }

  public void startEngine(){
    myEngine.start();
  }
  public void stopEngine(){
    System.out.println("Stopping my engine");
  }

  public void accelerate(){
    System.out.println("accelerating myself");
  }


}
