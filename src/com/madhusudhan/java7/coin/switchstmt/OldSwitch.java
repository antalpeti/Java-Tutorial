package com.madhusudhan.java7.coin.switchstmt;

import com.madhusudhan.java7.domain.Trade;

public class OldSwitch {

  private void processTrade(Trade t) {
    String status = t.getStatus();

    if (status.equalsIgnoreCase(TradeStatusConstants.NEW)) {
      newTrade(t);
    } else if (status.equalsIgnoreCase(TradeStatusConstants.EXECUTE)) {
      executeTrade(t);
    } else if (status.equalsIgnoreCase(TradeStatusConstants.PENDING)) {
      pendingTrade(t);
    }
  }

  private void executeTrade(Trade t) {
    TradeStatusUtil.printStatus(TradeStatusConstants.EXECUTE);
  }

  private void newTrade(Trade t) {
    TradeStatusUtil.printStatus(TradeStatusConstants.NEW);
  }

  private void pendingTrade(Trade t) {
    TradeStatusUtil.printStatus(TradeStatusConstants.PENDING);
  }

  public static void main(String[] args) {
    OldSwitch os = new OldSwitch();
    Trade t = new Trade();
    os.processTrade(t);
    t.setStatus(TradeStatusConstants.EXECUTE);
    os.processTrade(t);
    t.setStatus(TradeStatusConstants.PENDING);
    os.processTrade(t);
  }
}
