package com.mostafa.PassBy.PassByObject;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.${NAME}.java: ${PROJECT_NAME}
 * @CreationDate ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("Mostafa");
        System.out.println("Name: " + c.getName()); //mostafa

        renameCustomer(c);
        System.out.println("Renamed Customer: " + c.getName()); //Golam Mostafa
    }

    public static void renameCustomer(Customer c) {
        c.setName("Golam Mostafa");
        System.out.println("New Name: " + c.getName()); //Golam Mostafa
    }
}