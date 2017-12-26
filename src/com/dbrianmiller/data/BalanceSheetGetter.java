package com.dbrianmiller.data;

import com.dbrianmiller.pojo.BalanceSheet;

public class BalanceSheetGetter extends DataGetter {

  private static final String url = "https://finance.yahoo.com/quote/%1$s/balance-sheet?p=%1$s";

  public static BalanceSheet generateBalanceSheet(String symbol) {
    String balanceSheetUrl = String.format(url, symbol);
    String source = getSource(balanceSheetUrl);

    String date = getDate(source, "endDate", 4);
    String cashEquity = getGeneric(source, "},\"cash");
    String shortTermInvestments = getGeneric(source, "shortTermInvestments");
    String totalAssets = getGeneric(source, "totalAssets");
    String accountsPayable = getGeneric(source, "accountsPayable");
    String shortCurrentLgTermDebt = getGeneric(source, "shortLongTermDebt");
    String otherCurrentLiabilities = getGeneric(source, "otherCurrentLiab");
    String longTermDebt = getGeneric(source, "longTermDebt");
    String netTangibleAssets = getGeneric(source, "netTangibleAssets");

    BalanceSheet balanceSheet = new BalanceSheet();
    balanceSheet.setDate(date);
    balanceSheet.setCashEquity(cashEquity);
    balanceSheet.setShortTermInvestments(shortTermInvestments);
    balanceSheet.setTotalAssets(totalAssets);
    balanceSheet.setAccountsPayable(accountsPayable);
    balanceSheet.setShortCurrentLgTermDebt(shortCurrentLgTermDebt);
    balanceSheet.setOtherCurrentLiabilities(otherCurrentLiabilities);
    balanceSheet.setLongTermDebt(longTermDebt);
    balanceSheet.setNetTangibleAssets(netTangibleAssets);

    return balanceSheet;
  }

}
