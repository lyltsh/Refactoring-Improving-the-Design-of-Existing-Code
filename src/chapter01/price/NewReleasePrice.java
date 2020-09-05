package chapter01.price;

import chapter01.Movie;

public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getAmount(int daysRented) {
        double thisAmount = 0;
        thisAmount += daysRented * 3;
        return thisAmount;
    }
}
