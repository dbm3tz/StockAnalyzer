package com.dbrianmiller.data;

import com.dbrianmiller.pojo.IncomeStatement;

public final class IncomeStatementGetter extends DataGetter {

  private static final String url = "https://finance.yahoo.com/quote/%1$s/financials?p=%1$s";

  public static IncomeStatement generateIncomeStatements(String symbol) {
    String incomeStatementUrl = String.format(url, symbol);
    String source = getSource(incomeStatementUrl);

    String rAndDExpenses = getGeneric4QuarterSum(source, "researchDevelopment", 0);
    String nonRecurring = getGeneric4QuarterSum(source, "nonRecurring", 0);
    String interestExpense = getGeneric4QuarterSum(source, "interestExpense", 0);

    IncomeStatement incomeStatement = new IncomeStatement();
    incomeStatement.setrAndDExpenses(rAndDExpenses);
    incomeStatement.setNonRecurring(nonRecurring);
    incomeStatement.setInterestExpense(interestExpense);

    return incomeStatement;
  }

}
