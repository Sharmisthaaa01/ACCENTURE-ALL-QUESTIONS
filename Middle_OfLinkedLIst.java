
/*
  find the middle of the linkedlist
 */

package Easyprb;
class LinkedList {
    // Node class representing each node of the linked list
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to find the middle of the linked list
    public static Node findMiddle(Node head) {
        // Edge case: if the list is empty
        if (head == null) {
            return null;
        }

        Node slow = head; // Slow pointer (moves one step)
        Node fast = head; // Fast pointer (moves two steps)

        // Move slow by one step and fast by two steps until fast reaches the end
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow one step
            fast = fast.next.next; // Move fast two steps
        }

        // When fast reaches the end, slow will be at the middle
        return slow;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Print the linked list
        System.out.println("Linked List: ");
        printList(head);

        // Find and print the middle node
        Node middle = findMiddle(head);
        if (middle != null) {
            System.out.println("Middle of the linked list is: " + middle.data);
        } else {
            System.out.println("The linked list is empty.");
        }
    }
}

