package tutorialspoint.dateandtime;

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
  }
}
