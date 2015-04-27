package com.madhusudhan.java7.coin.switchstmt;

import com.madhusudhan.java7.domain.Trade;

public class OldSwitch {

  private static final String PENDING = "PENDING";
  private static final String EXECUTED = "EXECUTED";
  private static final String NEW = "NEW";

  private void processTrade(Trade t) {
    String status = t.getStatus();

    if (status.equalsIgnoreCase(OldSwitch.NEW)) {
      newTrade(t);
    } else if (status.equalsIgnoreCase(OldSwitch.EXECUTED)) {
      executeTrade(t);
    } else if (status.equalsIgnoreCase(OldSwitch.PENDING)) {
      pendingTrade(t);
    }
  }

  private void newTrade(Trade t) {
    System.out.println("The trade status is new.");
  }

  private void executeTrade(Trade t) {
    System.out.println("The trade status is execute.");
  }

  private void pendingTrade(Trade t) {
    System.out.println("The trade status is pending.");
  }

  public static void main(String[] args) {
    OldSwitch os = new OldSwitch();
    Trade t = new Trade();
    os.processTrade(t);
    t.setStatus(EXECUTED);
    os.processTrade(t);
    t.setStatus(PENDING);
    os.processTrade(t);
  }
}
