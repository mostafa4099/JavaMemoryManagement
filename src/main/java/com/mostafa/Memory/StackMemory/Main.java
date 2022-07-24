package com.mostafa.Memory.StackMemory;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.${NAME}.java: ${PROJECT_NAME}
 * @CreationDate ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        // Second element of stack memory. First element will be reference of args variable.
        // Not accessible from outside the main thread.
        // Primitive type. So, will not allocate head memory like args variable.
        int value = 7;

        // reassign calculated value. Won't allocate new space.
        value = calculate(value);
        System.out.println(value);

        //destroy first value variable than args variable
    }

    // data variable will allocate new space in stack memory with value 7.
    // Will be place in stack memory top of 'value' variable.
    public static int calculate(int data) {
        // allocate new space in stack memory top of 'data' variable.
        int tempValue = data + 3;
        // allocate new space in stack memory top of 'tempValue' variable.
        int newValue = tempValue * 2;

        //destroy first newValue variable than tempValue variable.
        return newValue;

        //destroy data variable.
    }
}