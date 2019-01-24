package Chapter07;

import java.util.ArrayList;
/**
 * program to see array list
 *
 * @author Zion Oyedokun
 */
import java.util.Scanner;

public class P7 {

    /**
     * main method
     *
     * @param args ask user how many numbers are there
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create the array
        System.out.print("How many numbers will be read: ");
        int numbers = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>(numbers);

        fillArray(list, input, numbers);
        System.out.println("The average is " + average(list));
        displayArray(list);
    }

    /**
     * list has input added
     *
     * @param list array list
     * @param input scanner object
     * @param number array capacity
     */
    public static void fillArray(ArrayList<Integer> list, Scanner input, int number) {
        System.out.print("Enter " + number + " elements: ");
        for (int i = 0; i < number; i++) {
            list.add(input.nextInt());
        }
    }

    /**
     * average method
     *
     * @param list array list
     * @return average
     */
    public static double average(ArrayList<Integer> list) {
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }

        return sum / list.size();
    }

    /**
     * prints the array
     *
     * @param list is printed
     */
    public static void displayArray(ArrayList<Integer> list) {
        System.out.println("The contents of the array: " + list);
    }
}
