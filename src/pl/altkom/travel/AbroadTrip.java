package pl.altkom.travel;

import java.util.Objects;

public class AbroadTrip extends Trip {
    private double insurance;

    public AbroadTrip(Date start, Date end, String destination, double price, double insurance) {
        super(start, end, destination, price);
        this.insurance = insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + insurance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbroadTrip)) return false;
        if (!super.equals(o)) return false;
        AbroadTrip that = (AbroadTrip) o;
        return Double.compare(that.insurance, insurance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), insurance);
    }
}
