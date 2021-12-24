package com.dbrianmiller;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import com.dbrianmiller.data.StockGetter;
import com.dbrianmiller.input.TypeChar;
import com.dbrianmiller.input.TypePhrase;
import com.dbrianmiller.pojo.AnalystEstimate;
import com.dbrianmiller.pojo.BalanceSheet;
import com.dbrianmiller.pojo.CashFlow;
import com.dbrianmiller.pojo.IncomeStatement;
import com.dbrianmiller.pojo.Statistics;
import com.dbrianmiller.pojo.Stock;
import com.dbrianmiller.pojo.Summary;

public class ClickToRun {
  public static void main(String[] args) throws HeadlessException, UnsupportedFlavorException, IOException, AWTException {

    Robot rob = new Robot();
    rob.delay(4000);

    String doIt = "";

    while(!(doIt.contains("done"))) {
      doIt = copyCell();
      if ("y".equals(doIt)) {
        // Get stock information
        moveRight(1);
        String stockSymbol = copyCell();
        Stock stock = StockGetter.generateStock(stockSymbol);
        moveRight(23);

        // Columns Z to AC
        Summary summary = stock.getSummary();
        String price = summary.getPrice();
        String marketCap = summary.getMarketCap();
        String eps = summary.getEps();
        String forwardDividend = summary.getForwardDividend();
        typeThenMove(price);
        typeThenMove(marketCap);
        typeThenMove(eps);
        typeThenMove(forwardDividend);
        moveRight(1);

        // Columns AE to AL
        Statistics statistics = stock.getStatistics();
        String profitMargin = statistics.getProfitMargin();
        String operatingMargin = statistics.getOperatingMargin();
        String returnOnAssets = statistics.getReturnOnAssets();
        String returnOnEquity = statistics.getReturnOnEquity();
        String revenue = statistics.getRevenue();
        String grossProfit = statistics.getGrossProfit();
        String ebitda = statistics.getEbitda();
        String beta = statistics.getBeta();
        typeThenMove(profitMargin);
        typeThenMove(operatingMargin);
        typeThenMove(returnOnAssets);
        typeThenMove(returnOnEquity);
        typeThenMove(revenue);
        typeThenMove(grossProfit);
        typeThenMove(ebitda);
        typeThenMove(beta);
        moveRight(1);

        // Columns AN to AP
        IncomeStatement incomeStatement = stock.getIncomeStatement();
        String rAndDExpenses = incomeStatement.getrAndDExpenses();
        String nonRecurring = incomeStatement.getNonRecurring();
        String interestExpense = incomeStatement.getInterestExpense();
        typeThenMove(rAndDExpenses);
        typeThenMove(nonRecurring);
        typeThenMove(interestExpense);
        moveRight(1);

        // Columns AR to AY
        BalanceSheet balanceSheet = stock.getBalanceSheet();
        String date = balanceSheet.getDate();
        String cashEquity = balanceSheet.getCashEquity();
        String shortTermInvestments = balanceSheet.getShortTermInvestments();
        String totalAssets = balanceSheet.getTotalAssets();
        String accountsPayable = balanceSheet.getAccountsPayable();
        String shortCurrentLgTermDebt = balanceSheet.getShortCurrentLgTermDebt();
        String otherCurrentLiabilities = balanceSheet.getOtherCurrentLiabilities();
        String longTermDebt = balanceSheet.getLongTermDebt();
        String netTangibleAssets = balanceSheet.getNetTangibleAssets();
        typeThenMove(cashEquity);
        typeThenMove(shortTermInvestments);
        typeThenMove(totalAssets);
        typeThenMove(accountsPayable);
        typeThenMove(shortCurrentLgTermDebt);
        typeThenMove(otherCurrentLiabilities);
        typeThenMove(longTermDebt);
        typeThenMove(netTangibleAssets);
        moveRight(1);

        // Columns BA to BC
        CashFlow cashFlow = stock.getCashFlow();
        String totalCashFlowFromOperatingActivities = cashFlow.getTotalCashFlowFromOperatingActivities();
        String capitalExpendituresCashFlow = cashFlow.getCapitalExpenditures();
        String salePurchaseOfStockCashFlow = cashFlow.getSalePurchaseOfStock();
        typeThenMove(totalCashFlowFromOperatingActivities);
        typeThenMove(capitalExpendituresCashFlow);
        typeThenMove(salePurchaseOfStockCashFlow);
        moveRight(1);

        // Columns BE to BF
        AnalystEstimate analystEstimate = stock.getAnalystEstimate();
        String capitalExpendituresAnalystEstimate = analystEstimate.getCapitalExpenditures();
        String salePurchaseOfStockAnalystEstimate = analystEstimate.getSalePurchaseOfStock();
        typeThenMove(capitalExpendituresAnalystEstimate);
        typeThenMove(salePurchaseOfStockAnalystEstimate);
        moveRight(1);

        typeThenMove(date);

        moveLeft(59);
      }
      TypeChar.getInstance().down();
    }
  }

  private static String copyCell() throws AWTException, HeadlessException, UnsupportedFlavorException, IOException {
    final int defaultMultiplier = 20;
    try {
      TypeChar.getInstance().copy(defaultMultiplier);
      return ((String) Toolkit.getDefaultToolkit()
          .getSystemClipboard().getData(DataFlavor.stringFlavor)).trim();
    } catch (Exception ex) {
      TypeChar.getInstance().copy(defaultMultiplier * 2);
      return ((String) Toolkit.getDefaultToolkit()
          .getSystemClipboard().getData(DataFlavor.stringFlavor)).trim();
    }
  }

  private static void moveLeft(int spaces) throws AWTException {
    for (int i = 0; i < spaces; i++) {
      TypeChar.getInstance().left();
    }
  }

  private static void moveRight(int spaces) throws AWTException {
    for (int i = 0; i < spaces; i++) {
      TypeChar.getInstance().right();
    }
  }

  private static void typeThenMove(String str) throws AWTException {
    TypePhrase.TypePhraseMethod(str);
    moveRight(1);
  }
}

