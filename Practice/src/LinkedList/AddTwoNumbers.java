package LinkedList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode current, head = new ListNode(0);
        current = head;
        int carry = 0, x, y, val;
        while(l1 != null || l2 != null || carry != 0){
            x = l1 != null ? l1.val : 0;
            y = l2 != null ? l2.val : 0;
            val = x + y + carry;
            if(val > 9){
                carry = 1;
                val -= 10;
            }
            else
                carry = 0;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
            current.val = val;
            if(l1 != null || l2 != null || carry != 0){
                current.next = new ListNode(0);
                current = current.next;
            }
        }
        return head;
    }
}
