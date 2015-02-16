package tutorialspoint.modifiertypes;

public class MyRunnable implements Runnable {

  /**
   * An instance variable is marked transient to indicate the JVM to skip the particular variable
   * when serializing the object containing it.
   */
  public transient int limit = 55; // will not persist
  public int b; // will persist
  /**
   * The volatile is used to let the JVM know that a thread accessing the variable must always merge
   * its own private copy of the variable with the master copy in the memory.
   *
   * Accessing a volatile variable synchronizes all the cached copied of the variables in the main
   * memory. Volatile can only be applied to instance variables, which are of type object or
   * private. A volatile object reference can be null.
   */
  private volatile boolean active;

  @Override
  public void run() {
    active = true;
    while (active) // line 1
    {
      // some code here
    }
  }

  public void stop() {
    active = false; // line 2
  }

  /**
   * The synchronized key word used to indicate that a method can be accessed by only one thread at
   * a time. The synchronized modifier can be applied with any of the four access level modifiers.
   */
  public synchronized void showDetails() {}
}
