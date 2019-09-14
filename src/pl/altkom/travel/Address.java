package pl.altkom.travel;

public class Address {
    String street;
    String city;
    String zip;

    public Address(String street, String city, String zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public String getInfo() {
        return street + ", " + zip + " " + city;
    }
}
