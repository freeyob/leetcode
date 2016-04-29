package leetcode;

import java.util.HashSet;

public class IntersectionNode {
	public  ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet set = new HashSet();

        while(headA != null || headB != null){
        	if(headA != null){
        		if(set.contains(headA)){
            		return headA;
            	}else{
            		set.add(headA);
            	}
        		headA = headA.next;
        	}
        	if(headB !=null){
        		if(set.contains(headB)){
            		return headB;
            	}else{
            		set.add(headB);
            	}
        		headB = headB.next;
        	}
        }
        return null;
    }
}

/**
 * Definition for singly-linked list.*/
   class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 


