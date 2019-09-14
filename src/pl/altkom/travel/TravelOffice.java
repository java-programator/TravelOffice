package pl.altkom.travel;

public class TravelOffice {
    Customer customers[];
    int customersCounter;
    int maxSize;

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
}
