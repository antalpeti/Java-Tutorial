package com.tutorialspoint.filesandio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {

  public static void main(String args[]) throws IOException {

    File file = new File("files/hello1.txt");
    // creates the file
    file.createNewFile();
    // creates a FileWriter Object
    FileWriter writer = new FileWriter(file);
    // Writes the content to the file
    writer.write("This\n is\n an\n example\n");
    writer.flush();
    writer.close();

    // Creates a FileReader Object
    FileReader fr = new FileReader(file);
    if (fr.ready()) {
      char[] a = new char[50];
      fr.read(a); // reads the content to the array
      for (char c : a) {
        System.out.print(c); // prints the characters one by one
      }
    }
    fr.close();
  }
}