package module1;

import java.util.ArrayList;

public class Asn5 {

    public static void main(String[] args) {

        // Create two ArrayLists: one for strings and one for integers
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 4 items to each list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display the original fruits list
        System.out.println("Original Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Display the original numbers list
        System.out.println("\nOriginal Numbers List:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Use two extra ArrayList methods
        fruits.remove(1);   // removes Banana
        numbers.remove(2);  // removes 30

        fruits.set(1, "Pineapple"); // replaces Orange
        numbers.set(0, 99);         // replaces 10

        // Display the updated fruits list
        System.out.println("\nUpdated Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Display the updated numbers list
        System.out.println("\nUpdated Numbers List:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}