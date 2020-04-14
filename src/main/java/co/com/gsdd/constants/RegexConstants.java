package co.com.gsdd.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RegexConstants {

    // u00c1 = Á, u00c9 = É, u00cd = Í, u00d3 = Ó, u00da = Ú, u00d1 = Ñ, u00dc =
    // Ü
    // u00e1 = á, u00e9 = é, u00ed = í, u00f3 = ó, u00fa = ú, u00f1 = ñ, u00fc =
    // ü
    public static final String ALFA = "^[A-Za-z\u00c1\u00c9\u00cd\u00d3\u00da\u00e1\u00e9\u00ed\u00f3\u00fa\u00d1\u00f1\u00dc\u00fc_0-9]+$";
    public static final String ALFA_SPACE = "^[A-Za-z\u00c1\u00c9\u00cd\u00d3\u00da\u00e1\u00e9\u00ed\u00f3\u00fa\u00d1\u00f1\u00dc\u00fc_0-9\\s]+$";
    public static final String DECIMAL = "[0-9]+(\\.[0-9]+)?";
    public static final String DECIMAL_FORMAT = "#,##0.#";
    public static final String IP = "^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
    public static final String MAIL = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
    public static final String NUMBER = "[0-9]+";
    public static final String SPACE = " +";
    public static final String TEXT = "^[A-Za-z\u00c1\u00c9\u00cd\u00d3\u00da\u00e1\u00e9\u00ed\u00f3\u00fa\u00d1\u00f1\u00dc\u00fc]+$";

}
