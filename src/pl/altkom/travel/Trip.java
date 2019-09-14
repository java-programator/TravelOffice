package pl.altkom.travel;

public class Trip {
    Date start;
    Date end;
    String destination;

    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }

    public String getInfo() {
        return String.format("Wycieczka do %s, od %s do %s",
                destination,
                start.getInfo(),
                end.getInfo());
    }
}
