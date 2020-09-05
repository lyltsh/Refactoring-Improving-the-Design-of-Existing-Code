package chapter01.price;

public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getAmount(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
