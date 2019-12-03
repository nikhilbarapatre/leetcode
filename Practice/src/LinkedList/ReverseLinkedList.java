package LinkedList;

public class ReverseLinkedList {
    public ListNode reverseListItr(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public ListNode reverseListRec(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode temp = reverseListRec(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

}
