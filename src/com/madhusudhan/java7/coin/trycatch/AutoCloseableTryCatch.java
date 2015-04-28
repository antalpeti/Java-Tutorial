package com.madhusudhan.java7.coin.trycatch;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AutoCloseableTryCatch {

  private static final String JAVA_7_BLOCK_BUSTER = "Java 7 Block Buster";

  private static final String FILENAME = "files/movies.txt";

  private static final String WRITTEN = "The " + AutoCloseableTryCatch.FILENAME + " written.";

  FileOutputStream fos = null;

  DataOutputStream dos = null;

  public void oldTry() {
    try {
      fos = new FileOutputStream(AutoCloseableTryCatch.FILENAME);
      dos = new DataOutputStream(fos);
      dos.writeUTF(AutoCloseableTryCatch.JAVA_7_BLOCK_BUSTER);
      System.out.println(AutoCloseableTryCatch.WRITTEN);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fos.close();
        dos.close();
      } catch (IOException e) {
        // log the exception
      }
    }
  }

  public void newTry() {

    try (FileOutputStream fos = new FileOutputStream(AutoCloseableTryCatch.FILENAME);
        DataOutputStream dos = new DataOutputStream(fos)) {
      dos.writeUTF(AutoCloseableTryCatch.JAVA_7_BLOCK_BUSTER);
      System.out.println(AutoCloseableTryCatch.WRITTEN);
    } catch (IOException e) {
      // log the exception
    }
  }

  public static void main(String[] args) {
    AutoCloseableTryCatch actc = new AutoCloseableTryCatch();
    actc.oldTry();
    actc.newTry();
  }
}
