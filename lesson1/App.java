package lesson1;

public class App {

  public static void main(String[] args) {
    Engine myEngine = new Engine();
    Driver minku = new Driver();
    Vehicle myCar = new Vehicle(myEngine);
    Vehicle anotherCar = new Vehicle(myEngine);
    minku.drive(myCar);

    myCar.accelerate();
    anotherCar.accelerate();

  }

}
