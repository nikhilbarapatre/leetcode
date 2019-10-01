package Design;


import java.util.Arrays;

public class MyHashMap {
    int[] map;
    ListNode[] nodes = new ListNode[1000000];
    /** Initialize your data structure here. */
    public MyHashMap() {
        map = new int[10000001];
        Arrays.fill(map, -1);
    }

    private class ListNode{
        int key, value;
        ListNode next;

        public ListNode(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    /*
    * In order to find indexes, we need a method.
    * */

    private int getIndex(int key){
        return Integer.hashCode(key) % nodes.length;
    }

    /*
    * HashMap has O(1) complexity when it comes to searching.
    * Therefore we need a method that returns an element given an index and a key.
    * */

    private ListNode findElement(int index, int key){
        if(nodes[index] == null)
            return nodes[index] = new ListNode(-1, -1);
        ListNode prev = nodes[index];
        while(prev.next != null && prev.next.key != key)
            prev = prev.next;
        return prev;
    }

    /*
    * Now, for all the methods for the HashMap, we will use the following steps:-
    *   - get the index using the key,
    *   - get the element using the index and the key.
    * */

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = getIndex(key);
        ListNode prev = findElement(index, key);
        if(prev.next != null)
            prev.next.value = value;
        else
            prev.next = new ListNode(key, value);
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = getIndex(key);
        ListNode prev = findElement(index, key);
        if(prev.next != null)
            return prev.next.value;
        else
            return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = getIndex(key);
        ListNode prev = findElement(index, key);
        if(prev.next != null)
            prev.next = prev.next.next;
    }
}
