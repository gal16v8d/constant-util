package com.gsdd.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RegexConstants {

  // u00c1 = Á, u00c9 = É, u00cd = Í, u00d3 = Ó, u00da = Ú, u00d1 = Ñ, u00dc =
  // Ü
  // u00e1 = á, u00e9 = é, u00ed = í, u00f3 = ó, u00fa = ú, u00f1 = ñ, u00fc =
  // ü
  private static final String A_MAYUS_ACCUTE = "\u00c1";
  private static final String E_MAYUS_ACCUTE = "\u00c9";
  private static final String I_MAYUS_ACCUTE = "\u00cd";
  private static final String O_MAYUS_ACCUTE = "\u00d3";
  private static final String U_MAYUS_ACCUTE = "\u00da";
  private static final String N_MAYUS_ACCENT = "\u00d1";
  private static final String U_MAYUS_ACCENT = "\u00dc";
  private static final String A_MINUS_ACCUTE = "\u00e1";
  private static final String E_MINUS_ACCUTE = "\u00e9";
  private static final String I_MINUS_ACCUTE = "\u00ed";
  private static final String O_MINUS_ACCUTE = "\u00f3";
  private static final String U_MINUS_ACCUTE = "\u00fa";
  private static final String N_MINUS_ACCENT = "\u00f1";
  private static final String U_MINUS_ACCENT = "\u00fc";
  private static final String ALPHABET = "^[A-Za-z";
  public static final String ALFA =
      ALPHABET + A_MAYUS_ACCUTE + A_MINUS_ACCUTE + E_MAYUS_ACCUTE + E_MINUS_ACCUTE + I_MAYUS_ACCUTE
          + I_MINUS_ACCUTE + O_MAYUS_ACCUTE + O_MINUS_ACCUTE + U_MAYUS_ACCENT + U_MAYUS_ACCUTE
          + U_MINUS_ACCENT + U_MINUS_ACCUTE + N_MAYUS_ACCENT + N_MINUS_ACCENT + "_0-9]+$";
  public static final String ALFA_SPACE =
      ALPHABET + A_MAYUS_ACCUTE + A_MINUS_ACCUTE + E_MAYUS_ACCUTE + E_MINUS_ACCUTE + I_MAYUS_ACCUTE
          + I_MINUS_ACCUTE + O_MAYUS_ACCUTE + O_MINUS_ACCUTE + U_MAYUS_ACCENT + U_MAYUS_ACCUTE
          + U_MINUS_ACCENT + U_MINUS_ACCUTE + N_MAYUS_ACCENT + N_MINUS_ACCENT + "_0-9\\s]+$";
  public static final String DECIMAL = "[0-9]+(\\.[0-9]+)?";
  public static final String DECIMAL_FORMAT = "#,##0.#";
  public static final String IP =
      "^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
  public static final String MAIL =
      "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
  public static final String NUMBER = "[0-9]+";
  public static final String SPACE = " +";
  public static final String TEXT =
      ALPHABET + A_MAYUS_ACCUTE + A_MINUS_ACCUTE + E_MAYUS_ACCUTE + E_MINUS_ACCUTE + I_MAYUS_ACCUTE
          + I_MINUS_ACCUTE + O_MAYUS_ACCUTE + O_MINUS_ACCUTE + U_MAYUS_ACCENT + U_MAYUS_ACCUTE
          + U_MINUS_ACCENT + U_MINUS_ACCUTE + N_MAYUS_ACCENT + N_MINUS_ACCENT + "]+$";

}
