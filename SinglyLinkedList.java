public class SinglyLinkedList<T> {
    private SLNode<T> head;

    //  creates an empty linked list
    public SinglyLinkedList() {
        head = null;
    }
    public void listAdd(T data) {
        SLNode<T> newNode = new SLNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            SLNode<T> current = head;
            // goes through the list to find the last node
            while (current.next != null) {
                current = current.next;
            }
            // Adds the new node to the end of the list
            current.next = newNode;
        }
    }

    // removes the item at the specified position from the list
    public void listRemove(int pos) {
        if (head == null || pos < 0) {
            return;
        }
        if (pos == 0) {
            // Remove the first node
            head = head.next;
            return;
        }
        SLNode<T> current = head;
        // goes through the list
        for (int i = 0; i < pos - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next != null) {
            // Updates the pointer to remove the node
            current.next = current.next.next;
        }
    }
    public String toString() {
        if (head == null) {
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        SLNode<T> current = head;
        while (current != null) {
            sb.append(current.data).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}

