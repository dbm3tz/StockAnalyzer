package com.dbrianmiller.pojo;

public final class IncomeStatement {
  private String rAndDExpenses;
  private String nonRecurring;
  private String interestExpense;

  public String getrAndDExpenses() {
    return rAndDExpenses;
  }

  public void setrAndDExpenses(String rAndDExpenses) {
    this.rAndDExpenses = rAndDExpenses;
  }

  public String getNonRecurring() {
    return nonRecurring;
  }

  public void setNonRecurring(String nonRecurring) {
    this.nonRecurring = nonRecurring;
  }

  public String getInterestExpense() {
    return interestExpense;
  }

  public void setInterestExpense(String interestExpense) {
    this.interestExpense = interestExpense;
  }

  @Override
  public String toString() {
    return "Financials [rAndDExpenses=" + rAndDExpenses + ", nonRecurring=" + nonRecurring + ", interestExpense="
        + interestExpense + "]";
  }

}
