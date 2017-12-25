package com.dbrianmiller.pojo;

public class AnalystEstimate {
  private String capitalExpenditures;
  private String salePurchaseOfStock;

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
    return "AnalystEstimate [capitalExpenditures=" + capitalExpenditures + ", salePurchaseOfStock="
        + salePurchaseOfStock + "]";
  }

}
