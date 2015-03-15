package tutorialspoint.filesandio;

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
  }
}
