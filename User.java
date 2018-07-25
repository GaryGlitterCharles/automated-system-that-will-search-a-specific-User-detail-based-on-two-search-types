package crtasses;

public class User {
  private String userName;
  private String firstName;
  private String lastName;
  private String contact;

  public User() {

  }

  public User(String userName, String firstName, String lastName, String contact) {

    this.userName = userName;
    this.firstName = firstName;
    this.lastName = lastName;
    this.contact = contact;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  @Override
  public String toString() {
    return "Username :" + userName + "\nFirstName :" + firstName + "\nLastName :" + lastName + "\nContact :" + contact;

  }

  User findUser(User userArray[], String userName) {

    for (int i = 0; i < userArray.length; i++) {

      if (userName.equals(userArray[i].userName)) {
        return userArray[i];
      }

    }

    return null;

  }

  User findUser(User userArray[], String firstName, String lastName) {
    for (int i = 0; i < userArray.length; i++) {
      if (firstName.equals(userArray[i].firstName) && lastName.equals(userArray[i].lastName)) {
        return userArray[i];
      }

    }
    return null;

  }
}