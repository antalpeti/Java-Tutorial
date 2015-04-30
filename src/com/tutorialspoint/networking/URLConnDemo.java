package com.tutorialspoint.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class URLConnDemo {
  public static void main(String[] args) {
    try {
      // URL url = new URL("http://www.amrood.com");
      URL url = new URL("http://www.javacodegeeks.com");
      URLConnection urlConnection = url.openConnection();
      HttpURLConnection connection = null;
      if (urlConnection instanceof HttpURLConnection) {
        connection = (HttpURLConnection) urlConnection;
      } else {
        System.out.println("Please enter an HTTP URL.");
        return;
      }
      BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      String urlString = "";
      String current;
      while ((current = in.readLine()) != null) {
        urlString += current;
      }
      System.out.println(urlString);
      System.out.println("getResponseCode: " + connection.getResponseCode());
      System.out.println("getContentEncoding: " + connection.getContentEncoding());
      System.out.println("getContentLength: " + connection.getContentLength());
      System.out.println("getResponseCode: " + connection.getResponseCode());
      System.out.println("getConnectTimeout: " + connection.getConnectTimeout());
      System.out.println("getDate: " + connection.getDate());
      System.out.println("getLastModified: " + connection.getLastModified());
      System.out.println("getExpiration: " + connection.getExpiration());
      System.out.println("getURL: " + connection.getURL());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
