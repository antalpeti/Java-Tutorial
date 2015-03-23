package tutorialspoint.exceptions;

public class ExcepTest {

  public static void main(String args[]) {
    try {
      int a[] = new int[2];
      System.out.println("Access element three :" + a[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception thrown  :" + e);
      System.out.println("getLocalizedMessage: " + e.getLocalizedMessage());
      System.out.println("getMessage: " + e.getMessage());
      System.out.println("getCause: " + e.getCause());
      System.out.println("getStackTrace: " + e.getStackTrace());
      System.out.println("getSuppressed: " + e.getSuppressed());
      System.out.println("toString: " + e.toString());
      System.out.println("printStackTrace: ");
      e.printStackTrace();
    }
    System.out.println("Out of the block");
  }
}
