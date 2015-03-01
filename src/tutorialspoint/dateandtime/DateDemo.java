package tutorialspoint.dateandtime;

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
  }
}
