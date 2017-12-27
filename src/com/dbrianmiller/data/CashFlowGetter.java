package com.dbrianmiller.data;

import com.dbrianmiller.pojo.CashFlow;

public class CashFlowGetter extends DataGetter {

  private static final String url = "https://finance.yahoo.com/quote/%1$s/cash-flow?p=%1$s";

  public static CashFlow generateCashFlow(String symbol) {
    String cashFlowUrl = String.format(url, symbol);
    String source = getSource(cashFlowUrl);

    String totalCashFlowFromOperatingActivities = getGeneric4QuarterSum(source, "totalCashFromOperatingActivities", 3);
    String capitalExpenditures = getGeneric4QuarterSum(source, "capitalExpenditures", 3);
    String salePurchaseOfStock = getGeneric4QuarterSum(source, "salePurchaseOfStock", 3);

    CashFlow cashFlow = new CashFlow();
    cashFlow.setTotalCashFlowFromOperatingActivities(totalCashFlowFromOperatingActivities);
    cashFlow.setCapitalExpenditures(capitalExpenditures);
    cashFlow.setSalePurchaseOfStock(salePurchaseOfStock);

    return cashFlow;
  }

}
