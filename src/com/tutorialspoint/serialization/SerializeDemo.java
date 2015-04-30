package com.tutorialspoint.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
  public static void main(String[] args) {
    Employee e = new Employee();
    e.name = "Reyan Ali";
    e.address = "Phokka Kuan, Ambehta Peer";
    e.SSN = 11122333;
    e.number = 101;
    try {
      String file = "files/employee.ser";
      FileOutputStream fileOut = new FileOutputStream(file);
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(e);
      out.close();
      fileOut.close();
      System.out.printf("Serialized data is saved in " + file);
    } catch (IOException i) {
      i.printStackTrace();
    }
  }
}
