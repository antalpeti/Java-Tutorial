package com.tutorialspoint.multithreading.threadsynchronization;

public class PrintDemo {
  public void printCount() {
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println(Thread.currentThread().getName() + " : Counter   ---   " + i);
      }
    } catch (Exception e) {
      System.out.println("Thread  interrupted.");
    }
  }

}
