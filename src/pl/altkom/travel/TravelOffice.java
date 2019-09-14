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



    public static void main(String[] args) {
        Customer customer = new Customer("Paweł");

        Address addres = new Address("Os. Strusia", "Kraków", "31-900");
        customer.setAddress(addres);

        Date start = new Date(2019, 8, 15);
        Date end = new Date(2019, 8, 31);
        Trip trip = new Trip(start, end, "Zakopane");

        customer.assignTrip(trip);

        System.out.println(customer.getInfo());

        Customer[] customerArray = new Customer[2];

    }
}
