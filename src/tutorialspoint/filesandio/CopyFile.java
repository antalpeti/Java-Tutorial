package tutorialspoint.filesandio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
  public static void main(String args[]) throws IOException {
    useByteStreams();
    useCharacterStreams();
    copyLogo();
  }

  /**
   * Java byte streams are used to perform input and output of 8-bit bytes. Though there are many
   * classes related to byte streams but the most frequently used classes are ,
   * {@link FileInputStream} and {@link FileOutputStream}.
   *
   * @throws FileNotFoundException
   * @throws IOException
   */
  private static void useByteStreams() throws FileNotFoundException, IOException {
    FileInputStream in = null;
    FileOutputStream out = null;

    try {
      in = new FileInputStream("files/byte_input.txt");
      out = new FileOutputStream("files/byte_output.txt");

      int c;
      while ((c = in.read()) != -1) {
        out.write(c);
      }
    } finally {
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
  }

  /**
   * Java <b>Byte</b> streams are used to perform input and output of 8-bit bytes, where as Java
   * <b>Character</b> streams are used to perform input and output for 16-bit unicode. Though there
   * are many classes related to character streams but the most frequently used classes are ,
   * <b>FileReader </b> and <b>FileWriter.</b>. Though internally FileReader uses FileInputStream
   * and FileWriter uses FileOutputStream but here major difference is that FileReader reads two
   * bytes at a time and FileWriter writes two bytes at a time.
   *
   * @throws FileNotFoundException
   * @throws IOException
   */
  private static void useCharacterStreams() throws FileNotFoundException, IOException {
    FileReader in = null;
    FileWriter out = null;

    try {
      in = new FileReader("./files/character_input.txt");
      out = new FileWriter("./files\\character_output.txt");

      int c;
      while ((c = in.read()) != -1) {
        out.write(c);
      }
    } finally {
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
  }

  private static void copyLogo() throws FileNotFoundException, IOException {
    FileInputStream in = null;
    FileOutputStream out = null;

    try {
      in = new FileInputStream("files/javalogo_input.png");
      out = new FileOutputStream("files/javalogo_output.png");

      int c;
      while ((c = in.read()) != -1) {
        out.write(c);
      }
    } finally {
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
  }
}
