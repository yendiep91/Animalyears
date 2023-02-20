// **********************************************************
// Declares variables for the input
// Prompt and reads users input
// Computes the user's age in Rabit years and Dog years
// Output a string inccorporating the variables
//***********************************************************

// Author: Yen Diep
// Date of Last Modification: 02/01/2023
// Course: CS111B
// Instructor: C. Conner
// Assignment #: 1
// Filename: AnimalYears.java
// This program will use standard input and output, as well as data and arithmetic expression to compute the user's age in rabbit years and dog years.
//***********************************************************

import java.util.Scanner;


public class Main {
  public static void main(String[] args) 
  {
    // Read the input name 
      Scanner scan = new Scanner(System.in) ;
    System.out.print("Please enter your name: ");
    String username = scan.nextLine();

    // Read the input dog's name 
    System.out.print("Please enter your dog name: ");
    String dogname = scan.nextLine();

    // Read the input rabbit's name 
    System.out.print("Please enter your rabbits's name: ");
    String rabbitname = scan.nextLine();

    // Read the numerical input
    System.out.print("Please enter your age: ");
    int age = scan.nextInt();

    // Compute user's age in rabbit years
    int Rabbityear = 10 * age;
    int Dogyear = 7 * age;
    
    System.out.print('\n' + "Hello my name is " + username + " and  I am " + age + " years old. That is " + Dogyear + " in dog years and " + Rabbityear + " in rabbit years!!! Neither " + dogname + " nor " + rabbitname + " can count that high :)");
  }
}

