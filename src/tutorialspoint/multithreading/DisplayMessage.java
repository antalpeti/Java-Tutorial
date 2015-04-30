package tutorialspoint.multithreading;

public class DisplayMessage implements Runnable {
  private String message;

  public DisplayMessage(String message) {
    this.message = message;
  }

  @Override
  public void run() {
    int i = 0;
    while (i++ < 10) {
      System.out.println(message);
    }
  }

  public static void main(String[] args) {

    Thread t = new Thread(new DisplayMessage("Hello"), "Thead-1") {
      @Override
      public synchronized void start() {
        System.out.println(this.getName() + " starting.");
        super.start();
      }
    };
    t.start();
  }
}
