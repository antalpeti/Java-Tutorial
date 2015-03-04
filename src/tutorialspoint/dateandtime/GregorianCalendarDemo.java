package tutorialspoint.dateandtime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class GregorianCalendarDemo {

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
  }
}
