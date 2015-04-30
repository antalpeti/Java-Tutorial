package com.tutorialspoint.filesandio;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {
  public static void main(String[] args) {

    File f = null;
    String[] strs = {"files/file1.txt"/* , "files/file2.txt*" */};
    try {
      // for each string in string array
      for (String s : strs) {
        // create new file
        f = new File(s);
        f.createNewFile();

        usePathMethods(f);
        showSeparators();
        useSpaceMethods(f);

        System.out.println("getClass: " + f.getClass());

        useCheckMethods(f);
        useDeleteExistsMethods(f);

        File p = f.getParentFile();
        useListMethods(p);

        f.createNewFile();
        useSetMethods(f);

        System.out.println("length: " + f.length());

        System.out.println("findRoot(File): " + findRoot(f).getAbsolutePath());
        System.out.println("findRoot(String): " + findRoot(f.getAbsoluteFile().toString()));

        File temp = useCreationMethods(f);

        System.out.println("toString: " + f.toString());

        temp.deleteOnExit();
        f.deleteOnExit();

        new File("files/file1renamed.txt").deleteOnExit();
        // true if the file is executable
        boolean bool = f.canExecute();

        // find the absolute path
        String a = f.getAbsolutePath();

        // prints absolute path
        System.out.print(a);

        // prints
        System.out.println(" is executable: " + bool);
      }
    } catch (Exception e) {
      // if any I/O error occurs
      e.printStackTrace();
    }
  }

  /**
   * Collection of Exists and Delete methods.
   *
   * @param f
   */
  private static void useDeleteExistsMethods(File f) {
    System.out.println("exists: " + f.exists());
    System.out.println("delete: " + f.delete());
    System.out.println("exists: " + f.exists());
  }

  /**
   * Collection of set methods.
   *
   * @param f
   */
  private static void useSetMethods(File f) {
    System.out.println("lastModified: " + f.lastModified());
    System.out.println("setLastModified: " + f.setLastModified(100000000L));
    System.out.println("lastModified: " + f.lastModified());
    System.out.println("setReadable: " + f.setReadable(true));
    System.out.println("setReadable: " + f.setReadable(false));
    System.out.println("setWritable: " + f.setWritable(false));
    System.out.println("setReadOnly: " + f.setReadOnly());
    System.out.println("setReadOnly: " + f.setExecutable(false));
    System.out.println("setReadOnly: " + f.setExecutable(true));

  }

  /**
   * Collection of creation and rename methods.
   *
   * @param f
   * @return
   * @throws IOException
   */
  private static File useCreationMethods(File f) throws IOException {
    System.out.println("mkdir: " + f.mkdir());
    System.out.println("mkdirs: " + f.mkdirs());
    System.out.println("renameTo: " + f.renameTo(new File("files/file1renamed.txt")));
    System.out.println("createTempFile(String, String): " + File.createTempFile("pre", "suf"));
    File temp = File.createTempFile("pre", "suf", new File("files/"));
    System.out.println("createTempFile(String, String, File): " + temp);
    return temp;
  }

  /**
   * Collection of path requesting methods.
   *
   * @param f
   * @throws IOException
   */
  private static void usePathMethods(File f) throws IOException {
    System.out.println("getName: " + f.getName());
    System.out.println("getParent: " + f.getParent());
    System.out.println("getParentFile: " + f.getParentFile());
    System.out.println("getAbsoluteFile: " + f.getAbsoluteFile());
    System.out.println("getAbsolutePath: " + f.getAbsolutePath());
    System.out.println("getPath: " + f.getPath());
    System.out.println("getCanonicalPath: " + f.getCanonicalPath());
    System.out.println("getCanonicalFile: " + f.getCanonicalFile());
    System.out.println("toURI: " + f.toURI());
  }

  /**
   * Collection of space query methods.
   *
   * @param f
   */
  private static void useSpaceMethods(File f) {
    System.out.println("getFreeSpace: " + f.getFreeSpace());
    System.out.println("getFreeSpace: " + new File(f.getAbsolutePath()).getFreeSpace());
    System.out.println("getFreeSpace: " + findRoot(f).getFreeSpace());
    System.out.println("getTotalSpace: " + f.getTotalSpace());
    System.out.println("getTotalSpace: " + new File(f.getAbsolutePath()).getTotalSpace());
    System.out.println("getTotalSpace: " + findRoot(f).getTotalSpace());
    System.out.println("getUsableSpace: " + findRoot(f).getUsableSpace());
  }

  /**
   * Collection of separators.
   */
  private static void showSeparators() {
    System.out.println("File.pathSeparator: " + File.pathSeparator);
    System.out.println("File.pathSeparatorChar: " + File.pathSeparatorChar);
    System.out.println("File.: " + File.separator);
    System.out.println("File.separatorChar: " + File.separatorChar);
  }

  /**
   * Collection of listing methods.
   *
   * @param dir
   * @return
   */
  private static void useListMethods(File dir) {
    System.out.println("listRoots: " + Arrays.toString(File.listRoots()));
    System.out.println("list: " + Arrays.toString(dir.list()));
    System.out.println("listFiles: " + Arrays.toString(dir.listFiles()));
    FileFilter ff = new FileFilter() {

      @Override
      public boolean accept(File pathname) {
        if (!pathname.getName().endsWith("txt")) {
          return true;
        }
        return false;
      }
    };
    System.out.println("listFiles(FileFilter): " + Arrays.toString(dir.listFiles(ff)));

    FilenameFilter fnf = new FilenameFilter() {

      @Override
      public boolean accept(File dir, String name) {
        if (!name.endsWith("png")) {
          return true;
        }
        return false;
      }
    };
    System.out.println("listFiles(FilenameFilter): " + Arrays.toString(dir.listFiles(fnf)));
  }

  /**
   * Collection of checking methods.
   *
   * @param file
   */
  private static void useCheckMethods(File file) {
    System.out.println("isAbsolute: " + file.isAbsolute());
    System.out.println("isDirectory: " + file.isDirectory());
    System.out.println("isFile: " + file.isFile());
    System.out.println("isHidden: " + file.isHidden());
    System.out.println("canExecute: " + file.canExecute());
    System.out.println("canRead: " + file.canRead());
    System.out.println("canWrite: " + file.canWrite());
  }

  private static File findRoot(File f) {
    f = new File(f.getAbsolutePath());
    if (f.getParent() != null) {
      f = findRoot(new File(f.getParent()));
    }
    return f;
  }

  private static String findRoot(String path) {
    String[] pathArray = path.split("\\" + File.separator);
    return pathArray[0];
  }
}
