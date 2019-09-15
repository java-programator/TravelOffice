package pl.altkom.travel;

public class TravelOffice {

    private Customer customersArray[];
    private int customerCounter;

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

    @Override
    public String toString(){
        String result = "";
        for(int i=0; i<customerCounter; i++){
            result += customersArray[i].toString() + System.lineSeparator();
        }
        return result;
    }


}
