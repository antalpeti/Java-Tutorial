package com.tutorialspoint.multithreading.threadsynchronization;

class ThreadDemo extends Thread {
  private Thread t;
  private String threadName;
  PrintDemo pd;

  ThreadDemo(String name, PrintDemo pd) {
    threadName = name;
    this.pd = pd;
  }

  @Override
  public void run() {
    pd.printCount();
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
