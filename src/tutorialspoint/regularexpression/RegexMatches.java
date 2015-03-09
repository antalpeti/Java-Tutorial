package tutorialspoint.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

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
    line = "12=123 1234";
    m = Pattern.compile("\\G(12)").matcher(line);
    while (m.find()) {
      System.out.println("Matches point where last match finished: " + m.group(0));
    }
    m = Pattern.compile("(12|123)=\\1").matcher(line);
    while (m.find()) {
      System.out.println("Back-reference to capture group number \"n\": " + m.group(0));
    }
    line = "aside (side) bside side [side] {side}";
    m = Pattern.compile("\\bside\\b").matcher(line);
    while (m.find()) {
      System.out.println("Matches word boundaries when outside brackets: " + m.group(0));
    }
    m = Pattern.compile("\\Bside\\b").matcher(line);
    while (m.find()) {
      System.out.println("Matches nonword boundaries: " + m.group(0));
    }
    line = "\t\n";
    m = Pattern.compile("\n").matcher(line);
    while (m.find()) {
      System.out.println("Matches newlines, carriage returns, tabs, etc: " + m.group(0));
    }
    line = "abcd'escapede'fg\"escaped\"";
    m = Pattern.compile("\\Qescape\\E").matcher(line);
    while (m.find()) {
      System.out.println("Escape (quote) all characters from \\Q up to \\E: " + m.group(0));
    }
  }

  private static void executeIndexMethods() {
    String line = "ab abc abcd abcde";
    Matcher m = Pattern.compile("ab").matcher(line);
    while (m.find()) {
      System.out.println(" " + m.group(0));
      System.out.println("Start index: " + m.start());
      System.out.println("End index: " + m.end());
    }
    m = Pattern.compile("(a+)(b?)(c*)").matcher(line);
    while (m.find()) {
      for (int i = 0; i < m.groupCount(); i++) {
        System.out.println(" " + m.group(i));
        System.out.println("Start group index: " + m.start(i));
        System.out.println("End group index: " + m.end(i));
      }
    }
  }

  private static void executeStudyMethods() {
    String line = "ab abc";
    Matcher m = Pattern.compile("ab").matcher(line);
    while (m.find()) {
      System.out.println("find: " + m.group());
    }
    if (m.find(0)) {
      System.out.println("find(0): " + m.group());
    }
    line = "abc";
    m = Pattern.compile("abc").matcher(line);
    if (m.matches()) {
      System.out.println("matches(): " + m.group());
    }
    line = "abcdef";
    m = Pattern.compile("ab").matcher(line);
    if (m.lookingAt()) {
      System.out.println("lookingAt(): " + m.group());
    }
  }

  private static void executeReplacementMethods() {
    StringBuffer sb = new StringBuffer("some old thing ");
    Pattern p = Pattern.compile("old");
    Matcher m = p.matcher(sb);
    while (m.find()) {
      m.appendReplacement(sb, "new");
      System.out.println(sb);
      m.appendTail(sb);
      System.out.println(sb);
      System.out.println(m.replaceAll("cube"));
    }
    m = Pattern.compile("thing").matcher(sb);
    System.out.println(m.replaceFirst("magic"));
  }

  private static void executeStartEnd() {
    String regex = "\\bcat\\b";
    String input = "cat cat cat cattie cat";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(input); // get a matcher object
    int count = 0;

    while (m.find()) {
      count++;
      System.out.println("Match number " + count);
      System.out.println("start(): " + m.start());
      System.out.println("end(): " + m.end());
    }
  }

  private static void executeLookingAtAndMatches() {
    String REGEX = "foo";
    String INPUT = "fooooooooooooooooo";
    Pattern pattern = Pattern.compile(REGEX);
    Matcher matcher = pattern.matcher(INPUT);

    System.out.println("Current REGEX is: " + REGEX);
    System.out.println("Current INPUT is: " + INPUT);

    System.out.println("lookingAt(): " + matcher.lookingAt());
    System.out.println("matches(): " + matcher.matches());
  }

  private static void executeReplaceFirstAndReplaceAll() {
    String regex = "dog";
    String input = "The dog says meow. " + "All dogs say meow.";
    String replace = "cat";

    Pattern p = Pattern.compile(regex);
    // get a matcher object
    Matcher m = p.matcher(input);
    System.out.println(m.replaceFirst(replace));
    input = m.replaceAll(replace);
    System.out.println(input);
  }

  private static void executeAppendReplacementAndAppendTail() {
    String regex = "a*b";
    String input = "aabfooaabfooabfoob";
    String replace = "-";
    Pattern p = Pattern.compile(regex);
    // get a matcher object
    Matcher m = p.matcher(input);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
      m.appendReplacement(sb, replace);
    }
    System.out.println(sb);
    m.appendTail(sb);
    System.out.println(sb.toString());
  }

  private static void executePatternSyntaxException() {
    String pattern = "(.*";
    try {
      Pattern.compile(pattern);
    } catch (PatternSyntaxException pse) {
      System.out.println("getDescription: " + pse.getDescription());
      System.out.println("getIndex: " + pse.getIndex());
      System.out.println("getPattern: " + pse.getPattern());
      System.out.println("getMessage: " + pse.getMessage());
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
    System.out.println("\nIndex methods of the Matcher class");
    executeIndexMethods();
    System.out.println("\nStudy methods of the Matcher class");
    executeStudyMethods();
    System.out.println("\nReplacement methods of the Matcher class");
    executeReplacementMethods();
    System.out.println("\nstart() and end():");
    executeStartEnd();
    System.out.println("\nlookingAt() and matches():");
    executeLookingAtAndMatches();
    System.out.println("\nreplaceFirst() and replaceAll():");
    executeReplaceFirstAndReplaceAll();
    System.out.println("\nappendReplacement() and appendTail():");
    executeAppendReplacementAndAppendTail();
    System.out.println("\nPatternSyntaxException");
    executePatternSyntaxException();
  }
}
