package homework1.hobby;

import java.util.Scanner;

public class Hobby {

    public static void main(String [] args){

    System.out.println("Please enter your name:");

    Scanner scanner = new Scanner(System.in);

    String name = scanner.nextLine();

    System.out.println("Please enter your favourite hobby:");

    String hobby = scanner.nextLine();

    System.out.println("Hi, " + name + ", we have useful information about " + hobby + " in our website.");


}
}

