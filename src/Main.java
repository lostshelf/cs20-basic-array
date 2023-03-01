import java.util.Random;

public class Main {
    public static Random rand = new Random();
    public static void main(String[] args) {
        // Using the actual classes instead of the primitives otherwise I can't print them out with the function I made
        // Should still be exactly the same except it makes my life easier this way

        // Question 2
        Double[] doubleArray = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7};
        printArray(doubleArray);

        // Question 4
        Integer[] intArray = new Integer[rand.nextInt(21) + 5];
        printArray(intArray);

        // Question 6
        // Create two arrays of 5 Strings (assign the Strings any text you want). Combine them into a new array
        // (this is called "concatenation"). EXTRA: Create two String arrays with a random size from 4 to 8 elements.
        // Concatenate these two arrays.
        String[] stringArray1 = new String[rand.nextInt(5) + 4];
        String[] stringArray2 = new String[rand.nextInt(5) + 4];

        String[] combined = new String[stringArray1.length + stringArray2.length];
        System.arraycopy(stringArray1, 0, combined, 0);
    }

    public static <T> void printArray(T[] arr) {
        for (T i : arr)
            System.out.print(i + " ");
    }
}