package easy;
import java.util.Objects;

import dataStructures.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MiddleOfTheLinkedList {
    public ListNode middleOfTheLinkedList(ListNode head) {
        int middleIndex = getLinkedListSize(head) / 2;
        return getValueAtIndexInLinkedList(middleIndex, head);
    }

    public static int getLinkedListSize(ListNode head){
        int count = 0;
        while(Objects.nonNull(head)){
            count++;
            head = head.next;
        }
        return count;
    }

    public static ListNode getValueAtIndexInLinkedList(int index, ListNode head){
        int value;
        for(int i=0; i<index; i++){
            head = head.next;
        }
        return head;
    }
}
