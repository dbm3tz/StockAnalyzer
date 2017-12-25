package com.dbrianmiller.pojo;

public class CashFlow {
  private String totalCashFlowFromOperatingActivities;
  private String capitalExpenditures;
  private String salePurchaseOfStock;

  public String getTotalCashFlowFromOperatingActivities() {
    return totalCashFlowFromOperatingActivities;
  }

  public void setTotalCashFlowFromOperatingActivities(String totalCashFlowFromOperatingActivities) {
    this.totalCashFlowFromOperatingActivities = totalCashFlowFromOperatingActivities;
  }

  public String getCapitalExpenditures() {
    return capitalExpenditures;
  }

  public void setCapitalExpenditures(String capitalExpenditures) {
    this.capitalExpenditures = capitalExpenditures;
  }

  public String getSalePurchaseOfStock() {
    return salePurchaseOfStock;
  }
  public void setSalePurchaseOfStock(String salePurchaseOfStock) {
    this.salePurchaseOfStock = salePurchaseOfStock;
  }

  @Override
  public String toString() {
    return "CashFlow [totalCashFlowFromOperatingActivities=" + totalCashFlowFromOperatingActivities
        + ", capitalExpenditures=" + capitalExpenditures + ", salePurchaseOfStock=" + salePurchaseOfStock + "]";
  }

}
