package com.dbrianmiller.data;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

public abstract class DataGetter {

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
//    String[] arr1 = source.split(key);
//    String str1 = arr1[1];
//    String[] arr2 = str1.split(":");
//    String str2 = arr2[2];
//    String[] arr3 = str2.split(",");
//    return arr3[0];
    return getGeneric(source, key, 1);
  }

  protected static String getGeneric(String source, String key, int instance) {
    String[] arr1 = source.split(key);
    String str1 = arr1[instance];
    String[] arr2 = str1.split(":");
    String str2 = arr2[2];
    String[] arr3 = str2.split(",");
    return arr3[0];
  }

  protected static String getGeneric4QuarterSum(String source, String key) {
    String[] arr = source.split(key);

    // Get sections of source with information
    String q1Part = arr[1];
    String q2Part = arr[2];
    String q3Part = arr[3];
    String q4Part = arr[4];

    // Get quarter data
    String q1Str = getGenericQuarter(q1Part);
    String q2Str = getGenericQuarter(q2Part);
    String q3Str = getGenericQuarter(q3Part);
    String q4Str = getGenericQuarter(q4Part);

    // Convert to usable format
    long q1 = Long.parseLong(q1Str);
    long q2 = Long.parseLong(q2Str);
    long q3 = Long.parseLong(q3Str);
    long q4 = Long.parseLong(q4Str);

    // Add quarters
    long sum = q1 + q2 + q3 + q4;

    return Long.toString(sum);
  }

  protected static String getDate(String source, String key, int instance) {
    String[] arr1 = source.split(key);
    String str1 = arr1[instance];
    String[] arr2 = str1.split(":");
    String str2 = arr2[3];
    String[] arr3 = str2.split("\"}");

    // Remove character 1 (") and return
    return arr3[0].substring(1);
  }
  
  private static String getGenericQuarter(String remainingSource) {
    if (remainingSource.startsWith("\":{}")) {
      return "0";
    }
    String[] arr2 = remainingSource.split(":");
    String str2 = arr2[2];
    String[] arr3 = str2.split(",");
    return arr3[0];
  }
}
