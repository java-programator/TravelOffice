package pl.altkom.travel;

public class Customer {
    String name;
    Address address;
    Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void assignTrip(Trip t) {
        trip = t;
    }

    public String getInfo() {
        return String.format("Klient: %s spod adresu %s jedzie na %s",
                name,
                address.getInfo(),
                trip.getInfo());
    }
}
