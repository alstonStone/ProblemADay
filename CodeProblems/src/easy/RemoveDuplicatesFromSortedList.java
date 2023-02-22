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
class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(Objects.isNull(head)){
            return head;
        }
  
        ListNode next;
        ListNode last = head;


        if(Objects.nonNull(last.next)){
            next = last.next;
        }else{
            return head;              
        }

        while(true){

            if(next.val > last.val){
                last.next = next;
                last = next;
            }

            if(Objects.nonNull(next.next)){
                next = next.next;
            }else{
                last.next = null;
                break;              
            }

        }
       

        return head;

    }
}
