import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Get the size of the ArrayList
        int size = fruits.size();

        // Print the elements of the ArrayList
        for (int i = 0; i < size; i++) {
            System.out.println(fruits.get(i));
        }

        // Remove an element from the ArrayList
        fruits.remove("Banana");

        // Print the elements of the ArrayList again
        for (int i = 0; i < size; i++) {
            System.out.println(fruits.get(i));
        }

    }
}
