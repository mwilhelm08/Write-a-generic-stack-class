package Stack;

/**
 * Test class to demonstrate the functionality of the Stack.Stack class.
 * It tests both integer and string stack scenarios, verifying push, pop, peek, and list methods.
 */
public class TestStack {
    /**
     * Main method to run the test cases for the Stack.Stack class.
     * It demonstrates the usage of a Stack.Stack with Integer and String types.
     *
     * @param args command line arguments (not used in this case)
     */
    public static void main(String[] args) {
        // Test case 1: Test number stack
        System.out.println("Testing Number Stack.Stack...");
        Stack<Integer> numberStack = new Stack<>(5); // Stack.Stack with capacity of 5

        try {
            // Pushing elements to the number stack
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);
            System.out.println("Stack.Stack after pushing 10, 20, 30: " + numberStack.list());

            // Peeking the top element
            System.out.println("Peek top element: " + numberStack.peek()); // Expected: 30

            // Popping elements from the stack
            System.out.println("Pop element: " + numberStack.pop()); // Expected: 30
            System.out.println("Stack.Stack after popping: " + numberStack.list());

            // Pushing more elements to check stack size handling
            numberStack.push(40);
            numberStack.push(50);
            numberStack.push(60); // This should throw a Stack.StackFullException
        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        // Test case 2: Test string stack
        System.out.println("\nTesting String Stack.Stack...");
        Stack<String> stringStack = new Stack<>(3); // Stack.Stack with capacity of 3

        try {
            // Pushing elements to the string stack
            stringStack.push("Hello");
            stringStack.push("World");
            stringStack.push("Java");
            System.out.println("Stack.Stack after pushing 'Hello', 'World', 'Java': " + stringStack.list());

            // Peeking the top element
            System.out.println("Peek top element: " + stringStack.peek()); // Expected: Java

            // Popping elements from the stack
            System.out.println("Pop element: " + stringStack.pop()); // Expected: Java
            System.out.println("Stack.Stack after popping: " + stringStack.list());

            // Trying to pop from an empty stack
            System.out.println("Pop element: " + stringStack.pop()); // Expected: World
            System.out.println("Pop element: " + stringStack.pop()); // Expected: Hello
            System.out.println("Pop element: " + stringStack.pop()); // This should throw a Stack.StackEmptyException
        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
