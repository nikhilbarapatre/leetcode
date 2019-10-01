package Heap;

import java.util.*;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((n1, n2) -> map.get(n1) - map.get(n2));
        for(int n : map.keySet()){
            queue.add(n);
            if(queue.size() > k)
                queue.poll();
        }
        while(!queue.isEmpty())
            result.add(queue.remove());
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        TopKFrequentElements top = new TopKFrequentElements();
        int[] nums = {1,1,1,2,2,3};
        List<Integer> result = top.topKFrequent(nums, 2);
        for(int i = 0; i < result.size(); i++)
            System.out.print(result.get(i) + " ");
    }
}
