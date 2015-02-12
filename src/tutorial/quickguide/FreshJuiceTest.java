package tutorial.quickguide;

import tutorial.quickguide.FreshJuice.FreshJuiceSize;

public class FreshJuiceTest {

  public static void main(String args[]) {
    FreshJuice juice = new FreshJuice();
    juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    System.out.println("Size :" + juice.size);

    for (FreshJuiceSize size : FreshJuiceSize.values()) {
      System.out.println("Size :" + size);
    }
  }
}
