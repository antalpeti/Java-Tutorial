package com.madhusudhan.java7.coin.switchstmt;

import com.madhusudhan.java7.domain.Trade;

public class NewSwitch {

  public void processTrade(Trade t) {
    String status = t.getStatus();

    switch (status) {
      case TradeStatusConstants.NEW:
        newTrade(t);
        break;
      case TradeStatusConstants.EXECUTE:
        executeTrade(t);
        break;
      case TradeStatusConstants.PENDING:
        pendingTrade(t);
        break;

      default:
        break;
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
    NewSwitch ns = new NewSwitch();
    Trade t = new Trade();
    ns.processTrade(t);
    t.setStatus(TradeStatusConstants.EXECUTE);
    ns.processTrade(t);
    t.setStatus(TradeStatusConstants.PENDING);
    ns.processTrade(t);
  }

}
