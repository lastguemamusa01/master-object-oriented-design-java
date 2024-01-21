package secondPractice;

public class Zoo {

  public static void main(String[] args) {

    Animal sparrow1 = new Sparrow(1, "M", 3); // polymorphysm
    // sparrow1.move();

    Animal fish1 = new Fish(1, "M", 4);
    //  fish1.move();

    moveAnimal(fish1); // swimming
    moveAnimal(sparrow1); // flapping wings...

    Flyable flyingBird = new Sparrow(1, "m",4); // Fylable is interface
    flyingBird.fly(); // only method is fly

  }

  public static void moveAnimal(Animal animal) {  // polymorphysm
    animal.move();
  }

}
