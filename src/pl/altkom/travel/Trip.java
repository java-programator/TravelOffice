package pl.altkom.travel;

public class Trip {
    private Date start;
    private Date end;
    private String destination;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Trip(Date start, Date end, String destination, double price) {
        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Wycieczka do %s, od %s do %s, kosztuje %s",
                destination,
                start.toString(),
                end.toString(),
                getPrice());
    }
}
