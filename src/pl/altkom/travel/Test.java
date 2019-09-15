package pl.altkom.travel;

public class Test {

    public static void main(String[] args) {
        TravelOffice office = new TravelOffice();

        Customer c1 = new Customer("Paweł");
        Address addres = new Address("Os. Strusia", "Kraków", "31-900");
        c1.setAddress(addres);
        Date start = new Date(2019, 8, 15);
        Date end = new Date(2019, 8, 31);
        Trip trip = new Trip(start, end, "Zakopane", 1700);
        c1.assignTrip(trip);
        office.addCustomer(c1);

        Customer c2 = new Customer("Bozydar");
        c2.setAddress(new Address("Matejki", "Kraków", "30-008"));
        c2.assignTrip(new Trip(
                new Date(2020, 2, 1),
                new Date(2020, 2, 14),
                "Radom",
                1500));
        office.addCustomer(c2);

        //System.out.println(office.toString());

        Trip domestic1 = new DomesticTrip(
                new Date(2019, 10, 5),
                new Date(2019, 10, 20),
                "Malbork",
                2000,
                200);

        Trip abroad1 = new AbroadTrip(
                new Date(2019, 10, 5),
                new Date(2019, 10, 20),
                "Palma de Mallorca",
                2700,
                50);

        Customer c3 = new Customer("Józek");
        c3.setAddress(new Address("Balicka", "Kraków", "31-484"));
        c3.assignTrip(domestic1);
        office.addCustomer(c3);

        Customer c4 = new Customer("Marian");
        c4.setAddress(new Address("Podwale", "Kraków", "31-555"));
        c4.assignTrip(abroad1);
        office.addCustomer(c4);

        System.out.println(office.toString());
        System.out.println(office.toString());





    }

}
