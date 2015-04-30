package com.tutorialspoint.decisionmaking;

public class Test {

  private static void executeIfStatement() {
    int x = 10;

    if (x < 20) {
      System.out.print("This is if statement");
    }
  }

  private static void executeIfElseStatement() {
    int x = 30;

    if (x < 20) {
      System.out.print("This is if statement");
    } else {
      System.out.print("This is else statement");
    }
  }

  private static void executeIfElseIfElseStatement() {
    int x = 30;

    if (x == 10) {
      System.out.print("Value of X is 10");
    } else if (x == 20) {
      System.out.print("Value of X is 20");
    } else if (x == 30) {
      System.out.print("Value of X is 30");
    } else {
      System.out.print("This is else statement");
    }
  }

  private static void executeNestedIfElseStatement() {
    int x = 30;
    int y = 10;

    if (x == 30) {
      if (y == 10) {
        System.out.print("X = 30 and Y = 10");
      }
    }
  }

  private static void executeSwitchStatement(char arg) {
    // char grade = args[0].charAt(0);
    char grade = arg != 0 ? arg : 'C';
    switch (grade) {
      case 'A':
        System.out.println("Excellent!");
        break;
      case 'B':
      case 'C':
        System.out.println("Well done");
        break;
      case 'D':
        System.out.println("You passed");
      case 'F':
        System.out.println("Better try again");
        break;
      default:
        System.out.println("Invalid grade");
    }
    System.out.println("Your grade is " + grade);
  }

  public static void main(String[] args) {
    System.out.println("If Statement");
    executeIfStatement();

    System.out.println("\n\nIf Else Statement");
    executeIfElseStatement();

    System.out.println("\n\nIf Else If Else Statement");
    executeIfElseIfElseStatement();

    System.out.println("\n\nNested If Else Statement");
    executeNestedIfElseStatement();

    char arg = args.length > 0 ? args[0].charAt(0) : 0;
    System.out.println("\n\nSwitch Statement");
    executeSwitchStatement(arg);
  }
}
