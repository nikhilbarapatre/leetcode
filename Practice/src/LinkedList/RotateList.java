package LinkedList;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k){
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode old_tail = head;
        int n = 1;
        while(old_tail.next != null){
            old_tail = old_tail.next;
            n++;
        }
        old_tail.next = head;
        ListNode new_tail = head;
        for(int i = 0; i < n - k % n - 1; i++)
            new_tail = new_tail.next;
        ListNode new_head = new_tail.next;
        new_tail.next = null;
        return new_head;
    }
}
