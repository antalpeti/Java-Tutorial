package com.tutorialspoint.loopcontrol;

public class Test {

  private static void executeWhileLoop(int x) {
    while (x < 20) {
      System.out.print("value of x : " + x);
      x++;
      System.out.print("\n");
    }
  }

  private static void executeDoWhileLoop(int x) {
    do {
      System.out.print("value of x : " + x);
      x++;
      System.out.print("\n");
    } while (x < 20);
  }

  private static void executeForLoop() {
    int x;
    for (x = 10; x < 20; x = x + 1) {
      System.out.print("value of x : " + x);
      System.out.print("\n");
    }
  }

  private static void executeEnhancedForLoop() {
    int[] numbers = {10, 20, 30, 40, 50};

    for (int x : numbers) {
      System.out.print(x);
      System.out.print(",");
    }
    System.out.print("\n");
    String[] names = {"James", "Larry", "Tom", "Lacy"};
    for (String name : names) {
      System.out.print(name);
      System.out.print(",");
    }
  }

  private static void executeBreakKeyword() {
    int[] numbers = {10, 20, 30, 40, 50};

    for (int x : numbers) {
      if (x == 30) {
        break;
      }
      System.out.print(x);
      System.out.print("\n");
    }
  }

  private static void executeContinueKeyword() {
    int[] numbers = {10, 20, 30, 40, 50};

    for (int x : numbers) {
      if (x == 30) {
        continue;
      }
      System.out.print(x);
      System.out.print("\n");
    }
  }

  public static void main(String args[]) {
    int x = 10;

    System.out.println("While Loop:");
    executeWhileLoop(x);

    System.out.println("\nDo While Loop:");
    executeDoWhileLoop(x);

    System.out.println("\nFor Loop:");
    executeForLoop();

    System.out.println("\nEnhanced For Loop:");
    executeEnhancedForLoop();

    System.out.println("\n\nBreak Keyword:");
    executeBreakKeyword();

    System.out.println("\nContinue Keyword:");
    executeContinueKeyword();
  }
}
