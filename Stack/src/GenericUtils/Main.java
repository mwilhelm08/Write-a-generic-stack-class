package GenericUtils;

// Define a Main class with a main method to test GenericUtils
public class Main {
    public static void main(String[] args) {
        // Test the reverse method
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Integer Array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        GenericUtils.reverse(intArray);
        System.out.println("\nReversed Integer Array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        // Test the sum method
        System.out.println("\n\nSum of Integer Array: " + GenericUtils.sum(intArray));

        // Test with another type (Double array)
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println("\nOriginal Double Array: ");
        for (double num : doubleArray) {
            System.out.print(num + " ");
        }
        GenericUtils.reverse(doubleArray);
        System.out.println("\nReversed Double Array: ");
        for (double num : doubleArray) {
            System.out.print(num + " ");
        }

        // Test the sum method for Double array
        System.out.println("\n\nSum of Double Array: " + GenericUtils.sum(doubleArray));
    }
}

