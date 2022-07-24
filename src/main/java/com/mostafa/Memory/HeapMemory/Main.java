package com.mostafa.Memory.HeapMemory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.${NAME}.java: ${PROJECT_NAME}
 * @CreationDate ${DATE} ${TIME}
 */
public class Main {
    // string type array object created in heap memory and
    // create args reference variable of array object in stack memory.
    public static void main(String[] args) {
        // Create string type list arraylist object in heap memory and
        // create myList reference variable of the list object in stack memory.
        List<String> myList = new ArrayList<>();

        // create new string object in heap memory and
        // create reference at 0 position in previously created myList object in heap memory.
        myList.add("One");

        // create new string object in heap memory and
        // create reference at 1 position in previously created myList object in heap memory.
        myList.add("Two");

        // create string object in heap memory and
        // create reference at 0 position in previously created myList object in heap memory.
        myList.add("Three");

        printList(myList);

        // Print four elements with printList method's added one.
        System.out.println("My List: "+myList);

        //destroy first myList variable than args variable
    }

    // dataList reference variable will create in stack memory
    // which is reference of myList variable of heap memory
    // Pass by reference
    public static void printList(List<String> dataList) {
        // create reference variable in stack memory
        // which is reference of second element of list object of heap memory (myList)
        String value = dataList.get(1);

        // create string object in heap memory and
        // create reference at 0 position in already created myList/dataList object in heap memory.
        dataList.add("Four");

        System.out.println("Data List: "+ dataList);

        // destroy value and dataList reference variables from stack memory.
        // will contain newly added string object in list. because it contains in heap memory.
        // pass by reference
    }
}