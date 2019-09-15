package pl.altkom.travel;

public class TravelOffice {
    private Customer customers[];
    private int customersCounter;
    private int maxSize;

    public TravelOffice() {
        maxSize = 2;
        customers = new Customer[maxSize];
        customersCounter = 0;
    }

    public void addCustomer(Customer c) {
        if (customersCounter >= maxSize) {
            maxSize *= 2;
            Customer newCustomers[] = new Customer[maxSize];
            for (int i = 0; i < customers.length; i++) {
                newCustomers[i] = customers[i];
            }
            customers = newCustomers;
        }
        customers[customersCounter] = c;
        customersCounter++;
    }

    public int getCustomersCount() {
        return customersCounter;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < customersCounter; i++) {
            result += customers[i].toString() + System.lineSeparator();
        }
        return result;
    }

}
