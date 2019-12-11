package Heap;

import java.util.*;

public class TopKFrequentWords {
    public List<String> topKFrequentWords(String[] words, int k){
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(String str : words)
            map.put(str, map.getOrDefault(str, 0) + 1);
        PriorityQueue<String> queue = new PriorityQueue<>((w1, w2) -> map.get(w1) == map.get(w2) ?
                w2.compareTo(w1) : map.get(w1) - map.get(w2));
        for(String str : map.keySet()) {
            queue.offer(str);
            if (queue.size() > k)
                queue.poll();
        }
        while(!queue.isEmpty())
            result.add(queue.remove());
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        TopKFrequentWords top = new TopKFrequentWords();
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        List<String> result = top.topKFrequentWords(words, 2);
        for(String str : result)
            System.out.println(str);
    }
}
