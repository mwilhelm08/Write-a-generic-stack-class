package GenericUtils;
// Define the GenericUtils class with generic methods
public class GenericUtils {

    // Method to reverse an array in place
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;

        // Swap elements in-place to reverse the array
        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // Method to calculate the sum of an array of Numbers
    public static <T extends Number> double sum(T[] array) {
        double total = 0;

        // Loop through the array and add each element to the sum
        for (T num : array) {
            total += num.doubleValue();
        }

        return total;
    }
}