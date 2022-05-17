package com.gsdd.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class LoadConstants {

  public static final String IMPORT = "/sql/import.sql";
  public static final String GSDD_HOME = "GSDD_HOME";
  public static final String GRAL_PROPERTIES = "/gsdd.properties";

  public static String getHome() {
    return System.getenv(GSDD_HOME);
  }
}
