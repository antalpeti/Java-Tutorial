package com.tutorialspoint.multithreading.interthreadcommunication;

public class TestThread {
  public static void main(String[] args) {
    Chat m = new Chat();
    new T1(m);
    new T2(m);
  }
}
