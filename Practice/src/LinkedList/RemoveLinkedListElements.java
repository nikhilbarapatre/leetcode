package LinkedList;

/*
*
* Here, we recursively check if the value of the head is equal to the given 'val'.
* */

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val){
        if(head == null)
            return null;
        head.next = removeElements(head.next, val);
        if(head.val == val)
            return head.next;
        else
            return head;
    }
}
