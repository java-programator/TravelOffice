package pl.altkom.travel;

public class DomesticTrip extends Trip{

    private int ownArrivalDiscount;

    public DomesticTrip(Date start, Date end, String destination, double price, int ownArrivalDiscount){
        super(start, end, destination, price);
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(int ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() - ownArrivalDiscount;
    }
}
