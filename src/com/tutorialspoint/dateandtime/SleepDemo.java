package com.tutorialspoint.dateandtime;

import java.util.Date;

public class SleepDemo {
  public static void main(String args[]) {
    try {
      System.out.println(new Date() + "\n");
      Thread.sleep(5000);
      System.out.println(new Date() + "\n");
    } catch (Exception e) {
      System.out.println("Got an exception!");
    }
  }
}
