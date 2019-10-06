package pl.altkom.travel;

import java.util.*;

public class TravelOffice {
    private Set<Customer> customers;
    private int customersCounter;
    private int maxSize;
    private Map<String, Trip> trips;

    public TravelOffice() {
        customers = new HashSet<>();
        trips = new HashMap<>();
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public int getCustomersCount() {
        return customers.size();
    }

//    public String toString() {
//        String result = "";
//        for (int i = 0; i < customersCounter; i++) {
//            result += customers[i].toString() + System.lineSeparator();
//        }
//        return result;
//    }


    @Override
    public String toString() {
        return "TravelOffice{" +
                "customers=" + Arrays.toString(customers) +
                ", customersCounter=" + customersCounter +
                ", maxSize=" + maxSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TravelOffice)) return false;
        TravelOffice that = (TravelOffice) o;
        return customers.equals(that.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customers);
    }

    public void addTrip(String s, Trip t){
        trips.put(s, t);
    }

    public boolean removeTrip(String id){
        if (trips.containsKey(id)){
            trips.remove(id);
            return true;
        }
        return false;
    }

    public Customer findCustomerByName(String name){
        for (Customer c : customers){
            if (c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }

    public boolean removeCustomer(Customer c) {
        return customers.remove(c);
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public int getCustomersCounter() {
        return customersCounter;
    }

    public void setCustomersCounter(int customersCounter) {
        this.customersCounter = customersCounter;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Map<String, Trip> getTrips() {
        return trips;
    }

    public void setTrips(Map<String, Trip> trips) {
        this.trips = trips;
    }


}
