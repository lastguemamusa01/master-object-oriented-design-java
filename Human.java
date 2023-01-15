public class Human {

    // define characteristics as attributes
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(String name) {
        this.name = name; // this point to the current object
    }

    // define behaviors as mothods
    public void speak() {
        System.out.println("hi, my name is " + name);
    }

    public void eat() {
        System.out.println("eating");
    }

    public void work() {
        System.out.println("working...");
    }

}