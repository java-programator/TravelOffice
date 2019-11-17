package pl.altkom.travel;

import java.util.*;

public class TravelOffice {
    private static TravelOffice instance = null;

    public static TravelOffice getInstance() {
        if (instance == null) {
            instance = new TravelOffice();
        }
        return instance;
    }

    private Set<Customer> customers;
    private Map<String, Trip> trips;

    private TravelOffice() {
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

    public void removeTrip(String id) throws NoSuchTripException {
        if (trips.containsKey(id)) {
            trips.remove(id);
        }
        throw new NoSuchTripException("Taka wycieczka nie istnieje!");
    }

    public Customer findCustomerByName(String name) throws NoSuchCustomerException {
        for (Customer c : customers)
        {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        throw new NoSuchCustomerException("Takiego klienta nie ma w bazie danych.");
    }

    public void removeCustomer(Customer c) throws NoSuchCustomerException {
        if (!customers.remove(c)) {
            throw new NoSuchCustomerException("Taki klient nie istnieje!");
        }
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public Map<String, Trip> getTrips() {
        return trips;
    }
}
