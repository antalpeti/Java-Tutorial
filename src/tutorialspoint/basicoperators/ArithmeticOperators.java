package tutorialspoint.basicoperators;

public class ArithmeticOperators {

  /**
   * Adds values on either side of the operator
   *
   * @param a
   * @param b
   * @return
   */
  int doAddition(int a, int b) {
    return a + b;
  }

  /**
   * Subtracts right hand operand from left hand operand
   *
   * @param a
   * @param b
   * @return
   */
  int doSubtraction(int a, int b) {
    return a - b;
  }

  /**
   * Multiplies values on either side of the operator
   *
   * @param a
   * @param b
   * @return
   */
  int doMultiplication(int a, int b) {
    return a * b;
  }

  /**
   * Divides left hand operand by right hand operand
   *
   * @param a
   * @param b
   * @return
   */
  int doDivision(int a, int b) {
    return a / b;
  }

  /**
   * Divides left hand operand by right hand operand and returns remainder
   *
   * @param a
   * @param b
   * @return
   */
  int doModulus(int b, int a) {
    return b % a;
  }

  /**
   * Increases the value of operand by 1
   *
   * @param a
   * @return
   */
  int doIncrement(int a) {
    a++;
    return a;
  }

  /**
   * Decreases the value of operand by 1
   *
   * @param b
   * @return
   */
  int doDecrement(int b) {
    b--;
    return b;
  }

  public static void main(String[] args) {
    ArithmeticOperators aop = new ArithmeticOperators();
    int a = 10, b = 20;
    System.out.printf("%d + %d = %d", a, b, aop.doAddition(a, b));
    System.out.printf("\n%d - %d = %d", a, b, aop.doSubtraction(a, b));
    System.out.printf("\n%d * %d = %d", a, b, aop.doMultiplication(a, b));
    System.out.printf("\n%d / %d = %d", a, b, aop.doDivision(a, b));
    System.out.printf("\n%d mod %d = %d", b, a, aop.doModulus(b, a));
    System.out.printf("\n%d++ = %d", a, aop.doIncrement(a));
    System.out.printf("\n%d-- = %d", b, aop.doDecrement(b));
  }
}
