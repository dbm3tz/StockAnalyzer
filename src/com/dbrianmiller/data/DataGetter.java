package com.dbrianmiller.data;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

public abstract class DataGetter {

  public static final String ERROR_MESSAGE = "0";

  protected static String getSource(String url) {
    String source = null;
    try {
      final URL urlObject = new URL(url);
      final StringBuilder sb = new StringBuilder();
      final int BUFFER_SIZE = 1024 * 10;
      final byte[] dataBuffer = new byte[BUFFER_SIZE];
      final BufferedInputStream in = new BufferedInputStream(urlObject.openStream());
      final int ZERO = 0;
      int bytesRead = ZERO;

      while ((bytesRead = in.read(dataBuffer, ZERO, BUFFER_SIZE)) >= ZERO) {
        sb.append(new String(dataBuffer, ZERO, bytesRead));
      }

      source = sb.toString();

    } catch (IOException e) {
      e.printStackTrace();
    }

    return source;
  }

  protected static String getGeneric(String source, String key) {
    return getGeneric(source, key, 1);
  }

  protected static String getGeneric(String source, String key, int instance) {
    try {
      String[] arr1 = source.split(key);
      String str1 = arr1[instance];
      String[] arr2 = str1.split(":");
      String str2 = arr2[2];
      String[] arr3 = str2.split(",");
      return arr3[0];
    } catch (Exception ex) {
      return ERROR_MESSAGE;
    }
  }

  protected static String getGeneric4QuarterSum(String source, String key, int offset) {
    try {
      String[] arr = source.split(key);

      // Get quarter data and convert to usable format
      long q1;
      try {
        String q1Part = arr[1 + offset];
        String q1Str = getGenericQuarter(q1Part);
        q1 = Long.parseLong(q1Str);
      } catch (Exception ex) {
        System.out.println("Unable to process q1 for " + key);
        q1 = 0;
      }

      long q2;
      try {
        String q2Part = arr[2 + offset];
        String q2Str = getGenericQuarter(q2Part);
        q2 = Long.parseLong(q2Str);
      } catch (Exception ex) {
        System.out.println("Unable to process q2 for " + key);
        q2 = 0;
      }

      long q3;
      try {
        String q3Part = arr[3 + offset];
        String q3Str = getGenericQuarter(q3Part);
        q3 = Long.parseLong(q3Str);
      } catch (Exception ex) {
        System.out.println("Unable to process q3 for " + key);
        q3 = 0;
      }

      long q4;
      try {
        String q4Part = arr[4 + offset];
        String q4Str = getGenericQuarter(q4Part);
        q4 = Long.parseLong(q4Str);
      } catch (Exception ex) {
        System.out.println("Unable to process q4 for " + key);
        q4 = 0;
      }

      // Add quarters
      long sum = q1 + q2 + q3 + q4;

      return Long.toString(sum);
    } catch (Exception ex) {
      return ERROR_MESSAGE;
    }
  }

  protected static String getDate(String source, String key, int instance) {
    try {
      String[] arr1 = source.split(key);
      String str1 = arr1[instance];
      String[] arr2 = str1.split(":");
      String str2 = arr2[3];
      String[] arr3 = str2.split("\"}");

      // Remove character 1 (") and return
      return arr3[0].substring(1);
    } catch (Exception ex) {
      return ERROR_MESSAGE;
    }
  }

  private static String getGenericQuarter(String remainingSource) {
    try {
      if (remainingSource.startsWith("\":{}")) {
        return "0";
      }
      String[] arr2 = remainingSource.split(":");
      String str2 = arr2[2];
      String[] arr3 = str2.split(",");
      return arr3[0];
    } catch (Exception ex) {
      return ERROR_MESSAGE;
    }
  }
}
