package com.madhusudhan.java7.coin.multiex;

public class SingleCatchMultiExceptions {
  public void newMultiCatch() {
    try {
      methodThatThrowsThreeExceptions(3);
    } catch (ExceptionOne | ExceptionTwo | ExceptionThree e) {
      e.printStackTrace();
    }

  }

  public void newMultiMultiCatch() {
    try {
      methodThatThrowsThreeExceptions(2);
    } catch (ExceptionOne e) {
      e.printStackTrace();
    } catch (ExceptionTwo | ExceptionThree e) {
      e.printStackTrace();
    }

  }

  public void oldMultiCatch() {
    try {
      methodThatThrowsThreeExceptions(1);
    } catch (ExceptionOne e) {
      e.printStackTrace();
    } catch (ExceptionTwo e) {
      e.printStackTrace();
    } catch (ExceptionThree e) {
      e.printStackTrace();
    }
  }

  public void methodThatThrowsThreeExceptions(int exNum) throws ExceptionOne, ExceptionTwo,
  ExceptionThree {
    switch (exNum) {
      case 1:
        throw new ExceptionOne();
      case 2:
        throw new ExceptionTwo();
      case 3:
        throw new ExceptionThree();
      default:
        break;
    }
  }

  public static void main(String[] args) {
    SingleCatchMultiExceptions scme = new SingleCatchMultiExceptions();
    scme.oldMultiCatch();
    scme.newMultiMultiCatch();
    scme.newMultiCatch();
  }
}
