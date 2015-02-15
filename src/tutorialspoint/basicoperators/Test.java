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

  void printRelationalOperatorsExample() {
    int a = 10;
    int b = 20;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("a == b = " + (a == b));
    System.out.println("a != b = " + (a != b));
    System.out.println("a > b = " + (a > b));
    System.out.println("a < b = " + (a < b));
    System.out.println("b >= a = " + (b >= a));
    System.out.println("b <= a = " + (b <= a));
  }

  void printBitwiseOperatorsExample() {
    int a = 60; /* 60 = 0011 1100 */
    int b = 13; /* 13 = 0000 1101 */
    int c = 0;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    c = a & b; /* 12 = 0000 1100 */
    System.out.println("a & b = " + c);

    c = a | b; /* 61 = 0011 1101 */
    System.out.println("a | b = " + c);

    c = a ^ b; /* 49 = 0011 0001 */
    System.out.println("a ^ b = " + c);

    c = ~a; /*-61 = 1100 0011 */
    System.out.println("~a = " + c);

    c = a << 2; /* 240 = 1111 0000 */
    System.out.println("a << 2 = " + c);

    c = a >> 2; /* 215 = 1111 */
    System.out.println("a >> 2  = " + c);

    c = a >>> 2; /* 215 = 0000 1111 */
    System.out.println("a >>> 2 = " + c);
  }

  public static void main(String args[]) {
    Test t = new Test();
    t.printArithmeticOperatorsExample();
    System.out.println();
    t.printRelationalOperatorsExample();
    System.out.println();
    t.printBitwiseOperatorsExample();
  }
}
