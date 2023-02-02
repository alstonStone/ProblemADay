package medium;

import dataStructures.ListNode;


//You are given two non-empty linked lists representing two non-negative integers. 
//The digits are stored in reverse order, and each of their nodes contains a single digit.
//Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
public class AddTwoNumbers {
	
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	    	//reverse list one
	    	printList(l1);
	    	l1 = reverseList(l1);
	    	l2 = reverseList(l2);
	    	printList(l2);
	    	// reverse list two
	    	// add two lists
	    	return l1;
    	
	    }
	    
	    public ListNode reverseList(ListNode ln) {
	    	
	    	ListNode prev = null;
	    	ListNode current = ln;
	    	ListNode next;
	    	
	    	while(current != null) {
	    		next = current.next;
	    		current.next = prev;
	    		prev = current;
	    		current = next;
	    
	    	}
	    	ln = prev;
	    	return ln;
	    	
	    }
	    
//public ListNode addLists(ListNode l1, ListNode l2) {
//	    	
//	    	ListNode currentL1 = l1;
//	    	ListNode currentL2 = l2;
//	    	
//	    	ListNode answer = new ListNode();
//	    	ListNode answerCurrent = answer;
//	    	ListNode answerNext = null;
//	    	int carry = 0;
//	    	
//	    	while(currentL1 != null && currentL2 !=null) {
//	    		int sum = currentL1.val + currentL2.val;
//	    		if(carry > 0) {
//                    sum = sum + carry;
//                    carry = 0;
//	    		}	    		
//	    		if(sum >= 10) {
//	    			answerCurrent.val = sum - 10;
//	    			carry = 1;	    			
//	    		}else {
//	    			answerCurrent.val = sum;	
//	    		}
//                if(currentL1.next != null){
//                    answerNext = new ListNode();
//                    answerCurrent.next = answerNext;
//                    answerCurrent = answerNext;
//                }
//
//    			
//    			currentL1 = currentL1.next;
//    			currentL2 = currentL2.next;    		
//	    	}	    	
//	    	return answer;	  
//	    }
	    
// public ListNode addLists(ListNode l1, ListNode l2) {
//	    	
//	    	ListNode currentL1 = l1;
//	    	ListNode currentL2 = l2;
//	    	
//	    	ListNode answer = new ListNode();
//	    	ListNode answerCurrent = answer;
//	    	ListNode answerNext = null;
//
//	    	boolean carry = false;
//	    	
//	    	while(currentL1 != null && currentL2 != null) {
//
//	    		int sum = currentL1.val + currentL2.val;
//	    		if(carry) {
//	    			sum++;
//	    		}
//	    		if(sum >= 10) {
//	    			carry = true;
//	    			answerCurrent.val = 0;
//	    		}else {
//	    			answerCurrent.val = sum;
//	    		}
//	    	
//                answerNext = new ListNode();
//	    		
//	    		
//	    		currentL1 = currentL1.next;
//	    		currentL2 = currentL2.next;
//	    	}	    	
//	    	return answer;
//	    }
	    


	    void printList(ListNode node)
	    {
	        while (node != null) {
	            System.out.print(node.val + " ");
	            node = node.next;
	        }
	        System.out.println();
	    }
	    
	    
	

}
