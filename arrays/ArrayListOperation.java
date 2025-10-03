package arrays;

public class ArrayListOperation {

    public static void main(String[] args) {
        // 1. Importing the ArrayList class
        // import java.util.ArrayList; // This line is at the top of the file

        // 2. Creating an ArrayList
        java.util.ArrayList<String> fruits = new java.util.ArrayList<>();

        // 3. Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 4. Accessing elements in the ArrayList
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // 5. Modifying elements in the ArrayList
        fruits.set(1, "Blueberry"); // Changing "Banana" to "Blueberry"
        System.out.println("Modified second fruit: " + fruits.get(1)); // Output: Blueberry

        // 6. Removing elements from the ArrayList
        fruits.remove(2); // Removing "Cherry"
        System.out.println("Fruits after removal: " + fruits); // Output: [Apple, Blueberry]

        // 7. Looping through an ArrayList
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 8. Getting the size of the ArrayList
        System.out.println("Number of fruits: " + fruits.size()); // Output: 2

        // 9. Checking if the ArrayList contains a specific element
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Contains Apple: " + hasApple); // Output: true

        // 10. Clearing all elements from the ArrayList
        fruits.clear();
        System.out.println("Fruits after clearing: " + fruits); // Output: []
    }
}
