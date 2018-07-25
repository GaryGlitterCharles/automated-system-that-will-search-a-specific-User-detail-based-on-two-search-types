package crtasses;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total number of users");
    int noOfUsers = sc.nextInt();
    User userArray[] = new User[noOfUsers];
    User user = new User();
    sc.nextLine();
    System.out.println("Enter user details");
    for (int i = 0; i < noOfUsers; i++) {

      String details = sc.nextLine();
      String[] userDetails = details.split(",");
      userArray[i] = new User(userDetails[0], userDetails[1], userDetails[2], userDetails[3]);

    }
    System.out.println("1)Search user by user name");
    System.out.println("2)Search user by first name and last name");
    System.out.println("Enter your option");
    int option = sc.nextInt();
    User userSearch = null;
    if (option == 1) {
      System.out.println("Enter the user name to search");
      sc.nextLine();
      String userName = sc.nextLine();
      userSearch = user.findUser(userArray, userName);

    } else if (option == 2) {
      System.out.println("Enter the first name to search");
      System.out.println("Enter the last name to search");
      String firstName = sc.next();
      sc.nextLine();
      String lastName = sc.nextLine();
      userSearch = user.findUser(userArray, firstName, lastName);
    }

    if (userSearch != null) {
      System.out.println("User details:");
      System.out.println(userSearch.toString());
    } else
      System.out.println("User not found");
    sc.close();
  }

}
