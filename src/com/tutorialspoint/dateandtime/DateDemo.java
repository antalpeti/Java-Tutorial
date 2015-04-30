package com.tutorialspoint.dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

  private void executeAfter(Date past, Date now) {
    System.out.println(past.after(now));
    System.out.println(past.after(past));
    System.out.println(now.after(past));
  }

  private void executeBefore(Date now, Date future) {
    System.out.println(now.before(future));
    System.out.println(now.before(now));
    System.out.println(future.before(now));
  }

  private void executeClone(Date now) {
    System.out.println("Original: " + now);
    Date clone = (Date) now.clone();
    System.out.println("Cloned: " + clone);
  }

  private void executeCompareTo(Date now, Date future) {
    System.out.println(now.compareTo(future));
    System.out.println(now.compareTo(now));
    System.out.println(future.compareTo(now));
    Object nowObj = now;
    System.out.println(now.compareTo((Date) nowObj));
  }

  private void executeEquals(Date past, Date future) {
    System.out.println(past.equals(past));
    System.out.println(past.equals(future));
    System.out.println(future.equals(future));
  }

  private void executeGetTime(Date now) {
    System.out.println(now.getTime());
  }

  private void executeSetTime(long time) {
    Date date = new Date();
    date.setTime(time);
    System.out.println(date);
  }

  private void executeSimpleDateFormat() {
    Date date = new Date();
    System.out.println(new SimpleDateFormat("'Era designator:' G ").format(date));
    System.out.println(new SimpleDateFormat("'Year in four digits:' y ").format(date));
    System.out.println(new SimpleDateFormat("'Month in year:' M ").format(date));
    System.out.println(new SimpleDateFormat("'Day in month:' d ").format(date));
    System.out.println(new SimpleDateFormat("'Hour in A.M./P.M. (1~12):' h ").format(date));
    System.out.println(new SimpleDateFormat("'Hour in day (0~23):' H ").format(date));
    System.out.println(new SimpleDateFormat("'Minute in hour:' m ").format(date));
    System.out.println(new SimpleDateFormat("'Second in minute:' s ").format(date));
    System.out.println(new SimpleDateFormat("'Millisecond:' S ").format(date));
    System.out.println(new SimpleDateFormat("'Day in week:' E ").format(date));
    System.out.println(new SimpleDateFormat("'Day in year:' D ").format(date));
    System.out.println(new SimpleDateFormat("'Day of week in month:' F ").format(date));
    System.out.println(new SimpleDateFormat("'Week in year:' w ").format(date));
    System.out.println(new SimpleDateFormat("'Week in month:' W ").format(date));
    System.out.println(new SimpleDateFormat("'A.M./P.M. marker:' a ").format(date));
    System.out.println(new SimpleDateFormat("'Hour in day (1~24):' k ").format(date));
    System.out.println(new SimpleDateFormat("'Hour in A.M./P.M. (0~11):' K ").format(date));
    System.out.println(new SimpleDateFormat("'Time zone:' z ").format(date));
  }

  private void executeDateAndTimeConversionCharacters() {
    Date date = new Date();
    System.out.printf("%1$s %2$tc", "Complete date and time:", date);
    System.out.printf("\n%1$s %2$tF", "ISO 8601 date:", date);
    System.out.printf("\n%1$s %2$tD", "U.S. formatted date (month/day/year):", date);
    System.out.printf("\n%1$s %2$tT", "24-hour time:", date);
    System.out.printf("\n%1$s %2$tr", "12-hour time:", date);
    System.out.printf("\n%1$s %2$tR", "24-hour time, no seconds:", date);
    System.out.printf("\n%1$s %2$tY", "Four-digit year (with leading zeroes):", date);
    System.out.printf("\n%1$s %2$ty", "Last two digits of the year (with leading zeroes):", date);
    System.out.printf("\n%1$s %2$tC", "First two digits of the year (with leading zeroes):", date);
    System.out.printf("\n%1$s %2$tB", "Full month name:", date);
    System.out.printf("\n%1$s %2$tb", "Abbreviated month name:", date);
    System.out.printf("\n%1$s %2$tm", "Two-digit month (with leading zeroes):", date);
    System.out.printf("\n%1$s %2$td", "Two-digit day (with leading zeroes):", date);
    System.out.printf("\n%1$s %2$te", "Two-digit day (without leading zeroes):", date);
    System.out.printf("\n%1$s %2$tA", "Full weekday name:", date);
    System.out.printf("\n%s %ta", "Abbreviated weekday name:", date);
    System.out.printf("\n%s %tj", "Three-digit day of year (with leading zeroes):", date);
    System.out.printf("\n%s %tH", "Two-digit hour (with leading zeroes), between 00 and 23:", date);
    System.out.printf("\n%s %tk", "Two-digit hour (without leading zeroes), between 0 and 23:",
        date);
    System.out.printf("\n%s %tl", "Two-digit hour (with leading zeroes), between 01 and 12:", date);
    System.out.printf("\n%s %tM", "Two-digit minutes (with leading zeroes):", date);
    System.out.printf("\n%s %tS", "Two-digit seconds (with leading zeroes):", date);
    System.out.printf("\n%s %tL", "Three-digit milliseconds (with leading zeroes):", date);
    System.out.printf("\n%s %tN", "Nine-digit nanoseconds (with leading zeroes):", date);
    // System.out.printf("\n%s %tP", "Uppercase morning or afternoon marker:", date);
    System.out.printf("\n%s %tp", "Lowercase morning or afternoon marker:", date);
    System.out.printf("\n%s %tz", "RFC 822 numeric offset from GMT:", date);
    System.out.printf("\n%s %tZ", "Time zone:", date);
    System.out.printf("\n%s %ts", "Seconds since 1970-01-01 00:00:00 GMT:", date);
    System.out.printf("\n%s %tQ", "Milliseconds since 1970-01-01 00:00:00 GMT", date);
  }

  private void executeParseStringIntoDate(String args[]) {
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

    String input = args.length == 0 ? "1818-11-11" : args[0];

    System.out.print(input + " Parses as ");

    Date t;

    try {
      t = ft.parse(input);
      System.out.println(t);
    } catch (ParseException e) {
      System.out.println("Unparseable using " + ft);
    }
  }

  public static void main(String args[]) {
    // Instantiate a Date object
    Date now = new Date();

    // display time and date using toString()
    System.out.println(now.toString());

    Date past = new Date(987654321123L);
    System.out.println(past);

    Date future = new Date(1876543211234L);
    System.out.println(future);

    DateDemo dd = new DateDemo();

    System.out.println("\nafter(Date date)");
    dd.executeAfter(past, now);

    System.out.println("\nbefore(Date date)");
    dd.executeBefore(now, future);

    System.out.println("\nclone()");
    dd.executeClone(now);

    System.out.println("\ncompareTo(Date date)");
    dd.executeCompareTo(now, future);

    System.out.println("\nequals(Object date)");
    dd.executeEquals(past, future);

    System.out.println("\ngetTime()");
    dd.executeGetTime(now);

    System.out.println("\nhashCode()");
    System.out.println(now.hashCode());

    System.out.println("\nsetTime()");
    dd.executeSetTime(1276543211111L);

    System.out.println("\ntoString()");
    System.out.println(now.toString());

    Date dNow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

    System.out.println("\nCurrent Date: " + ft.format(dNow));

    System.out.println("\nSimpleDateFormat codes:");
    dd.executeSimpleDateFormat();

    // Instantiate a Date object
    Date date = new Date();

    // display time and date using toString()
    String str = String.format("Current Date/Time : %tc", date);

    System.out.printf("\n" + str);

    // display time and date using toString()
    System.out.printf("\n%1$s %2$tB %2$td, %2$tY", "Due date:", date);
    // display formatted date with < flag that indicates the previously used argument
    System.out.printf("\n%s %tB %<te, %<tY", "Due date:", date);

    System.out.println();
    System.out.println("\nDate and Time Conversion Characters:");
    dd.executeDateAndTimeConversionCharacters();

    System.out.println("\nParsing String into Date:");
    dd.executeParseStringIntoDate(new String[] {});
    dd.executeParseStringIntoDate(new String[] {"2015-01-03"});
    dd.executeParseStringIntoDate(new String[] {"2015-1-3"});
    dd.executeParseStringIntoDate(new String[] {"2015/01/03"});
  }
}
