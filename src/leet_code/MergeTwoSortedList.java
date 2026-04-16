package leet_code;
import java.util.*;
class ListNode{
	int val;
	ListNode next;
	ListNode(){
		
	}
	ListNode(int val){
		this.val=val;
	}
	ListNode(int val,ListNode next){
		this.next=next;
		this.val=val;
		
	}
}

class FindSolution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
        	return list2;
        	
        }
        if(list2 == null) {
        	return list1;
        }
        if(list1.val < list2.val) {
        	list1.next= mergeTwoLists(list1.next,list2);
        	return list1;
        }
        else {
        	list2.next =  mergeTwoLists(list1,list2.next);
        	return list2;
        }
    }
}
public class MergeTwoSortedList {
	public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        FindSolution sol = new  FindSolution();
        ListNode result = sol.mergeTwoLists(list1, list2);

        printList(result);
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
		
	}

