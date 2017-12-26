package com.dbrianmiller.data;

import com.dbrianmiller.pojo.Summary;

public final class SummaryGetter extends DataGetter {

  private static final String url = "https://finance.yahoo.com/quote/%1$s?p=%1$s";

  public static final Summary generateSummary(String symbol) {
    String summaryUrl = String.format(url, symbol);
    String source = getSource(summaryUrl);
    String price = getGeneric(source, "regularMarketPrice");
    String marketCap = getGeneric(source, "marketCap");
    String forwardDividend = getGeneric(source, "dividendRate");
    String eps = getGeneric(source, "trailingEps");

    Summary summary = new Summary();
    summary.setPrice(price);
    summary.setMarketCap(marketCap);
    summary.setForwardDividend(forwardDividend);
    summary.setEps(eps);

    return summary;
  }

}
