public class DLList<T> {
    private DLNode<T> head;
    public DLList() {
        head = null;
    }

    // Method to add a new node with the given data to the end of the list
    public void listAdd(T data) {
        DLNode<T> newNode = new DLNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            DLNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Add the new node to the end of the list
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method to remove the item at the specified position from the list
    public void listRemove(int pos) {
        if (head == null || pos < 0) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        DLNode<T> current = head;
        for (int i = 0; i < pos && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            return;
        }
        // Update the pointers to remove the node
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }
    public String toString() {
        if (head == null) {
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        DLNode<T> current = head;
        // Traverse the list and append each node's data to the string
        while (current != null) {
            sb.append(current.data).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}

