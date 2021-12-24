package com.dbrianmiller.pojo;

public class Stock {
  AnalystEstimate analystEstimate;
  BalanceSheet balanceSheet;
  CashFlow cashFlow;
  IncomeStatement incomeStatement;
  Statistics statistics;
  Summary summary;

  public AnalystEstimate getAnalystEstimate() {
    return analystEstimate;
  }

  public void setAnalystEstimate(AnalystEstimate analystEstimate) {
    this.analystEstimate = analystEstimate;
  }

  public BalanceSheet getBalanceSheet() {
    return balanceSheet;
  }

  public void setBalanceSheet(BalanceSheet balanceSheet) {
    this.balanceSheet = balanceSheet;
  }

  public CashFlow getCashFlow() {
    return cashFlow;
  }

  public void setCashFlow(CashFlow cashFlow) {
    this.cashFlow = cashFlow;
  }
  public IncomeStatement getIncomeStatement() {
    return incomeStatement;
  }

  public void setIncomeStatement(IncomeStatement incomeStatement) {
    this.incomeStatement = incomeStatement;
  }

  public Statistics getStatistics() {
    return statistics;
  }

  public void setStatistics(Statistics statistics) {
    this.statistics = statistics;
  }

  public Summary getSummary() {
    return summary;
  }

  public void setSummary(Summary summary) {
    this.summary = summary;
  }

  @Override
  public String toString() {
    return "Stock [analystEstimate=" + analystEstimate + ", balanceSheet=" + balanceSheet + ", cashFlow=" + cashFlow
        + ", incomeStatement=" + incomeStatement + ", statistics=" + statistics + ", summary=" + summary + "]";
  }

}
