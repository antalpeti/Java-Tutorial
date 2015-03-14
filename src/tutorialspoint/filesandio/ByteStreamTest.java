package tutorialspoint.filesandio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteStreamTest {

  public static void main(String args[]) throws IOException {

    ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);

    while (bOutput.size() != 10) {
      // Gets the inputs from the user
      bOutput.write(System.in.read());
    }

    byte b[] = bOutput.toByteArray();
    System.out.println("Print the content");
    for (int x = 0; x < b.length; x++) {
      // printing the characters
      System.out.print((char) b[x] + "   ");
    }
    System.out.println();
    int c;

    ByteArrayInputStream bInput = new ByteArrayInputStream(b);

    for (int y = 0; y < 4; y++) {
      if (y == 0) {
        System.out.println("Converting characters to Upper case ");
        while ((c = bInput.read()) != -1) {
          System.out.println(Character.toUpperCase((char) c));
        }
      } else if (y == 1) {
        System.out.println("Putting into an array ");
        byte[] a = new byte[bOutput.size()];
        while (bInput.available() != 0) {
          bInput.read(a, 5, 4);
        }
        for (byte e : a) {
          if (e == 0) {
            System.out.print(e + " ");
          } else {
            System.out.print((char) e + " ");
          }
        }
      } else if (y == 2) {
        System.out.println("Using skip");
        while (bInput.available() != 0) {
          System.out.println((char) bInput.read());
          System.out.println("Skipped byte(s): " + bInput.skip(1));
        }
      } else if (y == 3) {
        System.out.println("Using mark");
        System.out.println("markSupported: " + bInput.markSupported());
        bInput.mark(1);
        bInput.reset();
        while (bInput.available() != 0) {
          System.out.println((char) bInput.read());
        }
      }
      System.out.println();
      bInput.reset();
    }

  }
}
