
// Linked List:  Create, Insert Data, View the List


public class linkedList {
    static class Node {
        int data;  // Data Value
        Node next; // Address

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List Class
    static class LinkedList {
        Node head;

        // Inserts a new Node at the beginning
        void push(int new_data) {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }

        // Prints the Linked List
        void printList() {
            Node tnode = head;
            while (tnode != null) {
                System.out.print(tnode.data + " ");
                tnode = tnode.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        // Insert 6. So linked list becomes 6->NULL
        llist.push(6);

        // Insert 7 at the beginning. So linked list becomes 7->6->NULL
        llist.push(7);

        // Insert 1 at the beginning. So linked list becomes 1->7->6->NULL
        llist.push(1);

        // Insert 4 at the end. So linked list becomes 1->7->6->4->NULL
        llist.push(4);

        // Insert 8, after 7. So linked list becomes 1->7->8->6->4->NULL
        llist.push(8);

        System.out.println("Created Linked list is: ");
        llist.printList();
    }

}
