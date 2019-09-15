package pl.altkom.travel;

public class Customer {
    private String name;
    private Address address;
    private Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void assignTrip(Trip t) {
        trip = t;
    }

    public String toString() {
        return String.format("Klient: %s spod adresu %s jedzie na %s",
                name,
                address.toString(),
                trip.toString());
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Trip getTrip() {
        return trip;
    }
}
