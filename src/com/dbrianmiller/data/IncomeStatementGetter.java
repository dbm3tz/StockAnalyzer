package com.dbrianmiller.data;

import com.dbrianmiller.pojo.IncomeStatement;

public final class IncomeStatementGetter extends DataGetter {

  private static final String url = "https://finance.yahoo.com/quote/%1$s/financials?p=%1$s";

  public static IncomeStatement generateIncomeStatements(String symbol) {
    String incomeStatementUrl = String.format(url, symbol);
    String source = getSource(incomeStatementUrl);

    String rAndDExpenses = getGeneric4QuarterSum(source, "researchDevelopment");
    String nonRecurring = getGeneric4QuarterSum(source, "nonRecurring");
    String interestExpense = getGeneric4QuarterSum(source, "interestExpense");

    IncomeStatement incomeStatement = new IncomeStatement();
    incomeStatement.setrAndDExpenses(rAndDExpenses);
    incomeStatement.setNonRecurring(nonRecurring);
    incomeStatement.setInterestExpense(interestExpense);

    return incomeStatement;
  }

}
