package com.tutorialspoint.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
  public static void main(String args[]) throws UnknownHostException {
    InetAddress address = InetAddress.getLocalHost();
    System.out.println(address);
    address = InetAddress.getByName("starwave.com");
    System.out.println(address);
    InetAddress addresses[] = InetAddress.getAllByName("www.nba.com");
    for (int i = 0; i < addresses.length; i++) {
      System.out.println(addresses[i]);
    }
    address = InetAddress.getByName("127.0.0.1");
    System.out.println(address);
    byte[] ipAddress = new byte[] {127, 0, 0, 1};
    address = InetAddress.getByAddress(ipAddress);
    System.out.println(address);
    System.out.println("getLocalHost: " + InetAddress.getLocalHost());
    checkUpcIpAddressesBlock();
  }

  public static void checkSites() {
    int ipMin = 91;
    int ipMax = 255;
    for (int i = ipMin; i < ipMax; i++) {
      for (int j = ipMin; j < ipMax; j++) {
        for (int k = ipMin; k < ipMax; k++) {
          for (int l = ipMin; l < ipMax; l++) {
            String ipAddress = i + "." + j + "." + k + "." + l;
            try {
              InetAddress address = InetAddress.getByName(ipAddress);
              System.out.println(address.getHostAddress() + " : " + address.getCanonicalHostName());
            } catch (UnknownHostException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
  }

  public static void checkUpcIpAddressesBlock() {
    for (int i = 78; i < 79; i++) {
      for (int j = 139; j < 140; j++) {
        for (int k = 0; k < 64; k++) {
          for (int l = 0; l < 256; l++) {
            String ipAddress = i + "." + j + "." + k + "." + l;
            try {
              InetAddress address = InetAddress.getByName(ipAddress);
              System.out.println(address.getHostAddress() + " : " + address.getCanonicalHostName());
            } catch (UnknownHostException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
  }
}
