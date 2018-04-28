/**
 * currency
 */
public class Currency {
    private String fullName;
    private String abbreviation;
    private int factor;

    public static Currency EUR("euro", "EUR");
    public static Currency USD("US dollar", "USD");
    public static Currency AUD("Australian dollar", "AUD");
    public static Currency CAD("Canadian dollar", "CAD");
    public static Currency NZD("New Zealand dollar", "NZD");
    public static Currency GBP("Great Britain pound", "GBP");
    public static Currency CHF("", "CHF");
    public static Currency JPY("yen", "JPY", 100);

    private Currency(String fullName, String abbreviation) {
        this(fullName, abbreviation, 1)
    }

    private Currency(String fullName, String abbreviation, int factor) {
        this.fullName = fullName;
        this.abbreviation = abbreviation;
        this.factor = factor;
    }
    
    public String getFullName() {
        return fullName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getFactor() {
        return factor;
    }

}