package com.dbrianmiller.input;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TypeChar {

  private static TypeChar instance;
  private final int DELAY = 20;
  private Robot r;

  private TypeChar() throws AWTException {
    r = new Robot();
  }

  public static TypeChar getInstance() throws AWTException {
    // TODO make thread safe
    if (instance == null) {
      instance = new TypeChar();
    }
    return instance;
  }

  public void typeA() throws AWTException {
    r.keyPress(KeyEvent.VK_A);
    r.keyRelease(KeyEvent.VK_A);
    r.delay(DELAY);
  }

  public void typeB() throws AWTException {
    r.keyPress(KeyEvent.VK_B);
    r.keyRelease(KeyEvent.VK_B);
    r.delay(DELAY);
  }

  public void typeC() throws AWTException {
    r.keyPress(KeyEvent.VK_C);
    r.keyRelease(KeyEvent.VK_C);
    r.delay(DELAY);
  }

  public void typeD() throws AWTException {
    r.keyPress(KeyEvent.VK_D);
    r.keyRelease(KeyEvent.VK_D);
    r.delay(DELAY);
  }

  public void typeE() throws AWTException {
    r.keyPress(KeyEvent.VK_E);
    r.keyRelease(KeyEvent.VK_E);
    r.delay(DELAY);
  }

  public void typeF() throws AWTException {
    r.keyPress(KeyEvent.VK_F);
    r.keyRelease(KeyEvent.VK_F);
    r.delay(DELAY);
  }

  public void typeG() throws AWTException {
    r.keyPress(KeyEvent.VK_G);
    r.keyRelease(KeyEvent.VK_G);
    r.delay(DELAY);
  }

  public void typeH() throws AWTException {
    r.keyPress(KeyEvent.VK_H);
    r.keyRelease(KeyEvent.VK_H);
    r.delay(DELAY);
  }

  public void typeI() throws AWTException {
    r.keyPress(KeyEvent.VK_I);
    r.keyRelease(KeyEvent.VK_I);
    r.delay(DELAY);
  }

  public void typeJ() throws AWTException {
    r.keyPress(KeyEvent.VK_J);
    r.keyRelease(KeyEvent.VK_J);
    r.delay(DELAY);
  }

  public void typeK() throws AWTException {
    r.keyPress(KeyEvent.VK_K);
    r.keyRelease(KeyEvent.VK_K);
    r.delay(DELAY);
  }

  public void typeL() throws AWTException {
    r.keyPress(KeyEvent.VK_L);
    r.keyRelease(KeyEvent.VK_L);
    r.delay(DELAY);
  }

  public void typeM() throws AWTException {
    r.keyPress(KeyEvent.VK_M);
    r.keyRelease(KeyEvent.VK_M);
    r.delay(DELAY);
  }

  public void typeN() throws AWTException {
    r.keyPress(KeyEvent.VK_N);
    r.keyRelease(KeyEvent.VK_N);
    r.delay(DELAY);
  }

  public void typeO() throws AWTException {
    r.keyPress(KeyEvent.VK_O);
    r.keyRelease(KeyEvent.VK_O);
    r.delay(DELAY);
  }

  public void typeP() throws AWTException {
    r.keyPress(KeyEvent.VK_P);
    r.keyRelease(KeyEvent.VK_P);
    r.delay(DELAY);
  }

  public void typeQ() throws AWTException {
    r.keyPress(KeyEvent.VK_Q);
    r.keyRelease(KeyEvent.VK_Q);
    r.delay(DELAY);
  }

  public void typeR() throws AWTException {
    r.keyPress(KeyEvent.VK_R);
    r.keyRelease(KeyEvent.VK_R);
    r.delay(DELAY);
  }

  public void typeS() throws AWTException {
    r.keyPress(KeyEvent.VK_S);
    r.keyRelease(KeyEvent.VK_S);
    r.delay(DELAY);
  }

  public void typeT() throws AWTException {
    r.keyPress(KeyEvent.VK_T);
    r.keyRelease(KeyEvent.VK_T);
    r.delay(DELAY);
  }

  public void typeU() throws AWTException {
    r.keyPress(KeyEvent.VK_U);
    r.keyRelease(KeyEvent.VK_U);
    r.delay(DELAY);
  }

  public void typeV() throws AWTException {
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_V);
    r.delay(DELAY);
  }

  public void typeW() throws AWTException {
    r.keyPress(KeyEvent.VK_W);
    r.keyRelease(KeyEvent.VK_W);
    r.delay(DELAY);
  }

  public void typeX() throws AWTException {
    r.keyPress(KeyEvent.VK_X);
    r.keyRelease(KeyEvent.VK_X);
    r.delay(DELAY);
  }

  public void typeY() throws AWTException {
    r.keyPress(KeyEvent.VK_Y);
    r.keyRelease(KeyEvent.VK_Y);
    r.delay(DELAY);
  }

  public void typeZ() throws AWTException {
    r.keyPress(KeyEvent.VK_Z);
    r.keyRelease(KeyEvent.VK_Z);
    r.delay(DELAY);
  }

  public void typeSpace() throws AWTException {
    r.keyPress(KeyEvent.VK_SPACE);
    r.keyRelease(KeyEvent.VK_SPACE);
    r.delay(DELAY);
  }

  public void typeEnter() throws AWTException {
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    r.delay(DELAY);
  }

  public void typeEquals() throws AWTException {
    r.keyPress(KeyEvent.VK_EQUALS);
    r.keyRelease(KeyEvent.VK_EQUALS);
    r.delay(DELAY);
  }

  public void typeMinus() throws AWTException {
    r.keyPress(KeyEvent.VK_MINUS);
    r.keyRelease(KeyEvent.VK_MINUS);
    r.delay(DELAY);
  }

  public void typeComma() throws AWTException {
    r.keyPress(KeyEvent.VK_COMMA);
    r.keyRelease(KeyEvent.VK_COMMA);
    r.delay(DELAY);
  }

  public void typePeriod() throws AWTException {
    r.keyPress(KeyEvent.VK_PERIOD);
    r.keyRelease(KeyEvent.VK_PERIOD);
    r.delay(DELAY);
  }

  public void up() throws AWTException {
    r.keyPress(KeyEvent.VK_UP);
    r.keyRelease(KeyEvent.VK_UP);
    r.delay(DELAY);
  }

  public void down() throws AWTException {
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.delay(DELAY);
  }

  public void right() throws AWTException {
    r.keyPress(KeyEvent.VK_RIGHT);
    r.keyRelease(KeyEvent.VK_RIGHT);
    r.delay(DELAY);
  }

  public void left() throws AWTException {
    r.keyPress(KeyEvent.VK_LEFT);
    r.keyRelease(KeyEvent.VK_LEFT);
    r.delay(DELAY);
  }

  public void typeDollar() throws AWTException {
    r.keyPress(KeyEvent.VK_SHIFT);
    r.delay(DELAY);
    r.keyPress(KeyEvent.VK_4);
    r.keyRelease(KeyEvent.VK_4);
    r.delay(DELAY);
    r.keyRelease(KeyEvent.VK_SHIFT);
    r.delay(DELAY);
  }

  public void typePercent() throws AWTException {
    r.keyPress(KeyEvent.VK_SHIFT);
    r.delay(DELAY);
    r.keyPress(KeyEvent.VK_5);
    r.keyRelease(KeyEvent.VK_5);
    r.delay(DELAY);
    r.keyRelease(KeyEvent.VK_SHIFT);
    r.delay(DELAY);
  }

  public void type1() throws AWTException {
    r.keyPress(KeyEvent.VK_1);
    r.keyRelease(KeyEvent.VK_1);
    r.delay(DELAY);
  }

  public void type2() throws AWTException {
    r.keyPress(KeyEvent.VK_2);
    r.keyRelease(KeyEvent.VK_2);
    r.delay(DELAY);
  }

  public void type3() throws AWTException {
    r.keyPress(KeyEvent.VK_3);
    r.keyRelease(KeyEvent.VK_3);
    r.delay(DELAY);
  }

  public void type4() throws AWTException {
    r.keyPress(KeyEvent.VK_4);
    r.keyRelease(KeyEvent.VK_4);
    r.delay(DELAY);
  }

  public void type5() throws AWTException {
    r.keyPress(KeyEvent.VK_5);
    r.keyRelease(KeyEvent.VK_5);
    r.delay(DELAY);
  }

  public void type6() throws AWTException {
    r.keyPress(KeyEvent.VK_6);
    r.keyRelease(KeyEvent.VK_6);
    r.delay(DELAY);
  }

  public void type7() throws AWTException {
    r.keyPress(KeyEvent.VK_7);
    r.keyRelease(KeyEvent.VK_7);
    r.delay(DELAY);
  }

  public void type8() throws AWTException {
    r.keyPress(KeyEvent.VK_8);
    r.keyRelease(KeyEvent.VK_8);
    r.delay(DELAY);
  }

  public void type9() throws AWTException {
    r.keyPress(KeyEvent.VK_9);
    r.keyRelease(KeyEvent.VK_9);
    r.delay(DELAY);
  }

  public void type0() throws AWTException {
    r.keyPress(KeyEvent.VK_0);
    r.keyRelease(KeyEvent.VK_0);
    r.delay(DELAY);
  }

  public void copy(int delayMultiplier) throws AWTException {
    r.keyPress(KeyEvent.VK_CONTROL);
    r.delay(DELAY * delayMultiplier);
    r.keyPress(KeyEvent.VK_C);
    r.delay(DELAY * delayMultiplier);
    r.keyRelease(KeyEvent.VK_C);
    r.delay(DELAY * delayMultiplier);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.delay(DELAY * delayMultiplier);
  }

  public void paste() throws AWTException {
    r.keyPress(KeyEvent.VK_CONTROL);
    r.delay(DELAY);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_V);
    r.delay(DELAY);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.delay(DELAY);
  }

  public void highlightAll() throws AWTException {
    r.keyPress(KeyEvent.VK_CONTROL);
    r.delay(DELAY);
    r.keyPress(KeyEvent.VK_A);
    r.keyRelease(KeyEvent.VK_A);
    r.delay(DELAY);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.delay(DELAY);
  }

  public void controlRight() throws AWTException {
    r.keyPress(KeyEvent.VK_CONTROL);
    r.delay(DELAY);
    r.keyPress(KeyEvent.VK_RIGHT);
    r.keyRelease(KeyEvent.VK_RIGHT);
    r.delay(DELAY);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.delay(DELAY);
  }

  public void typeDelete() throws AWTException {
    r.keyPress(KeyEvent.VK_DELETE);
    r.keyRelease(KeyEvent.VK_DELETE);
    r.delay(DELAY);
  }

  public void typeBackspace() throws AWTException {
    r.keyPress(KeyEvent.VK_BACK_SPACE);
    r.keyRelease(KeyEvent.VK_BACK_SPACE);
    r.delay(DELAY);
  }
}
