// Represents an array-based list that stores Book instances.
public class AList {
    private Book[] array;
    private int size; // Current size of the list
    private static final int DEFAULT_CAPACITY = 10;
    public AList() {
        array = new Book[DEFAULT_CAPACITY];
        size = 0;
    }

    // Adds a book to the end of the list. Resizes the array if necessary.
    public void listAdd(Book book) {
        ensureCapacity();  // makes sure that the array has enough space
        array[size] = book;
        size++;  // Increment the size adding a new book
    }

    // Removes the book at the specified index from the list.
    public void listRemove(int index) {
        // Check if index is valid
        if (index < 0 || index >= size) {
            return; // Exit method if index is out of bounds
        }

        // Create a new array to hold elements after removal
        Book[] newArray = new Book[array.length - 1];
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (i != index) {
                newArray[newIndex++] = array[i];
            }
        }
        array = newArray;
        size--;
    }

    // Ensures that the array has enough space. Resizes the array if necessary.
    private void ensureCapacity() {
        if (size == array.length) {
            Book[] newArray = new Book[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    // Returns a string representation of the list. Each element is printed on a new line.
    public String toString() {
        if (size == 0) return "Empty List";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++)
            sb.append(array[i]).append("\n");
        return sb.toString();
    }
}
