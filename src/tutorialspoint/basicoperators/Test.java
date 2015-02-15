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
    int d = -64;

    System.out.printf("a = %4d = %s", a, makeZeroPaddedBinary(a, 8));
    System.out.printf("\nb = %4d = %s", b, makeZeroPaddedBinary(b, 8));
    System.out.printf("\nd = %4d = %s\n", d, makeZeroPaddedBinary(d, 8));

    c = a & b; /* 12 = 0000 1100 */
    System.out.printf("\n%-8s = %s = %3d", "a & b", makeZeroPaddedBinary(c, 8), c);

    c = a | b; /* 61 = 0011 1101 */
    System.out.printf("\n%-8s = %s = %3d", "a | b", makeZeroPaddedBinary(c, 8), c);

    c = a ^ b; /* 49 = 0011 0001 */
    System.out.printf("\n%-8s = %s = %3d", "a ^ b", makeZeroPaddedBinary(c, 8), c);

    c = ~a; /*-61 = 1100 0011 */
    System.out.printf("\n%-8s = %s = %3d", "~a", makeZeroPaddedBinary(c, 8), c);

    c = a << 2; /* 240 = 1111 0000 */
    System.out.printf("\n%-8s = %s = %3d", "a << 2", makeZeroPaddedBinary(c, 8), c);

    c = a >> 2; /* 215 = 1111 */
    System.out.printf("\n%-8s = %s = %3d", "a >> 2", makeZeroPaddedBinary(c, 8), c);

    c = d >> 2; /* -16 = 1111 0000 */
    System.out.printf("\n%-8s = %s = %3d", "d >> 2", makeZeroPaddedBinary(c, 8), c);

    c = d >> 6; /* -1 = 1111 1111 */
    System.out.printf("\n%-8s = %s = %3d", "d >> 6", makeZeroPaddedBinary(c, 8), c);

    c = a >>> 2; /* 215 = 0000 1111 */
    System.out.printf("\n%-8s = %s = %3d\n", "a >>> 2", makeZeroPaddedBinary(c, 8), c);
  }


  void printLogicalOperatorsExample() {
    boolean a = true;
    boolean b = false;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    System.out.println("a && b = " + (a && b));

    System.out.println("a || b = " + (a || b));

    System.out.println("!(a && b) = " + !(a && b));
  }

  void printAssignmentOperatorsExample() {
    int a = 10;
    int b = 20;
    int c = 0;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    c = a + b;
    System.out.println("c = a + b = " + c);

    c += a;
    System.out.println("c += a  = " + c);

    c -= a;
    System.out.println("c -= a = " + c);

    c *= a;
    System.out.println("c *= a = " + c);

    a = 10;
    c = 15;
    System.out.println("a = " + a);
    System.out.println("c = " + c);

    c /= a;
    System.out.println("c /= a = " + c);

    a = 10;
    c = 15;
    System.out.println("a = " + a);
    System.out.println("c = " + c);
    c %= a;
    System.out.println("c %= a  = " + c);

    c <<= 2;
    System.out.println("c <<= 2 = " + c);

    c >>= 2;
    System.out.println("c >>= 2 = " + c);

    c >>= 2;
    System.out.println("c >>= a = " + c);

    c &= a;
    System.out.println("c &= 2  = " + c);

    c ^= a;
    System.out.println("c ^= a   = " + c);

    c |= a;
    System.out.println("c |= a   = " + c);
  }

  String makeZeroPaddedBinary(int number, int bit) {
    String padding = "00000000000000000000000000000000";
    String bin = padding + Integer.toBinaryString(number);
    return bin.substring(bin.length() - bit, bin.length());
  }

  public static void main(String args[]) {
    Test t = new Test();
    t.printArithmeticOperatorsExample();
    System.out.println();
    t.printRelationalOperatorsExample();
    System.out.println();
    t.printBitwiseOperatorsExample();
    System.out.println();
    t.printLogicalOperatorsExample();
    System.out.println();
    t.printAssignmentOperatorsExample();
  }
}
