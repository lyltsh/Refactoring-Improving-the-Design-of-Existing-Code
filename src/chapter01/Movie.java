package chapter01;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public int get_priceCode() {
        return _priceCode;
    }

    public void set_priceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }

    public double amountFor(int daysRented) {
        double thisAmount = 0;
        switch (get_priceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (daysRented > 2) {
                    thisAmount += (daysRented - 2) * 1.5;
                }
                break;
            case Movie.CHILDRENS:
                thisAmount += daysRented * 3;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += 1.5;
                if (daysRented > 3) {
                    thisAmount += (daysRented - 3) * 1.5;
                }
                break;
            default:
                break;
        }
        return thisAmount;
    }

    public int getFrequentRenterPoints(int daysRented) {
        // add bonus for a two day new release rental
        if ((get_priceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
