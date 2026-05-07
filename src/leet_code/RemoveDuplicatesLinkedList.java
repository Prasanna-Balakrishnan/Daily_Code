package leet_code;

import java.util.Scanner;

class ListNodeNew {
    int val;
    ListNodeNew next;

    ListNodeNew(int val) {
        this.val = val;
    }
}

public class RemoveDuplicatesLinkedList {
    public static ListNodeNew deleteDuplicates(ListNodeNew head) {
        ListNodeNew current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    public static void display(ListNodeNew head) {
        ListNodeNew temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Enter sorted elements: ");
        ListNodeNew head = new ListNodeNew(sc.nextInt());
        ListNodeNew temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new ListNodeNew(sc.nextInt());
            temp = temp.next;
        }
        head = deleteDuplicates(head);
        System.out.print("After removing duplicates: ");
        display(head);
    }
}