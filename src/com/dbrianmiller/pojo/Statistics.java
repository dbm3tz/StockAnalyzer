package com.dbrianmiller.pojo;

public final class Statistics {
  private String profitMargin;
  private String operatingMargin;
  private String returnOnAssets;
  private String returnOnEquity;
  private String revenue;
  private String grossProfit;
  private String ebitda;
  private String beta;

  public String getProfitMargin() {
    return profitMargin;
  }

  public void setProfitMargin(String profitMargin) {
    this.profitMargin = profitMargin;
  }

  public String getOperatingMargin() {
    return operatingMargin;
  }

  public void setOperatingMargin(String operatingMargin) {
    this.operatingMargin = operatingMargin;
  }

  public String getReturnOnAssets() {
    return returnOnAssets;
  }

  public void setReturnOnAssets(String returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
  }

  public String getReturnOnEquity() {
    return returnOnEquity;
  }

  public void setReturnOnEquity(String returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
  }

  public String getRevenue() {
    return revenue;
  }

  public void setRevenue(String revenue) {
    this.revenue = revenue;
  }

  public String getGrossProfit() {
    return grossProfit;
  }

  public void setGrossProfit(String grossProfit) {
    this.grossProfit = grossProfit;
  }

  public String getEbitda() {
    return ebitda;
  }

  public void setEbitda(String ebitda) {
    this.ebitda = ebitda;
  }

  public String getBeta() {
    return beta;
  }

  public void setBeta(String beta) {
    this.beta = beta;
  }

  public String toString() {
    return String.format("profitMargin: %1$s, operatingMargin: %2$s, "
        + "returnOnAssets: %3$s, returnOnEquity: %4$s, revenue: %5$s, "
        + "grossProfit: %6$s, ebitda: %7$s, beta: %8$s", profitMargin, 
        operatingMargin, returnOnAssets, returnOnEquity, revenue, 
        grossProfit, ebitda, beta);
  }
}
