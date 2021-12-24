package com.dbrianmiller.data;

import com.dbrianmiller.pojo.AnalystEstimate;

public class AnalystEstimatesGetter extends DataGetter {

  private static final String url = "https://finance.yahoo.com/quote/%1$s/analysts?p=%1$s";

  public static AnalystEstimate generateAnalystEstimate(String symbol) {
    String analystEstimateUrl = String.format(url, symbol);
    String source = getSource(analystEstimateUrl);

    String capitalExpenditures = getCapitalExpenditures(source);
    String salePurchaseOfStock = getSalePurchaseOfStock(source);

    AnalystEstimate analystEstimate = new AnalystEstimate();
    analystEstimate.setCapitalExpenditures(capitalExpenditures);
    analystEstimate.setSalePurchaseOfStock(salePurchaseOfStock);
    return analystEstimate;
  }

  private static String getCapitalExpenditures(String source) {
    try {
      String[] arr1 = source.split("earningsEstimate");
      String str1 = arr1[3];
      String[] arr2 = str1.split(":");
      String str2 = arr2[3];
      String[] arr3 = str2.split(",");
      return arr3[0];
    } catch (Exception ex) {
      return DataGetter.ERROR_MESSAGE;
    }
  }

  private static String getSalePurchaseOfStock(String source) {
    try {
      String[] arr1 = source.split("downLast90days");
      String str1 = arr1[4];
      String[] arr2 = str1.split(":");
      String str2 = arr2[6];
      String[] arr3 = str2.split(",");
      return arr3[0];
    } catch (Exception ex) {
      return DataGetter.ERROR_MESSAGE;
    }
  }

}
