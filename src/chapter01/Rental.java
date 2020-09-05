package chapter01;

public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double amountFor() {
        return _movie.amountFor(getDaysRented());
    }

    public int getFrequentRenterPoints() {
        // add bonus for a two day new release rental
        if ((getMovie().get_priceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1) {
            return 2;
        }
        return 1;
    }
}
