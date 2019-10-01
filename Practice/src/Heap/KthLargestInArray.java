package Heap;

import java.util.PriorityQueue;

public class KthLargestInArray {
    public int kthLargest(int[] nums, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num : nums){
            queue.add(num);
            if(queue.size() > k)
                queue.poll();
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        KthLargestInArray k = new KthLargestInArray();
        int[] nums = {3,2,1,5,6,4};
        System.out.println(k.kthLargest(nums, 2));
    }
}
