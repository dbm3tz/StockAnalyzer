package com.dbrianmiller.pojo;

public class BalanceSheet {
  private String date;
  private String cashEquity;
  private String shortTermInvestments;
  private String totalAssets;
  private String accountsPayable;
  private String shortCurrentLgTermDebt;
  private String otherCurrentLiabilities;
  private String longTermDebt;
  private String netTangibleAssets;

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getCashEquity() {
    return cashEquity;
  }

  public void setCashEquity(String cashEquity) {
    this.cashEquity = cashEquity;
  }

  public String getShortTermInvestments() {
    return shortTermInvestments;
  }

  public void setShortTermInvestments(String shortTermInvestments) {
    this.shortTermInvestments = shortTermInvestments;
  }

  public String getTotalAssets() {
    return totalAssets;
  }

  public void setTotalAssets(String totalAssets) {
    this.totalAssets = totalAssets;
  }

  public String getAccountsPayable() {
    return accountsPayable;
  }

  public void setAccountsPayable(String accountsPayable) {
    this.accountsPayable = accountsPayable;
  }

  public String getShortCurrentLgTermDebt() {
    return shortCurrentLgTermDebt;
  }

  public void setShortCurrentLgTermDebt(String shortCurrentLgTermDebt) {
    this.shortCurrentLgTermDebt = shortCurrentLgTermDebt;
  }

  public String getOtherCurrentLiabilities() {
    return otherCurrentLiabilities;
  }

  public void setOtherCurrentLiabilities(String otherCurrentLiabilities) {
    this.otherCurrentLiabilities = otherCurrentLiabilities;
  }

  public String getLongTermDebt() {
    return longTermDebt;
  }

  public void setLongTermDebt(String longTermDebt) {
    this.longTermDebt = longTermDebt;
  }

  public String getNetTangibleAssets() {
    return netTangibleAssets;
  }

  public void setNetTangibleAssets(String netTangibleAssets) {
    this.netTangibleAssets = netTangibleAssets;
  }

  @Override
  public String toString() {
    return "BalanceSheet [date=" + date + ", cashEquity=" + cashEquity + ", shortTermInvestments=" + shortTermInvestments
        + ", totalAssets=" + totalAssets + ", accountsPayable=" + accountsPayable + ", shortCurrentLgTermDebt="
        + shortCurrentLgTermDebt + ", otherCurrentLiabilities=" + otherCurrentLiabilities + ", longTermDebt="
        + longTermDebt + ", netTangibleAssets=" + netTangibleAssets + "]";
  }

}
