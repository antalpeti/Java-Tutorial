package com.tutorialspoint.multithreading.threadsynchronization;

public class ThreadDemoSynchronized extends Thread {
  private Thread t;
  private String threadName;
  PrintDemo pd;

  ThreadDemoSynchronized(String name, PrintDemo pd) {
    threadName = name;
    this.pd = pd;
  }

  @Override
  public void run() {
    synchronized (pd) {
      pd.printCount();
    }
    System.out.println("Thread " + threadName + " exiting.");
  }

  @Override
  public void start() {
    System.out.println("Starting " + threadName);
    if (t == null) {
      t = new Thread(this, threadName);
      t.start();
    }
  }
}
