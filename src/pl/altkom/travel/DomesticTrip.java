package pl.altkom.travel;

import java.util.Objects;

public class DomesticTrip extends Trip {
    private double ownArrivalDiscount;

    public DomesticTrip(Date start, Date end, String destination, double price, double ownArrivalDiscount) {
        super(start, end, destination, price);
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() - ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(double ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DomesticTrip)) return false;
        if (!super.equals(o)) return false;
        DomesticTrip that = (DomesticTrip) o;
        return Double.compare(that.ownArrivalDiscount, ownArrivalDiscount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ownArrivalDiscount);
    }
}
