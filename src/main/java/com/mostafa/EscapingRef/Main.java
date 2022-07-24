package com.mostafa.EscapingRef;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

		//Violate the encapsulation rules. Able to clear private field value.
		records.getCustomers().clear();

        for (Customer customer : records.getCustomers().values()) {
            System.out.println(customer);
        }
    }

}
