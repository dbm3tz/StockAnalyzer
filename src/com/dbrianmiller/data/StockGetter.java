package com.dbrianmiller.data;

import com.dbrianmiller.pojo.AnalystEstimate;
import com.dbrianmiller.pojo.BalanceSheet;
import com.dbrianmiller.pojo.CashFlow;
import com.dbrianmiller.pojo.IncomeStatement;
import com.dbrianmiller.pojo.Statistics;
import com.dbrianmiller.pojo.Stock;
import com.dbrianmiller.pojo.Summary;

public class StockGetter {

  public static final Stock generateStock(String symbol) {
    AnalystEstimate analystEstimate = AnalystEstimatesGetter.generateAnalystEstimate(symbol);
    BalanceSheet balanceSheet = BalanceSheetGetter.generateBalanceSheet(symbol);
    CashFlow cashFlow = CashFlowGetter.generateCashFlow(symbol);
    IncomeStatement incomeStatement = IncomeStatementGetter.generateIncomeStatements(symbol);
    Statistics statistics = StatisticsGetter.generateStatistics(symbol);
    Summary summary = SummaryGetter.generateSummary(symbol);

    Stock stock = new Stock();
    stock.setAnalystEstimate(analystEstimate);
    stock.setBalanceSheet(balanceSheet);
    stock.setCashFlow(cashFlow);
    stock.setIncomeStatement(incomeStatement);
    stock.setStatistics(statistics);
    stock.setSummary(summary);

    return stock;
  }

}
