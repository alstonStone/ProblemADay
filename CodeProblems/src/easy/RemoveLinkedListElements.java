package easy;

import java.util.ArrayList;
import java.util.Objects;

import dataStructures.ListNode;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
    
    ListNode current = head;
    ArrayList<Integer> values = new ArrayList<Integer>();

    while(Objects.nonNull(current)){

        if(current.val != val){
            values.add(current.val);
        }
        current = current.next;
    }
    if(values.size() == 0){
        return null;
    }

    for(int i = 0; i < values.size(); i++){
        if(i == 0){
            current = new ListNode(values.get(i));
            head = current;
        }else{
            current.next = new ListNode(values.get(i));
            current = current.next;
        }
    }
    return head;
    
    }
}