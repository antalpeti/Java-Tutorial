package tutorialspoint.characters;

public class Test {
  public static void main(String[] args) {

    // Unicode for uppercase Greek omega character
    char uniChar = '\u039A';
    System.out.println(uniChar);

    // an array of chars
    char[] charArray = {'a', 'b', 'c', 'd', 'e'};
    for (char c : charArray) {
      System.out.print(c);
    }

    // Here following primitive char 'a'
    // is boxed into the Character object ch
    Character ch = 'a';
    System.out.println();
    System.out.println(ch);

    // Here primitive 'x' is boxed for method test,
    // return is unboxed to char 'c'
    char c = unbox('x');
    System.out.println(c);

    char[] escapeArray = {'\t', '\b', '\n', '\r', '\f', '\'', '\"', '\\'};
    for (char d : escapeArray) {
      System.out.print(d);
    }

    System.out.println("\nShe said \"Hello!\" to me.");
  }

  private static Character unbox(char ch) {
    return new Character(ch);
  }
}
