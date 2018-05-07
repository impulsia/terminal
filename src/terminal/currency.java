package terminal;
/**
 * currency
 */
public class currency {
    private String fullName;
    private String abbreviation;
    private int factor;

    public static currency EUR("euro", "EUR");
    public static currency USD("US dollar", "USD");
    public static currency AUD("Australian dollar", "AUD");
    public static currency CAD("Canadian dollar", "CAD");
    public static currency NZD("New Zealand dollar", "NZD");
    public static currency GBP("Great Britain pound", "GBP");
    public static currency CHF("Swidden franc", "CHF");
    public static currency JPY("Japanese yen", "JPY", 100);

    private currency(String fullName, String abbreviation) {
        this(fullName, abbreviation, 1);
    }

    private currency(String fullName, String abbreviation, int factor) {
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