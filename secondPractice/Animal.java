package secondPractice;

public abstract class Animal {

  int age;
  String gender;
  int weighInLbs;

  public Animal(int age, String gender, int weighInLbs) {
    this.age = age;
    this.gender = gender;
    this.weighInLbs = weighInLbs;
  }

  public void eat() {
    System.out.println("eating...");
  }

  public void sleep(){
    System.out.println("Sleeping...");
  }

  public abstract void move();

}
