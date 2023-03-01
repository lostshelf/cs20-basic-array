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
    }

    public static <T> void printArray(T[] arr) {
        for (T i : arr)
            System.out.print(i + " ");
    }
}