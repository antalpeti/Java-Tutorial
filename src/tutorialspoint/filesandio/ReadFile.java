package tutorialspoint.filesandio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
  public static void main(String[] args) throws IOException {
    File file;
    InputStream f = null;
    try {
      file = new File("./files/hello.txt");
      f = new FileInputStream(file);
      int c;
      while ((c = f.read()) != -1) {
        System.out.println("Available:" + f.available());
        System.out.println("Actual byte: " + c + " Actual character: " + (char) c);
      }
      System.out.println("\nReset called");
    } finally {
      if (f instanceof InputStream) {
        f.close();
      }
    }
  }
}
