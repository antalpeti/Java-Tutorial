package com.tutorialspoint.exceptions;

public class InsufficientFundsException extends Exception {

  private static final long serialVersionUID = -4368737215880913393L;
  private double amount;

  public InsufficientFundsException(double amount) {
    this.amount = amount;
  }

  public InsufficientFundsException(String cause) {
    super(cause);
  }

  public double getAmount() {
    return amount;
  }
}
