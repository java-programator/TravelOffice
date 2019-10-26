package pl.altkom.travel;

public class Test2 {
    public static void main(String[] args) {
        TravelOffice o1 = TravelOffice.getInstance();
        TravelOffice o2 = TravelOffice.getInstance();

        if (o1 == o2) {
            System.out.println("To są te same obiekty");
        } else {
            System.out.println("To są różne obiekty");
        }
    }
}
