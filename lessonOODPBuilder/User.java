package lessonOODPBuilder;

public class User {

  private String userName; // required
  private String emailAddress; // required

  // optional fields
  private String firstName;
  private String lastName;
  private int phoneNumber;
  private String address;

  // builder pattern
  private User(Builder builder) {
    this.userName = builder.userName;
    this.emailAddress = builder.emailAddress;
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.phoneNumber = builder.phoneNumber;
    this.address = builder.address;
  }

  @Override
  public String toString() {
    return "User{" + "userName='" + userName + '\'' + ", emailAddress='" + emailAddress + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", phoneNumber=" + phoneNumber + ", address='" + address + '\'' + '}';
  }

  public static class Builder {

    private String userName; // required
    private String emailAddress; // required

    // optional fields
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String address;

    public Builder(String userName, String email) {
      this.userName = userName;
      emailAddress = email;
    }

    public Builder firstName(String value) {
      this.firstName = value;
      return this;
    }

    public Builder lastName(String value) {
      this.lastName = value;
      return this;
    }

    public Builder phoneNumber(int value) {
      this.phoneNumber = value;
      return this;
    }

    public Builder address(String value) {
      this.address = value;
      return this;
    }

    public User build() {
      return new User(this);
    }

  }
}
