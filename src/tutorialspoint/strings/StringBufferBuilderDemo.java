package tutorialspoint.strings;

public class StringBufferBuilderDemo {

  private static void executeAppend() {
    StringBuffer sb = new StringBuffer("Test");
    sb.append(" String Buffer");
    System.out.println(sb);
  }

  private static void executeReverse() {
    StringBuffer buffer = new StringBuffer("Game Plan");
    buffer.reverse();
    System.out.println(buffer);
  }

  private static void executeDelete() {
    StringBuffer sb = new StringBuffer("abcdefghijk");
    sb.delete(3, 7);
    System.out.println(sb);
  }

  private static void executeInsert() {
    StringBuffer sb = new StringBuffer("abcdefghijk");
    sb.insert(3, "123");
    System.out.println(sb);
  }

  private static void executeReplace() {
    StringBuffer sb = new StringBuffer("abcdefghijk");
    sb.replace(3, 8, "ZARA");
    System.out.println(sb);
  }

  public static void main(String args[]) {
    StringBuffer sBuffer = new StringBuffer(" test");
    sBuffer.append(" String Buffer");
    System.out.println(sBuffer);

    System.out.println("\nappend(String s)");
    executeAppend();

    System.out.println("\nreverse()");
    executeReverse();

    System.out.println("\ndelete()");
    executeDelete();

    System.out.println("\ninsert(int offset, int i)");
    executeInsert();

    System.out.println("\nreplace(int start, int end, String str)");
    executeReplace();

    StringBuilder sBuilder = new StringBuilder("test");
    sBuilder.append(" String Builder");

    println(sBuilder);
    println(sBuilder.capacity());
    println(sBuilder.codePointAt(0));
    println(sBuilder.codePointAt(1));
    println(sBuilder.length());
    println(sBuilder.hashCode());

  }

  private static void println(StringBuilder sBuilder) {
    System.out.println("\n" + sBuilder);
  }

  private static void println(int number) {
    System.out.println("\n" + number);
  }
}
