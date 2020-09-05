package chapter01.price;

import chapter01.Movie;

public class RegularPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getAmount(int daysRented) {
        double thisAmount = 0;
        thisAmount += 1.5;
        if (daysRented > 3) {
            thisAmount += (daysRented - 3) * 1.5;
        }
        return thisAmount;
    }
}
