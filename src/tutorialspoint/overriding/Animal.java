package tutorialspoint.overriding;

import java.security.GeneralSecurityException;

class Animal {

  public void move() {
    System.out.println("Animals can move");
  }

  public A calucalte() {
    return new A();
  }

  protected void restrict() {}

  public void throwException() throws GeneralSecurityException {

  }
}
