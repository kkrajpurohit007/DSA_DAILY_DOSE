package arrays;

public class BasicArrayOperations {


    public static void main(String[] args) {
       // 1. Declare and initialize an array
        int[] number = { 10, 20, 30, 40, 50 };

        // 2.  Declare an array Then initialize it
        int[] arr ; // Declaration
        arr = new int[]{ 1, 2, 3, 4, 5 }; // Initialization

        // 3. Declare an array with a specific size
        int[] myArray = new int[5]; // Array of size 5 Or  allocating memory for 5 integers.
        myArray[0] = 100; // Assigning value to the first element
        myArray[1] = 200; // Assigning value to the second element
        myArray[2] = 300; // Assigning value to the third element

        // 4. Accessing array elements
        System.out.println("First element: " + number[0]); // Output: 10
        System.out.println("Second element: " + number[1]); // Output: 20

        // 5. Modifying array elements
        number[2] = 35; // Changing the third element from 30 to

        System.out.println("Modified third element: " + number[2]); // Output: 35

        // 6. Looping through an array
        System.out.println("Array elements:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        // 7. Using enhanced for loop
        System.out.println("Array elements using enhanced for loop:");
        for (int num : number) {
            System.out.println(num);
        }

        // 8. Getting the length of an array
        System.out.println("Length of the array: " + number.length); // Output:



    }
}
