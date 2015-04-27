package com.madhusudhan.java7.coin.switchstmt;

import com.madhusudhan.java7.domain.Trade;

public class NewSwitch {

  private static final String PENDING = "PENDING";
  private static final String EXECUTE = "EXECUTE";
  private static final String NEW = "NEW";

  public void processTrade(Trade t) {
    String status = t.getStatus();

    switch (status) {
      case NEW:
        newTrade(t);
        break;
      case EXECUTE:
        executeTrade(t);
        break;
      case PENDING:
        pendingTrade(t);
        break;

      default:
        break;
    }
  }

  private void pendingTrade(Trade t) {
    System.out.println("The trade status is pending.");
  }

  private void executeTrade(Trade t) {
    System.out.println("The trade status is execute.");
  }

  private void newTrade(Trade t) {
    System.out.println("The trade status is new.");
  }

  public static void main(String[] args) {
    NewSwitch ns = new NewSwitch();
    Trade t = new Trade();
    ns.processTrade(t);
    t.setStatus(EXECUTE);
    ns.processTrade(t);
    t.setStatus(PENDING);
    ns.processTrade(t);
  }

}
