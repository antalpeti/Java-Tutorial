package com.tutorialspoint.filesandio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
  @SuppressWarnings("deprecation")
  public static void main(String args[]) throws IOException {

    DataInputStream d = new DataInputStream(new FileInputStream("files/DataInTest.txt"));

    DataOutputStream out = new DataOutputStream(new FileOutputStream("files/DataOutTest.txt"));

    String count;
    while ((count = d.readLine()) != null) {
      String u = count.toUpperCase();
      System.out.println(u);
      out.writeBytes(u + "  ,");
    }
    d.close();
    out.close();
    readAndWriteMethods();
  }

  private static void readAndWriteMethods() throws IOException {
    DataInputStream dis = new DataInputStream(System.in);
    DataOutputStream dos = new DataOutputStream(new FileOutputStream("./files/Handwrites.txt"));
    System.out.println("Start typing!");
    byte[] b = new byte[10];
    dis.read(b, 4, 6);
    forEachMethod(b);
    System.out.println("Skipped bytes: " + dis.skip(10));
    System.out.println("\nLet's try it again! Shall we? And store it an array.");
    dos.write(dis.read(b));
    forEachMethod(b);
    System.out.println("Type 0 or 1!");
    boolean typedBoolean = dis.readBoolean();
    dos.writeBoolean(typedBoolean);
    dos.flush();
    System.out.println("Skipped bytes: " + dis.skip(10));
    System.out.println("You typed: " + typedBoolean);
    System.out.println("Type a byte number please!");
    byte typedByte = dis.readByte();
    dos.writeByte(typedByte);
    System.out.println("You typed: " + typedByte);
    System.out.println("Skipped bytes: " + dis.skipBytes(10));
    System.out.println("Type a short number please!");
    short typedShort = dis.readShort();
    dos.writeShort(typedShort);
    System.out.println("You typed: " + typedShort);
    System.out.println("Skipped bytes: " + dis.skipBytes(10));
    System.out.println("Type a int number please!");
    int typedInt = dis.readInt();
    dos.writeInt(typedInt);
    System.out.println("You typed: " + typedInt);
    System.out.println("Skipped bytes: " + dis.skipBytes(10));
    dis.close();
    dos.close();
  }

  /**
   * @param b
   */
  private static void forEachMethod(byte[] b) {
    for (byte c : b) {
      System.out.println((char) c);
    }
  }
}
