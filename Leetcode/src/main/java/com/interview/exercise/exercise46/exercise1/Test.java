package com.interview.exercise.exercise46.exercise1;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Test {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Already sorted or empty list
        }

        ListNode sortedList = null; // The head of the sorted list
        ListNode current = head; // Pointer to iterate through the original list

        while (current != null) {
            ListNode next = current.next; // Store the next node before we modify the current node
            current.next = null; // Detach current node from the original list

            if (sortedList == null || current.val < sortedList.val) {
                // If the sorted list is empty or current node is smaller than the sorted list head
                current.next = sortedList;
                sortedList = current; // Update the sorted list head
            } else {
                // Find the correct position to insert current node in the sorted list
                ListNode temp = sortedList;
                while (temp.next != null && temp.next.val < current.val) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }

            current = next; // Move to the next unsorted node
        }

        return sortedList;
    }

    // Helper function to print a linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Test sorter = new Test();

        // Create a linked list
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println("Original List:");
        sorter.printList(head);

        // Sort the linked list using Insertion Sort
        ListNode sortedList = sorter.insertionSortList(head);

        System.out.println("Sorted List:");
        sorter.printList(sortedList);
    }
}

