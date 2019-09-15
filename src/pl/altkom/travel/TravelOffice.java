package pl.altkom.travel;

public class TravelOffice {

    Customer customersArray[];
    int customerCounter;

    public TravelOffice(){
        customersArray = new Customer[2];
        customerCounter = 0;
    }

    public void addCustomer(Customer c){
        int size = customersArray.length;
        /*
        stare rozwiązanie - dłuższe
        if(customerCounter < size){
            customersArray[customerCounter] = c;
            customerCounter++;
        } else{
            size *= 2;
            Customer[] newCustomersArray = new Customer[size];
            for(int i=0; i<customersArray.length; i++){
                newCustomersArray[i] = customersArray[i];
            }
            newCustomersArray[customerCounter] = c;
            customerCounter++;
            customersArray = newCustomersArray;
        }
         */

        // rozwiązanie krótsze
        if(customerCounter >= size){
            size *= 2;
            Customer[] newCustomersArray = new Customer[size];
            for(int i=0; i<customersArray.length; i++){
                newCustomersArray[i] = customersArray[i];
            }
            customersArray = newCustomersArray;
        }
        customersArray[customerCounter] = c;
        customerCounter++;
    }

    public int getCustomerCount(){
        return customerCounter;
    }

    public String getInfo(){
        String result = "";
        for(int i=0; i<customerCounter; i++){
            result += customersArray[i].getInfo();
        }
        return result;
    }

    public static void main(String[] args) {
        TravelOffice office = new TravelOffice();

        Customer c1 = new Customer("Paweł");
        Address addres = new Address("Os. Strusia", "Kraków", "31-900");
        c1.setAddress(addres);
        Date start = new Date(2019, 8, 15);
        Date end = new Date(2019, 8, 31);
        Trip trip = new Trip(start, end, "Zakopane");
        c1.assignTrip(trip);
        office.addCustomer(c1);

        Customer c2 = new Customer("Bozydar");
        c2.setAddress(new Address("Matejki", "Kraków", "30-008"));
        c2.assignTrip(new Trip(
                new Date(2020, 2, 1),
                new Date(2020, 2, 14),
                "Radom"));
        office.addCustomer(c2);

        System.out.println(office.getInfo());

    }
}
