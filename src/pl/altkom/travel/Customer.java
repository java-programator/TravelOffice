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

    public String getInfo() {
        return String.format("Klient: %s spod adresu %s jedzie na %s",
                name,
                address.getInfo(),
                trip.getInfo());
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
