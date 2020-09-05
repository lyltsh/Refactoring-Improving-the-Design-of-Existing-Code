package chapter01;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    //生成详单的函数
    public String statement() {

        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {

            Rental rental = (Rental) rentals.nextElement();

            frequentRenterPoints += rental.getFrequentRenterPoints();

            // show fingures for this rental
            result += "\t" + rental.getMovie().get_title() + "\t" + String.valueOf(rental.amountFor()) + "\n";
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    private double getTotalCharge() {
        double totalAmount = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {

            Rental rental = (Rental) rentals.nextElement();

            totalAmount += rental.amountFor();
        }
        return totalAmount;
    }

}
