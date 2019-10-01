package LinkedList;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthNode(ListNode head, int n){
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode first = result, second = result;
        for(int i = 1; i <= n + 1; i++)
            first = first.next;
        while(first != null){
            first = first.next;
            second = second.next;
        }
        return result.next;
    }
}
