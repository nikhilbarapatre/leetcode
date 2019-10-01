package LinkedList;

public class CopyListWithRandomPointer {
    class Node {
        public int val;
        public Node next;
        public Node random;

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _next,Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }
    public Node copyRandomList(Node head){
        if(head == null)
            return null;
        Node node = head, res;
        //First create a deep copy
        while(node != null){
            Node temp = new Node(node.val);
            temp.next = node.next;
            node.next = temp;
            node = temp.next;
        }
        node = head;
        //Now create the random pointers for the deep copy
        while(node != null){
           Node temp = node.next;
           if(node.random != null)
               temp.random = node.random.next;
           else
               temp.random = null;
           node = temp.next;
        }
        //Delete the old links and keep the new deep-copied links
        node = head;
        res = head.next;
        while(node != null){
            Node temp = node.next;
            node.next = temp.next;
            node = temp.next;
            if(temp.next != null)
                temp.next = temp.next.next;
        }
        return res;
    }
}
