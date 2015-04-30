package com.tutorialspoint.filesandio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteStreamTest {

  public static void main(String args[]) throws IOException {

    ByteArrayOutputStream baos = new ByteArrayOutputStream(12);

    while (baos.size() != 10) {
      // Gets the inputs from the user
      baos.write(System.in.read());
    }

    byte b[] = baos.toByteArray();
    System.out.println("Print the content");
    for (int x = 0; x < b.length; x++) {
      // printing the characters
      System.out.print((char) b[x] + "   ");
    }
    System.out.println();
    int c;

    ByteArrayInputStream bais = new ByteArrayInputStream(b);

    for (int y = 0; y < 4; y++) {
      if (y == 0) {
        System.out.println("Converting characters to Upper case ");
        while ((c = bais.read()) != -1) {
          System.out.println(Character.toUpperCase((char) c));
        }
      } else if (y == 1) {
        System.out.println("Putting into an array ");
        byte[] a = new byte[baos.size()];
        while (bais.available() != 0) {
          bais.read(a, 5, 4);
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
        while (bais.available() != 0) {
          System.out.println((char) bais.read());
          baos.toString();
          System.out.println("Skipped byte(s): " + bais.skip(1));
        }
      } else if (y == 3) {
        System.out.println("Using mark");
        System.out.println("markSupported: " + bais.markSupported());
        bais.mark(1);
        bais.reset();
        while (bais.available() != 0) {
          System.out.println((char) bais.read());
        }
        baos.writeTo(System.out);
      }
      System.out.println();
      bais.reset();
    }

  }
}
