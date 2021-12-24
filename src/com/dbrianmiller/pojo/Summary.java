package com.dbrianmiller.pojo;

public final class Summary {
  private String price;
  private String marketCap;
  private String eps;
  private String forwardDividend;

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getMarketCap() {
    return marketCap;
  }

  public void setMarketCap(String marketCap) {
    this.marketCap = marketCap;
  }

  public String getEps() {
    return eps;
  }

  public void setEps(String eps) {
    this.eps = eps;
  }

  public String getForwardDividend() {
    return forwardDividend;
  }

  public void setForwardDividend(String forwardDividend) {
    this.forwardDividend = forwardDividend;
  }

  public String toString() {
    return String.format("Price: %1$s, Market Cap: %2$s, EPS: %3$s, Forward Dividend: %4$s", price, marketCap, eps, forwardDividend);
  }
}
