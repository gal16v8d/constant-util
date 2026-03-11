package com.gsdd.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RegexConstants {

  public static final String ALFA = "^[A-Za-zÁÉÍÓÚÜáéíóúüÑñ_0-9]+$";
  public static final String ALFA_SPACE = "^[A-Za-zÁÉÍÓÚÜáéíóúüÑñ_0-9\\s]+$";
  public static final String DECIMAL = "[0-9]+(\\.[0-9]+)?";
  public static final String DECIMAL_FORMAT = "#,##0.#";
  public static final String IP =
      "^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
  public static final String MAIL =
      "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
  public static final String NUMBER = "[0-9]+";
  public static final String SPACE = " +";
  public static final String TEXT = "^[A-Za-zÁÉÍÓÚÜáéíóúüÑñ]+$";
}
