package Heap;

import java.util.*;

public class MergeKSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<ListNode> queue = new PriorityQueue<>((l1, l2) -> l1.val - l2.val);
        for(ListNode list : lists){
            if(list != null)
                queue.add(list);
        }
        ListNode node = new ListNode(0), temp = node;
        while(!queue.isEmpty()){
            temp.next = queue.poll();
            temp = temp.next;
            if(temp.next != null)
                queue.add(temp.next);
        }
        return node.next;
    }
}
