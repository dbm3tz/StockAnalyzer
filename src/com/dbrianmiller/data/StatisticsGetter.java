package com.dbrianmiller.data;

import com.dbrianmiller.pojo.Statistics;

public final class StatisticsGetter extends DataGetter {

  private static final String url = "https://finance.yahoo.com/quote/%1$s/key-statistics?p=%1$s";

  public static final Statistics generateStatistics(String symbol) {
    String statisticsUrl = String.format(url, symbol);
    String source = getSource(statisticsUrl);

    String profitMargin = getGeneric(source, "profitMargins");
    String operatingMargin = getGeneric(source, "operatingMargins");
    String returnOnAssets = getGeneric(source, "returnOnAssets");
    String returnOnEquity = getGeneric(source, "returnOnEquity");
    String revenue = getGeneric(source, "totalRevenue");
    String grossProfit = getGeneric(source, "grossProfits");
    String ebitda = getGeneric(source, "\"},\"ebitda");
    String beta = getGeneric(source, "\"},\"beta");

    Statistics statistics = new Statistics();
    statistics.setProfitMargin(profitMargin);
    statistics.setOperatingMargin(operatingMargin);
    statistics.setReturnOnAssets(returnOnAssets);
    statistics.setReturnOnEquity(returnOnEquity);
    statistics.setRevenue(revenue);
    statistics.setGrossProfit(grossProfit);
    statistics.setEbitda(ebitda);
    statistics.setBeta(beta);

    return statistics;
  }
  
  // Problems: EBITDA, Beta
  
  public static void main(String[] args) {
//    System.out.println(getStatistics("dwdp"));
    System.out.println(generateStatistics("rtec"));
  }
}
