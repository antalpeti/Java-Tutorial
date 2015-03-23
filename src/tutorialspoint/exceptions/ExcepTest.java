package tutorialspoint.exceptions;

import java.io.FileNotFoundException;
import java.rmi.RemoteException;

public class ExcepTest {

  public static void main(String args[]) {
    int a[] = new int[2];
    try {
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
    } finally {
      a[0] = 6;
      System.out.println("First element value: " + a[0]);
      System.out.println("The finally statement is executed");
    }
    System.out.println("Out of the block");

  }

  public void deposit(double amount) throws RemoteException {
    // Method implementation
    throw new RemoteException();
  }

  public void withdraw(double amount) throws RemoteException, FileNotFoundException {
    // Method implementation
    throw new FileNotFoundException();
  }
}
