package Heap;

import java.util.PriorityQueue;


/*
* We add elements to a priority queue. while adding we check if the size is greater than k
* Since, priority queue works on the property of heap.
* Also, we check if the last element in the queue is less than the number to be added,
* if yes, we remove that element and then add the number under consideration.
* This ensures that whenever we get the last element in the queue, it will be the largest.
* */


public class KthLargestInAStream {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargestInAStream(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for(int n : nums)
            add(n);
    }

    public int add(int val) {
        if(pq.size() < k)
            pq.offer(val);
        else if(pq.peek() < val){
            pq.poll();
            pq.offer(val);
        }
        return pq.peek();
    }

}


