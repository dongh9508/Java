// https://en.wikipedia.org/wiki/Strategy_pattern
package Java_extend;

import java.util.*;

public class StrategyPatternWiki {
    public static void main(final String[] arguments) {
        // Prepare strategies
        BillingStrategy normalStrategy    = new NormalStrategy();
        BillingStrategy happyHourStrategy = new HappyHourStrategy();
        BillingStrategy membershipStrategy = new MemberShipStrategy();

        Customer firstCustomer = new Customer(normalStrategy);

        // Normal billing
        firstCustomer.add(1.0, 1);

        // Start Happy Hour
        firstCustomer.setStrategy(happyHourStrategy);
        firstCustomer.add(1.0, 2);

        // New Customer
        Customer secondCustomer = new Customer(happyHourStrategy);
        secondCustomer.add(0.8, 1);
        // The Customer pays
        firstCustomer.printBill();

        // End Happy Hour
        secondCustomer.setStrategy(normalStrategy);
        secondCustomer.add(1.3, 2);
        secondCustomer.add(2.5, 1);
        secondCustomer.printBill();

        // New Customer
        Customer thirdCustomer = new Customer(membershipStrategy);
        thirdCustomer.add(1.0, 2);
        thirdCustomer.add(1.5, 1);
        thirdCustomer.printBill();
    }
}


class Customer {

    private List<Double> drinks;
    private BillingStrategy strategy;

    public Customer(final BillingStrategy strategy) {
        this.drinks = new ArrayList<Double>();
        this.strategy = strategy;
    }

    public void add(final double price, final int quantity) {
        drinks.add(strategy.getActPrice(price*quantity));
    }

    // Payment of bill
    public void printBill() {
        double sum = 0;
        for (Double i : drinks) {
            sum += i;
        }
        System.out.println("Total due: " + sum);
        drinks.clear();
    }

    // Set Strategy
    public void setStrategy(final BillingStrategy strategy) {
        this.strategy = strategy;
    }

}

interface BillingStrategy {
    double getActPrice(final double rawPrice);
}

// Normal billing strategy (unchanged price)
class NormalStrategy implements BillingStrategy {

    @Override
    public double getActPrice(final double rawPrice) {
        return rawPrice;
    }

}

// Strategy for Happy hour (50% discount)
class HappyHourStrategy implements BillingStrategy {

    @Override
    public double getActPrice(final double rawPrice) {
        return rawPrice*0.5;
    }

}

// Strategy for MemberShip (70% discount)
class MemberShipStrategy implements BillingStrategy {

    @Override
    public double getActPrice(final double rawPrice) {
        return rawPrice*0.7;
    }

}