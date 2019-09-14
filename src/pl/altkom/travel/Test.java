package pl.altkom.travel;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Paweł");

        Address addres = new Address("Os. Strusia", "Kraków", "31-900");
        customer.setAddress(addres);

        Date start = new Date(2019, 8, 15);
        Date end = new Date(2019, 8, 31);
        Trip trip = new Trip(start, end, "Zakopane");

        customer.assignTrip(trip);

        System.out.println(customer.getInfo());

    }
}
