package tutorialspoint.dateandtime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class GregorianCalendarDemo {

  private static GregorianCalendar gcal;

  private static void executeConstructors() {
    GregorianCalendar gcal = new GregorianCalendar();
    System.out.println(gcal.getTime());
    gcal = new GregorianCalendar(2010, 1, 2);
    System.out.println(gcal.getTime());
    gcal = new GregorianCalendar(2011, 2, 3, 4, 5);
    System.out.println(gcal.getTime());
    gcal = new GregorianCalendar(2012, 3, 4, 5, 6, 7);
    System.out.println(gcal.getTime());
    gcal = new GregorianCalendar(Locale.US);
    System.out.println(gcal.getTime());
    gcal = new GregorianCalendar(TimeZone.getTimeZone("PDT"));
    System.out.println(gcal.getTime());
  }

  private static void executeAdd() {
    gcal = new GregorianCalendar();
    System.out.println(gcal.getTime());
    gcal.add(GregorianCalendar.DAY_OF_MONTH, 1);
    System.out.println(gcal.getTime());
    gcal.add(GregorianCalendar.HOUR, 25);
    System.out.println(gcal.getTime());
    gcal.add(GregorianCalendar.MINUTE, -5);
    System.out.println(gcal.getTime());
  }

  private static void executeEquals() {
    gcal = new GregorianCalendar();
    GregorianCalendar gcalOther = new GregorianCalendar();
    gcalOther.add(GregorianCalendar.HOUR, 1);
    GregorianCalendar gcalRef = gcal;
    GregorianCalendar gcalClone = (GregorianCalendar) gcal.clone();
    System.out.println(gcal.equals(gcalOther));
    System.out.println(gcal.equals(gcalRef));
    System.out.println(gcal.equals(gcalClone));
  }

  private static void executeGet() {
    gcal = new GregorianCalendar();
    System.out.println("AD: " + gcal.get(GregorianCalendar.AD));
    System.out.println("BC: " + gcal.get(GregorianCalendar.BC));
    System.out.println("AM: " + gcal.get(GregorianCalendar.AM));
    System.out.println("AM_PM: " + gcal.get(GregorianCalendar.AM_PM));
    System.out.println("D: " + gcal.get(GregorianCalendar.DATE));
    System.out.println("DAY_OF_MONTH: " + gcal.get(GregorianCalendar.DAY_OF_MONTH));
    System.out.println("DAY_OF_WEEK: " + gcal.get(GregorianCalendar.DAY_OF_WEEK));
    System.out.println("DAY_OF_YEAR: " + gcal.get(GregorianCalendar.DAY_OF_YEAR));
    System.out.println("DST_OFFSET: " + gcal.get(GregorianCalendar.DST_OFFSET));
    System.out.println("ERA: " + gcal.get(GregorianCalendar.ERA));
    System.out.println("HOUR: " + gcal.get(GregorianCalendar.HOUR));
    System.out.println("HOUR_OF_DAY: " + gcal.get(GregorianCalendar.HOUR_OF_DAY));
    System.out.println("LONG: " + gcal.get(GregorianCalendar.LONG));
    System.out.println("MILLISECOND: " + gcal.get(GregorianCalendar.MILLISECOND));
    System.out.println("MINUTE: " + gcal.get(GregorianCalendar.MINUTE));
    System.out.println("MONTH: " + gcal.get(GregorianCalendar.MONTH));
    System.out.println("PM: " + gcal.get(GregorianCalendar.PM));
    System.out.println("WEEK_OF_MONTH: " + gcal.get(GregorianCalendar.WEEK_OF_MONTH));
    System.out.println("WEEK_OF_YEAR: " + gcal.get(GregorianCalendar.WEEK_OF_YEAR));
    System.out.println("ZONE_OFFSET: " + gcal.get(GregorianCalendar.ZONE_OFFSET));
  }

  private static void executeGetAcutalMaximum() {
    gcal = new GregorianCalendar();
    System.out.println("YEAR: " + gcal.getActualMaximum(GregorianCalendar.YEAR));
    System.out.println("MONTH: " + gcal.getActualMaximum(GregorianCalendar.MONTH));
    System.out.println("DAY_OF_MONTH: " + gcal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));
    System.out.println("HOUR: " + gcal.getActualMaximum(GregorianCalendar.HOUR));
    System.out.println("MINUTE: " + gcal.getActualMaximum(GregorianCalendar.MINUTE));
    System.out.println("SECOND: " + gcal.getActualMaximum(GregorianCalendar.SECOND));
    System.out.println("MILLISECOND: " + gcal.getActualMaximum(GregorianCalendar.MILLISECOND));
  }

  private static void executeGetAcutalMinimum() {
    gcal = new GregorianCalendar();
    System.out.println("YEAR: " + gcal.getActualMinimum(GregorianCalendar.YEAR));
    System.out.println("MONTH: " + gcal.getActualMinimum(GregorianCalendar.MONTH));
    System.out.println("DAY_OF_MONTH: " + gcal.getActualMinimum(GregorianCalendar.DAY_OF_MONTH));
    System.out.println("HOUR: " + gcal.getActualMinimum(GregorianCalendar.HOUR));
    System.out.println("MINUTE: " + gcal.getActualMinimum(GregorianCalendar.MINUTE));
    System.out.println("SECOND: " + gcal.getActualMinimum(GregorianCalendar.SECOND));
    System.out.println("MILLISECOND: " + gcal.getActualMinimum(GregorianCalendar.MILLISECOND));
  }

  private static void executeGetGreatestMinimum() {
    gcal = new GregorianCalendar();
    System.out.println("YEAR: " + gcal.getGreatestMinimum(GregorianCalendar.YEAR));
    System.out.println("MONTH: " + gcal.getGreatestMinimum(GregorianCalendar.MONTH));
    System.out.println("DAY_OF_MONTH: " + gcal.getGreatestMinimum(GregorianCalendar.DAY_OF_MONTH));
    System.out.println("HOUR: " + gcal.getGreatestMinimum(GregorianCalendar.HOUR));
    System.out.println("MINUTE: " + gcal.getGreatestMinimum(GregorianCalendar.MINUTE));
    System.out.println("SECOND: " + gcal.getGreatestMinimum(GregorianCalendar.SECOND));
    System.out.println("MILLISECOND: " + gcal.getGreatestMinimum(GregorianCalendar.MILLISECOND));
  }

  private static void executeGetLeastMaximum() {
    gcal = new GregorianCalendar();
    System.out.println("YEAR: " + gcal.getLeastMaximum(GregorianCalendar.YEAR));
    System.out.println("MONTH: " + gcal.getLeastMaximum(GregorianCalendar.MONTH));
    System.out.println("DAY_OF_MONTH: " + gcal.getLeastMaximum(GregorianCalendar.DAY_OF_MONTH));
    System.out.println("HOUR: " + gcal.getLeastMaximum(GregorianCalendar.HOUR));
    System.out.println("MINUTE: " + gcal.getLeastMaximum(GregorianCalendar.MINUTE));
    System.out.println("SECOND: " + gcal.getLeastMaximum(GregorianCalendar.SECOND));
    System.out.println("MILLISECOND: " + gcal.getLeastMaximum(GregorianCalendar.MILLISECOND));
  }

  private static void executeGetMaximum() {
    gcal = new GregorianCalendar();
    System.out.println("YEAR: " + gcal.getMaximum(GregorianCalendar.YEAR));
    System.out.println("MONTH: " + gcal.getMaximum(GregorianCalendar.MONTH));
    System.out.println("DAY_OF_MONTH: " + gcal.getMaximum(GregorianCalendar.DAY_OF_MONTH));
    System.out.println("HOUR: " + gcal.getMaximum(GregorianCalendar.HOUR));
    System.out.println("MINUTE: " + gcal.getMaximum(GregorianCalendar.MINUTE));
    System.out.println("SECOND: " + gcal.getMaximum(GregorianCalendar.SECOND));
    System.out.println("MILLISECOND: " + gcal.getMaximum(GregorianCalendar.MILLISECOND));
  }

  public static void main(String args[]) {
    String months[] =
      {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    int year;
    // Create a Gregorian calendar initialized
    // with the current date and time in the
    // default locale and timezone.
    GregorianCalendar gcalendar = new GregorianCalendar();
    // Display current time and date information.
    System.out.print("Date: ");
    System.out.print(months[gcalendar.get(Calendar.MONTH)]);
    System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
    System.out.println(year = gcalendar.get(Calendar.YEAR));
    System.out.print("Time: ");
    System.out.print(gcalendar.get(Calendar.HOUR) + ":");
    System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
    System.out.println(gcalendar.get(Calendar.SECOND));

    // Test if the current year is a leap year
    if (gcalendar.isLeapYear(year)) {
      System.out.println("The current year is a leap year");
    } else {
      System.out.println("The current year is not a leap year");
    }

    System.out.println("\nGregorianCalendar constructors:");
    executeConstructors();

    System.out.println("\nadd(int field, int amount)");
    executeAdd();

    System.out.println("\nequals(Object obj)");
    executeEquals();

    System.out.println("\nget(int field)");
    executeGet();

    System.out.println("\ngetActualMaximum(int field)");
    executeGetAcutalMaximum();

    System.out.println("\ngetActualMinimum(int field)");
    executeGetAcutalMinimum();

    System.out.println("\ngetGreatestMinimum(int field)");
    executeGetGreatestMinimum();;

    System.out.println("\ngetGregorianChange()");
    gcal.getGregorianChange();

    System.out.println("\ngetLeastMaximum(int field)");
    executeGetLeastMaximum();

    System.out.println("\ngetMaximum(int field)");
    executeGetMaximum();

    System.out.println("\ngetTime()");
    System.out.println(gcal.getTime());

    System.out.println("\ngetTimeInMillis()");
    System.out.println(gcal.getTimeInMillis());

    System.out.println("\ngetTimeZone()");
    System.out.println(gcal.getTimeZone());
  }
}
