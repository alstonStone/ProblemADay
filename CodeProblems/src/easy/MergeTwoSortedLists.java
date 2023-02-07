package easy;
import java.util.Objects;

import dataStructures.ListNode;
public class MergeTwoSortedLists {



    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode currentNode1 = list1;
        ListNode currentNode2 = list2;
        ListNode answer;
        ListNode currentAnswer;


        if(Objects.isNull(list1)){
            return list2;
        }
        if(Objects.isNull(list2)){
            return list1;
        }

        if(currentNode1.val < currentNode2.val){
            currentAnswer = currentNode1;
            answer = currentAnswer;
            currentNode1 = currentNode1.next;
        }else{
            currentAnswer = currentNode2;
            answer = currentAnswer;
            currentNode2 = currentNode2.next;
        }

        while(Objects.nonNull(currentNode1) && Objects.nonNull(currentNode2)){
            if(currentNode1.val < currentNode2.val){
                currentAnswer.next = currentNode1;
                currentAnswer = currentAnswer.next;
                currentNode1 = currentNode1.next;

            }else{
                currentAnswer.next = currentNode2;
                currentAnswer = currentAnswer.next;
                currentNode2 = currentNode2.next;
            }
        }
        if(Objects.isNull(currentNode1) && Objects.isNull(currentNode2)){
            return answer;

        }else if(Objects.isNull(currentNode1) && Objects.nonNull(currentNode2)){
            currentAnswer.next = currentNode2;
            return answer;
        }else if (Objects.nonNull(currentNode1) && Objects.isNull(currentNode2)){
            currentAnswer.next = currentNode1;
            return answer;
        }
        
        


        return answer;
    }

}