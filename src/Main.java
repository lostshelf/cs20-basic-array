import java.util.Arrays;
import java.util.Random;

public class Main {
    public static Random rand = new Random();
    public static void main(String[] args) {
        two();
        four();
        six();
        sixExtra();
        System.out.println(eight());

        // These were added for better formatting
        System.out.println("---------");

        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(eightExtra(arr));
        System.out.println("---------");
        System.out.println(ten(arr, arr.clone()));
        System.out.println("---------");
    }
    // Using the actual classes instead of the primitives in some functions as otherwise I can't print them out with the function I made
    // Should still be exactly the same except it makes my life easier this way
    // I can redo it with the actual primitive types instead if you want

    // Question 2
    static void two() {
        Double[] doubleArray = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7};
        for (int i = doubleArray.length - 1; i >= 0; i--)
            System.out.print(doubleArray[i] + " ");

        System.out.println();
        System.out.println("---------");
    }

    // Question 4
    static void four() {
        Integer[] intArray = new Integer[rand.nextInt(21) + 5];
        printArray(intArray);

        System.out.println("---------");
    }

    // Question 6
    static void six() {
        // Initial array
        String[] stringArray1 = { "a", "b", "c", "d", "e" };
        String[] stringArray2 = { "a", "b", "c", "d", "e" };

        // New array that will hold both of the above arrays
        String[] combined = new String[stringArray1.length + stringArray2.length];

        // Copy the first array, starting from the first element of both arrays
        System.arraycopy(stringArray1, 0, combined, 0, stringArray1.length);

        // Copy the second array, starting from the first element and adding it onto the end of the combined array
        System.arraycopy(stringArray2, 0, combined, stringArray1.length, stringArray2.length);

        printArray(stringArray1);
        printArray(stringArray2);
        printArray(combined);

        System.out.println("---------");
    }

    // Question 6 EXTRA
    static void sixExtra() {
        // Create two arrays of 5 Strings (assign the Strings any text you want). Combine them into a new array
        // (this is called "concatenation"). EXTRA: Create two String arrays with a random size from 4 to 8 elements.
        // Concatenate these two arrays.
        String[] stringArray1 = new String[rand.nextInt(5) + 4];
        String[] stringArray2 = new String[rand.nextInt(5) + 4];

        String[] combined = new String[stringArray1.length + stringArray2.length];
        System.arraycopy(stringArray1, 0, combined, 0, stringArray1.length);
        System.arraycopy(stringArray2, 0, combined, stringArray1.length, stringArray2.length);

        // Prints out null since the values aren't set, but it prints out the right amount of nulls, so I think it's fine?
        printArray(stringArray1);
        printArray(stringArray2);
        printArray(combined);

        System.out.println("---------");
    }

    // Create an array of 10 random integer values and output whether it is sorted in ascending order or not
    // (sorted means that every element is less than or equal to the next element). BONUS: Extend this method to accept
    // the array of data to check as a parameter, so users can pass in an array and see if it is sorted.
    static boolean eight() {
        Integer[] intArray = new Integer[10];

        for (int i = 0; i < intArray.length; i++)
            intArray[i] = rand.nextInt(11);

        printArray(intArray);

        return Arrays.equals(intArray, Arrays.stream(intArray).sorted().toArray());
    }

    static boolean eightExtra(int[] arr) {
        // Check if the original array is equal to the sorted array
        return Arrays.equals(arr, Arrays.stream(arr).sorted().toArray());
    }

    static int ten(int[] a, int[] b) {
        // Filter out elements that aren't in both arrays
        return Arrays.stream(a)
            .filter(x -> {
                // Loop through all the elements and return true if it is in both arrays otherwise, return false
                for (int i : b)
                    if (i == x)
                        return true;

                return false;
            })
            // Convert the IntStream from the filter function into an array and return its length
            .toArray()
            .length;
    }

    public static <T> void printArray(T[] arr) {
        // Loop through array and print every element
        for (T i : arr)
            System.out.print(i + " ");

        // Print a new line for better formatting
        System.out.println();
    }
}