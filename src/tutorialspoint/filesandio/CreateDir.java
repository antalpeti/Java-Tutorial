package tutorialspoint.filesandio;

import java.io.File;


public class CreateDir {
  private static final String DIRECTORY_CREATED = " directory created.";
  private static final String DIRECTORY_NOT_CREATED = " directory not created.";

  public static void main(String args[]) {
    String dirname = "./files/java/sampledir";
    File d = new File(dirname);
    // Create directory now.
    if (d.mkdirs()) {
      System.out.println(dirname + DIRECTORY_CREATED);
    } else {
      System.out.println(dirname + DIRECTORY_NOT_CREATED);
    }
    String subdir = dirname + "/subdir";
    d = new File(subdir);
    if (d.mkdir()) {
      System.out.println(subdir + DIRECTORY_CREATED);
    } else {
      System.out.println(subdir + DIRECTORY_NOT_CREATED);
    }
  }
}
