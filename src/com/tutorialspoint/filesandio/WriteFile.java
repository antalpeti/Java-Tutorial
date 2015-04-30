package com.tutorialspoint.filesandio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteFile {
  public static void main(String[] args) throws IOException {
    File file = new File("./files/numbers");
    OutputStream fos = null;
    try {
      fos = new FileOutputStream(file);
      System.out.println("File write started...");
      for (int i = 0; i < 20; i++) {
        for (int j = 0; j < i; j++) {
          fos.write(j);
        }
        fos.write('\n');
      }
      System.out.println("File write finished...");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      if (fos instanceof OutputStream) {
        fos.close();
      }
    }

    InputStream fis = null;
    try {
      fis = new FileInputStream(file);
      int c;
      while (fis.available() != 0) {
        c = fis.read();
        if ((char) c == '\n') {
          System.out.println();
        } else {
          System.out.print(c + " ");
        }
      }
    } catch (FileNotFoundException fnfe) {
      System.out.println("fillInStackTrace: " + fnfe.fillInStackTrace());
      System.out.println("getCause: " + fnfe.getCause());
      System.out.println("getLocalizedMessage: " + fnfe.getLocalizedMessage());
      System.out.println("getMessage: " + fnfe.getMessage());
      System.out.println("getSuppressed: " + fnfe.getSuppressed());
    } finally {
    }
  }
}
