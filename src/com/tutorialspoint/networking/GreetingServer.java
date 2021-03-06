package com.tutorialspoint.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * <p>
 * It is an example of a server application that uses the Socket class to listen for clients on a
 * port number specified by a command-line argument.
 * </p>
 * <b>Usage:</b> <code>java GreetingServer port</code><br>
 * <b>Example:</b> <code>java GreetingServer 2015</code>
 */
public class GreetingServer extends Thread {
  private ServerSocket serverSocket;

  public GreetingServer(int port) throws IOException {
    serverSocket = new ServerSocket(port);
    serverSocket.setSoTimeout(10000);
  }

  @Override
  public void run() {
    while (true) {
      try {
        System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
        Socket server = serverSocket.accept();
        System.out.println("Just connected to " + server.getRemoteSocketAddress());
        DataInputStream in = new DataInputStream(server.getInputStream());
        System.out.println(in.readUTF());
        DataOutputStream out = new DataOutputStream(server.getOutputStream());
        out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress() + "\nGoodbye!");
        server.close();
      } catch (SocketTimeoutException s) {
        System.out.println("Socket timed out!");
        break;
      } catch (IOException e) {
        e.printStackTrace();
        break;
      }
    }
  }

  public static void main(String[] args) {
    int port = Integer.parseInt(args[0]);
    try {
      Thread t = new GreetingServer(port);
      t.start();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
