package secondPractice;

public class Fish extends Animal {
  public Fish(int age, String gender, int weighInLbs) {
    super(age, gender, weighInLbs);
  }

  public void swim() {
    System.out.println("swimming");
  }

  @Override
  public void move() {
    System.out.println("swimming");
  }
}
