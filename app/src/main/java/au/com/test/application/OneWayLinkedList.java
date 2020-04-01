package au.com.test.application;

import androidx.annotation.NonNull;

import java.util.ArrayList;

class OneWayLinkedList {
    private Node head;

    void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }

    private Node tail() {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    void reverse() {
        Node current = head;
        Node previous = null;
        Node forward;

        while (current.next != null) {
            forward = current.next;

            current.next = previous;
            previous = current;

            current = forward;
        }
        head = current;
        head.next = previous;
    }

    ArrayList<OneWayLinkedList> split() {
        Node current = head;
        Node previous = null;
        Node forward;

        OneWayLinkedList linkedlist1 = new OneWayLinkedList();
        OneWayLinkedList linkedlist2 = new OneWayLinkedList();

        while (current.next != null) {
            if (current.next.data % 2 == 0) {
                linkedlist1.insert(current.next.data);
            } else {
                linkedlist2.insert(current.next.data);
            }
            forward = current.next;

            current.next = previous;
            previous = current;

            current = forward;
        }
        head = current;
        ArrayList<OneWayLinkedList> sdft = new ArrayList<>();
        sdft.add(linkedlist1);
        sdft.add(linkedlist2);
        return sdft;
    }

    private static class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }

        @NonNull
        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current).append("->");
            current = current.next;
        }
        return sb.toString();
    }
}