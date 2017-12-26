package com.dbrianmiller.input;

import java.awt.AWTException;

public class TypePhrase {

  public static void TypePhraseMethod(String input) throws AWTException {
    TypeChar typeChar = TypeChar.getInstance();
    for (int i = 0; i < input.length(); i++) {
      char letter = input.charAt(i);
      switch(letter) {
      case 'a':
        typeChar.typeA();
        break;
      case 'b':
        typeChar.typeB();
        break;
      case 'c':
        typeChar.typeC();
        break;
      case 'd':
        typeChar.typeD();
        break;
      case 'e':
        typeChar.typeE();
        break;
      case 'f':
        typeChar.typeF();
        break;
      case 'g':
        typeChar.typeG();
        break;
      case 'h':
        typeChar.typeH();
        break;
      case 'i':
        typeChar.typeI();
        break;
      case 'j':
        typeChar.typeJ();
        break;
      case 'k':
        typeChar.typeK();
        break;
      case 'l':
        typeChar.typeL();
        break;
      case 'm':
        typeChar.typeM();
        break;
      case 'n':
        typeChar.typeN();
        break;
      case 'o':
        typeChar.typeO();
        break;
      case 'p':
        typeChar.typeP();
        break;
      case 'q':
        typeChar.typeQ();
        break;
      case 'r':
        typeChar.typeR();
        break;
      case 's':
        typeChar.typeS();
        break;
      case 't':
        typeChar.typeT();
        break;
      case 'u':
        typeChar.typeU();
        break;
      case 'v':
        typeChar.typeV();
        break;
      case 'w':
        typeChar.typeW();
        break;
      case 'x':
        typeChar.typeX();
        break;
      case 'y':
        typeChar.typeY();
        break;
      case 'z':
        typeChar.typeZ();
        break;
      case 'A':
        typeChar.typeA();
        break;
      case 'B':
        typeChar.typeB();
        break;
      case 'C':
        typeChar.typeC();
        break;
      case 'D':
        typeChar.typeD();
        break;
      case 'E':
        typeChar.typeE();
        break;
      case 'F':
        typeChar.typeF();
        break;
      case 'G':
        typeChar.typeG();
        break;
      case 'H':
        typeChar.typeH();
        break;
      case 'I':
        typeChar.typeI();
        break;
      case 'J':
        typeChar.typeJ();
        break;
      case 'K':
        typeChar.typeK();
        break;
      case 'L':
        typeChar.typeL();
        break;
      case 'M':
        typeChar.typeM();
        break;
      case 'N':
        typeChar.typeN();
        break;
      case 'O':
        typeChar.typeO();
        break;
      case 'P':
        typeChar.typeP();
        break;
      case 'Q':
        typeChar.typeQ();
        break;
      case 'R':
        typeChar.typeR();
        break;
      case 'S':
        typeChar.typeS();
        break;
      case 'T':
        typeChar.typeT();
        break;
      case 'U':
        typeChar.typeU();
        break;
      case 'V':
        typeChar.typeV();
        break;
      case 'W':
        typeChar.typeW();
        break;
      case 'X':
        typeChar.typeX();
        break;
      case 'Y':
        typeChar.typeY();
        break;
      case 'Z':
        typeChar.typeZ();
        break;
      case ' ':
        typeChar.typeSpace();
        break;
      case '=':
        typeChar.typeEquals();
        break;
      case '-':
        typeChar.typeMinus();
        break;
      case ',':
        typeChar.typeComma();
        break;
      case '.':
        typeChar.typePeriod();
        break;
      case '$':
        typeChar.typeDollar();
        break;
      case '%':
        typeChar.typePercent();
        break;
      case '1':
        typeChar.type1();
        break;
      case '2':
        typeChar.type2();
        break;
      case '3':
        typeChar.type3();
        break;
      case '4':
        typeChar.type4();
        break;
      case '5':
        typeChar.type5();
        break;
      case '6':
        typeChar.type6();
        break;
      case '7':
        typeChar.type7();
        break;
      case '8':
        typeChar.type8();
        break;
      case '9':
        typeChar.type9();
        break;
      case '0':
        typeChar.type0();
        break;
      default:
        System.out.println("Unknown character: " + letter);
        typeChar.type0();
      }
    }
  }

}
