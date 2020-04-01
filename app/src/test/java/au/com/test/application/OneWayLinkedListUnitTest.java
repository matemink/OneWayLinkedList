package au.com.test.application;

import org.junit.Test;

import java.util.ArrayList;

public class OneWayLinkedListUnitTest {
    @Test
    public void run() {
        OneWayLinkedList linkedlist = createAndPrepopulateLinkedList();
        ArrayList<OneWayLinkedList> oneWayLinkedLists = linkedlist.split();
        OneWayLinkedList oneWayLinkedListWithEven = oneWayLinkedLists.get(0);
        oneWayLinkedListWithEven.reverse();
        OneWayLinkedList oneWayLinkedListWithOdd = oneWayLinkedLists.get(1);
        oneWayLinkedListWithOdd.reverse();
        System.out.println(oneWayLinkedListWithEven);
        System.out.println(oneWayLinkedListWithOdd);
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