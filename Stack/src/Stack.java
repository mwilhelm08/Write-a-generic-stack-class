/**
 * Exception thrown when trying to pop or peek from an empty stack.
 */
class StackEmptyException extends Exception {
    /**
     * Constructor to create a StackEmptyException with a custom message.
     *
     * @param message the detail message
     */
    public StackEmptyException(String message) {
        super(message);
    }
}

/**
 * Exception thrown when trying to push an element onto a full stack.
 */
class StackFullException extends Exception {
    /**
     * Constructor to create a StackFullException with a custom message.
     *
     * @param message the detail message
     */
    public StackFullException(String message) {
        super(message);
    }
}

/**
 * A generic Stack class that implements the Last-In-First-Out (LIFO) principle.
 * The stack stores elements in an array and supports basic operations such as push, pop, and peek.
 *
 * @param <T> the type of elements in this stack
 */
public class Stack<T> {
    private Object[] stackArray; // array to hold stack elements
    private int size; // current size of the stack
    private int top; // index of the top element

    /**
     * Default constructor that creates a stack with a capacity of 10.
     */
    public Stack() {
        this(10); // default stack size is 10
    }

    /**
     * Constructor to create a stack with the specified size.
     *
     * @param size the maximum capacity of the stack
     */
    public Stack(int size) {
        this.size = size;
        stackArray = new Object[size];
        top = -1; // stack is empty initially
    }

    /**
     * Pushes an element onto the stack.
     * If the stack is full, a StackFullException is thrown.
     *
     * @param element the element to be pushed onto the stack
     * @throws StackFullException if the stack is full
     */
    public void push(T element) throws StackFullException {
        if (top == size - 1) {
            throw new StackFullException("Stack is full, cannot push element.");
        }
        stackArray[++top] = element;
    }

    /**
     * Pops the top element from the stack and returns it.
     * If the stack is empty, a StackEmptyException is thrown.
     *
     * @return the top element from the stack
     * @throws StackEmptyException if the stack is empty
     */
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty, cannot pop element.");
        }
        T element = (T) stackArray[top]; // typecast to generic type
        stackArray[top--] = null; // clear the reference
        return element;
    }

    /**
     * Peeks at the top element of the stack without removing it.
     * If the stack is empty, a StackEmptyException is thrown.
     *
     * @return the top element of the stack
     * @throws StackEmptyException if the stack is empty
     */
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty, cannot peek element.");
        }
        return (T) stackArray[top]; // return the top element without removing it
    }

    /**
     * Returns a string representation of the stack with elements separated by a semicolon (;).
     * If the stack is empty, it returns "Stack is empty".
     *
     * @return a string representation of the stack
     */
    public String list() {
        if (top == -1) {
            return "Stack is empty";
        }
        StringBuilder stackContents = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            stackContents.append(stackArray[i]);
            if (i != top) {
                stackContents.append(";");
            }
        }
        return stackContents.toString();
    }
}
