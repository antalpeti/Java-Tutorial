package tutorialspoint.basicoperators;

public class Test {

  void printArithmeticOperatorsExample() {
    int a = 10;
    int b = 20;
    int c = 25;
    int d = 25;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + a * b);
    System.out.println("b / a = " + b / a);
    System.out.println("b % a = " + b % a);
    System.out.println("c % a = " + c % a);
    System.out.println("a++   = " + a++);
    System.out.println("b--   = " + b--);
    // Check the difference in d++ and ++d
    System.out.println("d++   = " + d++);
    System.out.println("++d   = " + (++d));
  }

  public static void main(String args[]) {
    Test t = new Test();
    t.printArithmeticOperatorsExample();
  }
}
