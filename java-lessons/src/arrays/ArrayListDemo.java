package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListDemo {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());

        list.add(1, 15); // Insert 15 at index 1
        System.out.println(list);

        System.out.println(list.get(2)); // Get element at index 2

        list.remove(1); // Remove element at index 1
        System.out.println(list);

        list.add(1, 5);
        list.add(2, 5);
        System.out.println(list);

        list.remove(Integer.valueOf(5));// Remove the first occurrence of 5
        System.out.println(list);

        boolean containsFive = list.contains(5);
        System.out.println("Contains 5: " + containsFive);

        Collections.sort(list);
        Collections.binarySearch(list, 4); // Returns -1 since 4 is not in the list
        System.out.println(list);

        Integer[] arr = list.toArray(new Integer[2]);
        for (int val : arr) {
            System.out.print(val + " ");
        }

        ArrayList<Integer> splitList = new ArrayList<>(list.subList(1, list.size())); // Create sublist from index 1 to the end of the list 
        System.out.println("Split list: " + splitList);

        list.clear();
        System.out.println("Cleared list: " + list);

        // Create an arrayList with 10 random numbers
        // Remove all odd from that list
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomList.add((int) (Math.random() * 100));
        }
        System.out.println("Random list: " + randomList);

        for (int i = 0; i < randomList.size(); i++) {
            if (randomList.get(i) % 2 != 0) {
                randomList.remove(i);
                i--;
            }
        }
        System.out.println("Even numbers only: " + randomList);


        // Make a guest list that allows the user to enter names
        // if the name exists tell the user that "this person is invited!"
        // continue until you type exit
        ArrayList<String> guestList = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.print("Enter a name (or 'exit' to stop): ");
            String name = input.nextLine();
            if (name.equals("exit")) {
                break;
            }
            if (guestList.contains(name)) {
                System.out.println("This person is invited!");
            } else {
                guestList.add(name);
            }
        }
        System.out.println("Final guest list: " + guestList);

        input.close();

    // Create a list of grocery items
    // if the user types in a food print out the index
    // If not print "Not Found" and add it to the list
    // continue until you type exit
        ArrayList<String> groceryList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a grocery item: ");
            String item = scanner.nextLine();
            if (item.equals("exit")) {
                break;
            }
            if (groceryList.contains(item)) {
                int index = groceryList.indexOf(item);
                System.out.println("Item found at index: " + index);
            } else {
                System.out.println("Not Found");
                groceryList.add(item);
            }
        }
        System.out.println("Final grocery list: " + groceryList);

        scanner.close();
    }
}