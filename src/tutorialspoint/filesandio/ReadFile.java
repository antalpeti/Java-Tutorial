package tutorialspoint.filesandio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
  public static void main(String[] args) throws IOException {
    File file;
    InputStream fis = null;
    try {
      file = new File("./files/hello.txt");
      fis = new FileInputStream(file);
      int c;
      while ((c = fis.read()) != -1) {
        System.out.println("Available:" + fis.available());
        System.out.println("Actual byte: " + c + " Actual character: " + (char) c);
      }
      System.out.println("\nReset called");
    } finally {
      if (fis instanceof InputStream) {
        fis.close();
      }
    }
  }
}
