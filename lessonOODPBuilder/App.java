package lessonOODPBuilder;

public class App {

  /*
  Builder pattern used for creating object instances, specially useful to dealing with classes
  which have a large number of constructor arguments

  example of User class
  where userName and emailAddress are mandatory
  but firstName, lastName, phoneNumber and address are optional
  we can use 3 constructor overloading -> anti pattern named telescoping constructor
  1 constructor - only mandatory fields
  2 constructor - only optional fields
  3 constructor - both mandatory and optional fields(all fields)
  - a lot of number of arguments -

  another constructor is default contructor with no arguments, with getters and setters.
  using setters later. -> bad practice - not thread safe

  using builder pattern we are simplifying the construction of an object by introducing
  handy methods rather than having multiple constructors
  builder pattern - order of the argument doesn't matter

   */


  public static void main(String[] args) {
    User websiteUser = new User.Builder("minku", "fwet235@gmail.com").firstName("min ku").lastName("nam").phoneNumber(5235).address("mi casa").build();  // Builder is static class inside the User

    System.out.println(websiteUser);
  }


}
