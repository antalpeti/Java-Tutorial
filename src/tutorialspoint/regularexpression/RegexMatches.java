package tutorialspoint.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

  private static void executeRegExMetacharacter() {
    String line = "This is the simple example";
    String pattern = "^(.)";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(line);
    while (m.find()) {
      System.out.println("Matches beginning of line: " + m.group(0));
    }
    m = Pattern.compile(".$").matcher(line);
    while (m.find()) {
      System.out.println("Matches end of line: " + m.group(0));
    }
    m = Pattern.compile(".").matcher(line);
    while (m.find()) {
      System.out.println("Matches any single character except newline:  " + m.group(0));
    }
    m = Pattern.compile("e[xm]a").matcher(line);
    while (m.find()) {
      System.out.println("Matches any single character in brackets: " + m.group(0));
    }
    m = Pattern.compile("[^h]is").matcher(line);
    while (m.find()) {
      System.out.println("Matches any single character not in brackets: " + m.group(0));
    }
    m = Pattern.compile("\\A..").matcher(line);
    while (m.find()) {
      System.out.println("Beginning of entire string: " + m.group(0));
    }
    m = Pattern.compile("..\\z").matcher(line);
    while (m.find()) {
      System.out.println("End of entire string: " + m.group(0));
    }
    m = Pattern.compile("..\\Z").matcher(line);
    while (m.find()) {
      System.out.println("End of entire string except allowable final line terminator: "
          + m.group(0));
    }
    line = "Hello nice little regex nice at all.";
    m = Pattern.compile("regt*").matcher(line);
    while (m.find()) {
      System.out.println("Matches 0 or more occurrences of preceding expression: " + m.group(0));
    }
    m = Pattern.compile("nic+").matcher(line);
    while (m.find()) {
      System.out.println("Matches 1 or more of the previous thing: " + m.group(0));
    }
    m = Pattern.compile("reget?").matcher(line);
    while (m.find()) {
      System.out.println("Matches 0 or 1 occurrence of preceding expression: " + m.group(0));
    }
    line = "RegReggRegggRegular.";
    m = Pattern.compile("Reg{2}").matcher(line);
    while (m.find()) {
      System.out.println("Matches exactly n number of occurrences of preceding expression: "
          + m.group(0));
    }
    m = Pattern.compile("Reg{2,}").matcher(line);
    while (m.find()) {
      System.out.println("Matches n or more occurrences of preceding expression: " + m.group(0));
    }
    m = Pattern.compile("Reg{1,2}").matcher(line);
    while (m.find()) {
      System.out.println("Matches at least n and at most m occurrences of preceding expression: "
          + m.group(0));
    }
    line = "ea eb ef eg";
    m = Pattern.compile("ea|eb").matcher(line);
    while (m.find()) {
      System.out.println("Matches either a or b: " + m.group(0));
    }
    line = "abaabbabbabddeeabd";
    m = Pattern.compile("(ab)*(bd)").matcher(line);
    while (m.find()) {
      System.out.println("Groups regular expressions and remembers matched text: " + m.group(0));
    }
    m = Pattern.compile("(?:abba)").matcher(line);
    while (m.find()) {
      System.out.println("Groups regular expressions without remembering matched text: "
          + m.group(0));
    }
    m = Pattern.compile("(?>abba)").matcher(line);
    while (m.find()) {
      System.out.println("Matches independent pattern without backtracking: " + m.group(0));
    }
    line = "abc 123.+-";
    m = Pattern.compile("\\w").matcher(line);
    while (m.find()) {
      System.out.println("Matches word characters: " + m.group(0));
    }
    m = Pattern.compile("\\W").matcher(line);
    while (m.find()) {
      System.out.println("Matches nonword characters: " + m.group(0));
    }
    line = "a bc def 1234\n\t\r";
    m = Pattern.compile("\\s").matcher(line);
    while (m.find()) {
      System.out.println("Matches whitespace. Equivalent to [\\t\\n\\r\\f]: " + m.group(0));
    }
    m = Pattern.compile("\\S").matcher(line);
    while (m.find()) {
      System.out.println("Matches nonwhitespace: " + m.group(0));
    }
    m = Pattern.compile("\\d").matcher(line);
    while (m.find()) {
      System.out.println("Matches digits. Equivalent to [0-9]: " + m.group(0));
    }
    m = Pattern.compile("\\D").matcher(line);
    while (m.find()) {
      System.out.println("Matches nondigits: " + m.group(0));
    }
  }

  public static void main(String args[]) {

    // String to be scanned to find the pattern.
    String line = "This order was placed for QT3000! OK?";
    String pattern = "(.*)(\\d+)(.*)";

    // Create a Pattern object
    Pattern r = Pattern.compile(pattern);

    // Now create matcher object.
    Matcher m = r.matcher(line);
    if (m.find()) {
      System.out.println("Found value: " + m.group(0));
      System.out.println("Found value: " + m.group(1));
      System.out.println("Found value: " + m.group(2));
      System.out.println("Found value: " + m.group(3));
      System.out.println(m.groupCount());
      System.out.println(m.pattern());
    } else {
      System.out.println("NO MATCH");
    }

    System.out.println("\nRegluar Expression Metacharacters");
    executeRegExMetacharacter();
  }
}
