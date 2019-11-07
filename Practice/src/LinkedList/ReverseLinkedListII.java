package LinkedList;

public class ReverseLinkedListII {
    public ListNode reverseLinkedList2(ListNode head, int m, int n){
        if(head == null)
            return null;
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode prev = result;
        for(int i = 0; i < m - 1; i++)
            prev = prev.next;
        ListNode start = prev.next, then = start.next;
        for(int i = 0; i < n - m; i++){
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
        return result.next;
    }
}
