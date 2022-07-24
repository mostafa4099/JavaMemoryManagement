package com.mostafa.PassBy.PassByValue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.${NAME}.java: ${PROJECT_NAME}
 * @CreationDate ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        int value = 5;
        System.out.println("Initial Value: "+value); //5

        passByPrimitiveValue(value);
        System.out.println("Final Value: "+value); //5

        String name = "Golam";
        System.out.println("First Name: "+name); //Golam

        passByStringValue(name);
        System.out.println("Name: "+name); //Golam

        Integer wrapperIntValue = 5;
        System.out.println("Initial Wrapper Value: "+value); //5

        passByWrapperValue(wrapperIntValue);
        System.out.println("Final Wrapper Value: "+value); //5
    }

    public static void passByPrimitiveValue(int value) {
        value = value * value;
        System.out.println("New Value: "+value); //25
    }

    public static void passByStringValue(String name) {
        name = name + " Mostafa";
        System.out.println("Full Name: "+name); //Golam Mostafa
    }

    public static void passByWrapperValue(Integer value) {
        value = value * value;
        System.out.println("New Wrapper Value: "+value); //25
    }
}