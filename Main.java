public class Main {
    public static void main(String[] args) {
        // Creating instances of Book class
        Book book1 = new Book("Jujutsu Kaisen", "Gege Akutami", 15.99);
        Book book2 = new Book("One Piece", "Eiichiro Oda", 12.49);
        Book book3 = new Book("Naruto", "Masashi Kishimoto", 18.99);

        // Creating an AList of Book objects
        AList aList = new AList();
        aList.listAdd(book1);
        aList.listAdd(book2);
        aList.listAdd(book3);

        // Printing AList of Book objects
        System.out.println("AList of Books:");
        System.out.println(aList);

        // Removing a book from AList
        aList.listRemove(1);

        // Printing AList after removal
        System.out.println("\nAList after removing book at index 1:");
        System.out.println(aList);

        // Creating a DLList of Book objects
        DLList<Book> dlList = new DLList<>();
        dlList.listAdd(book1);
        dlList.listAdd(book2);
        dlList.listAdd(book3);

        // Printing DLList of Book objects
        System.out.println("\nDLList of Books:");
        System.out.println(dlList);

        // Removing a book from DLList
        dlList.listRemove(1);

        // Printing DLList after removal
        System.out.println("\nDLList after removing book at index 1:");
        System.out.println(dlList);

        // Creating a SinglyLinkedList of Book objects
        SinglyLinkedList<Book> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.listAdd(book1);
        singlyLinkedList.listAdd(book2);
        singlyLinkedList.listAdd(book3);

        // Printing SinglyLinkedList of Book objects
        System.out.println("\nSinglyLinkedList of Books:");
        System.out.println(singlyLinkedList);

        // Removing a book from SinglyLinkedList
        singlyLinkedList.listRemove(1);

        // Printing SinglyLinkedList after removal
        System.out.println("\nSinglyLinkedList after removing book at index 1:");
        System.out.println(singlyLinkedList);
    }
}

