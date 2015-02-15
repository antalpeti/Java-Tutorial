package tutorialspoint.modifiertypes;

/**
 * Example of private access control.
 */
public class Logger {
  private String format;

  public String getFormat() {
    return this.format;
  }

  public void setFormat(String format) {
    this.format = format;
  }
}
