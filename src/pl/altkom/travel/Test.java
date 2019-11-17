package pl.altkom.travel;

import pl.altkom.travel.exceptions.NoSuchCustomerException;
import pl.altkom.travel.exceptions.NoSuchTripException;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Paweł");

        Address addres = new Address("Os. Strusia", "Kraków", "31-900");
        customer.setAddress(addres);

        Date start = new Date(2019, 8, 15);
        Date end = new Date(2019, 8, 31);
        Trip trip = new DomesticTrip(start, end, "Zakopane", 1000, 200);

        customer.assignTrip(trip);

//        System.out.println(customer.getInfo());

        TravelOffice office = TravelOffice.getInstance();
        office.addCustomer(customer);

        Customer c2 = new Customer("Bożydar");
        c2.setAddress(new Address("Matejki", "Kraków", "30-008"));
        c2.assignTrip(new AbroadTrip(
                new Date(2020, 2, 1),
                new Date(2020, 2, 14),
                "Radom",
                200,
                300
        ));
        office.addCustomer(c2);

        Customer c3 = new Customer("Brajanusz");
        c3.setAddress(new Address("Rzeźnicza", "Kraków", "30-123"));
        c3.assignTrip(new AbroadTrip(
                new Date(2019, 12, 24),
                new Date(2020, 1, 6),
                "Sosnowiec",
                400,
                100
        ));
        office.addCustomer(c3);

        System.out.println(office);
//        System.out.println(office.toString());
        final Date finalDate = new Date(2019, 10, 1);
//        finalDate = new Date(2019, 11, 11);
        finalDate.setDay(2);

        office.addTrip("Bahamy",
                new AbroadTrip(
                        new Date(2020, 1, 1),
                        new Date(2020, 1, 15),
                        "Bahamy",
                        5000,
                        500));

        Customer customer1;

        try {
            customer1 = office.findCustomerByName("Paweł");
            office.removeCustomer(customer1);
        } catch (NoSuchCustomerException e) {
            e.printStackTrace();
        }

        try {
            office.removeTrip("Bahamy");
        } catch (NoSuchTripException e) {
            e.printStackTrace();
        }
    }
}
