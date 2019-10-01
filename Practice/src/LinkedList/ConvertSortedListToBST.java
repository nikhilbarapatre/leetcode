package LinkedList;

public class ConvertSortedListToBST {
    public TreeNode convertToBST(ListNode head){
        if(head == null)
            return null;
        return toBST(head, null);
    }
    private TreeNode toBST(ListNode head, ListNode tail){
        ListNode fast = head, slow = head;
        if(head == tail)
            return null;
        while(fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode result = new TreeNode(slow.val);
        result.left = toBST(head, slow);
        result.right = toBST(slow.next, tail);
        return result;
    }
}
