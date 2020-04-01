package au.com.test.application;

import org.junit.Test;

import java.util.ArrayList;

public class OneWayLinkedListUnitTest {
    @Test
    public void run() {
        OneWayLinkedList linkedlist = createAndPrepopulateLinkedList();
        ArrayList<OneWayLinkedList> oneWayLinkedLists = create(linkedlist);
        OneWayLinkedList oneWayLinkedListWithEven = oneWayLinkedLists.get(0);
        OneWayLinkedList oneWayLinkedListWithOdd = oneWayLinkedLists.get(1);
        System.out.println(oneWayLinkedListWithEven);
        System.out.println(oneWayLinkedListWithOdd);
    }

    private ArrayList<OneWayLinkedList> create(OneWayLinkedList linkedlist) {
        linkedlist.reverse();
        return linkedlist.split();
    }

    private static OneWayLinkedList createAndPrepopulateLinkedList() {
        OneWayLinkedList linkedlist = new OneWayLinkedList();
        linkedlist.insert(1);
        linkedlist.insert(2);
        linkedlist.insert(3);
        linkedlist.insert(4);
        linkedlist.insert(5);
        linkedlist.insert(6);
        linkedlist.insert(7);
        linkedlist.insert(8);
        linkedlist.insert(9);
        linkedlist.insert(10);
        return linkedlist;
    }
}