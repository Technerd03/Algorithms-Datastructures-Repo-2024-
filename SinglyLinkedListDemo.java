class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // delete a node with a given value
    public void deleteNode(int key) {
        // 0. If the linked list doesn't exist
        if (head == null) {
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }

        // 1. If deleting at the beginning
        if (head.data == key) {
            head = head.next; // Move head to the next node
            System.out.println("Deleted node with value: " + key);
            return;
        }

        // Initialize current and previous pointers
        Node current = head;
        Node previous = null;

        // 2. Traverse to find the node to delete
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        // 3. If the node was not found
        if (current == null) {
            System.out.println("Node with value " + key + " not found.");
            return;
        }

        // 4. If deleting anywhere in the list (middle or end)
        previous.next = current.next;
        System.out.println("Deleted node with value: " + key);
    }

    //insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Initial List:");
        list.printList();

        list.deleteNode(1); // Deleting a node the beginning
        System.out.println("After deleting 1:");
        list.printList();

        list.deleteNode(4); // Deleting a node at the end
        System.out.println("After deleting 4:");
        list.printList();

        list.deleteNode(2); // Deleting a node from the middle
        System.out.println("After deleting 2:");
        list.printList();

        list.deleteNode(5); // delete a non-existent node
    }
}
