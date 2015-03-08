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
