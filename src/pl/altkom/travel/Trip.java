package pl.altkom.travel;

import java.util.Objects;

public abstract class Trip {
    private Date start;
    private Date end;
    private String destination;
    private double price;

    public Trip(Date start, Date end, String destination, double price) {
        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price = price;
    }

    public String toString() {
        return String.format("Wycieczka do %s, od %s do %s, za %f",
                destination,
                start.toString(),
                end.toString(),
                getPrice());
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trip)) return false;
        Trip trip = (Trip) o;
        return Double.compare(trip.price, price) == 0 &&
                Objects.equals(start, trip.start) &&
                Objects.equals(end, trip.end) &&
                Objects.equals(destination, trip.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, destination, price);
    }
}
