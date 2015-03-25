package tutorialspoint.overriding;

import java.security.GeneralSecurityException;

import javax.crypto.BadPaddingException;

class Dog extends Animal {

  @Override
  public void move() {
    super.move();
    System.out.println("Dogs can walk and run");
  }

  public void bark() {
    System.out.println("Dogs can bark");
  }

  @Override
  public B calucalte() {
    return new B();
  }

  @Override
  public void restrict() {
    super.restrict();
  }

  @Override
  public void throwException() throws GeneralSecurityException, BadPaddingException,
      RuntimeException {
    super.throwException();
  }
}
