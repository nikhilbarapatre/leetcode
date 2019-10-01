package LinkedList;

public class IntersectionOfLinkedList {
    public ListNode intersection(ListNode headA, ListNode headB){
        if(headA == null || headB == null)
            return null;
        ListNode currA = headA, currB = headB;
        while(currA != currB){
            currA = currA == null ? headB : currA.next;
            currB = currB == null ? headA : currB.next;
        }
        return currA;
    }
}
