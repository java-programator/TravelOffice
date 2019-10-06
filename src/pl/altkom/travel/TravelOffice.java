package pl.altkom.travel;

import java.util.*;

public class TravelOffice {
    private Set<Customer> customers;
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

    public String toString() {
        String result = "";
        for (Customer c : customers) {
            result += c.toString() + System.lineSeparator();
        }
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TravelOffice)) return false;
        TravelOffice that = (TravelOffice) o;
        return Objects.equals(customers, that.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customers);
    }

    public void addTrip(String id, Trip trip) {
        trips.put(id, trip);
    }

    public boolean removeTrip(String id) {
        if (trips.containsKey(id)) {
            trips.remove(id);
            return true;
        } else {
            return false;
        }
    }

    public Customer findCustomerByName(String name) {
        for (Customer c : customers) {
            if (c.getName().equals(name)) {
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

    public Map<String, Trip> getTrips() {
        return trips;
    }
}
