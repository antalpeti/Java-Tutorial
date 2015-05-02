package com.tutorialspoint.multithreading.threadsynchronization;


public class TestThread {
  public static void main(String args[]) {

    PrintDemo pd = new PrintDemo();

    ThreadDemo t1 = new ThreadDemo("Thread - 1 ", pd);
    ThreadDemo t2 = new ThreadDemo("Thread - 2 ", pd);
    ThreadDemoSynchronized t3 = new ThreadDemoSynchronized("Thread - 3 ", pd);
    ThreadDemoSynchronized t4 = new ThreadDemoSynchronized("Thread - 4 ", pd);

    t1.start();
    t2.start();

    // wait for threads to end
    try {
      t1.join();
      t2.join();
    } catch (Exception e) {
      System.out.println("Interrupted");
    }
    do {
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e1) {
        e1.printStackTrace();
      }
    } while (t1.isAlive() || t2.isAlive());

    t3.start();
    t4.start();

    // wait for threads to end
    try {
      t3.join();
      t4.join();
    } catch (Exception e) {
      System.out.println("Interrupted");
    }
    System.out.println("Main exit...");
  }
}
