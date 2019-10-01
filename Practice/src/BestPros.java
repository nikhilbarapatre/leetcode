

import java.util.*;

public class BestPros {
    public List<Integer> bestPros(List<List<Integer>> pros, int k) {
        int maxDist = 0;

        for (List<Integer> pro : pros) {
            if (pro.get(0) > maxDist) {
                maxDist = pro.get(0);
            }
        }

        final int maxDist2 = maxDist;

        Queue<Integer> queue = new PriorityQueue<>((a, b) -> {
            List<Integer> aP = pros.get(a);
            List<Integer> bP = pros.get(b);

            int aR = (maxDist2 - aP.get(0)) * aP.get(1);
            int bR = (maxDist2 - bP.get(0)) * bP.get(1);

            return bR - aR;
        });

        for (int i = 0; i < pros.size(); i++) {
            queue.add(i);
        }

        List<Integer> result = new ArrayList<>();

        while (k > 0) {
            result.add(queue.poll());
            k--;
        }

        return result;
    }

    public static void main(String[] args) {
        BestPros best = new BestPros();
        List<List<Integer>> pros = new ArrayList<>();

        List<Integer> a1 = new ArrayList<>();
        a1.add(5);
        a1.add(4);
        pros.add(a1);

        List<Integer> a2 = new ArrayList<>();
        a2.add(4);
        a2.add(3);
        pros.add(a2);

        List<Integer> a3 = new ArrayList<>();
        a3.add(6);
        a3.add(5);
        pros.add(a3);

        List<Integer> a4 = new ArrayList<>();
        a4.add(3);
        a4.add(5);
        pros.add(a4);

        List<Integer> result = best.bestPros(pros, 2);
        for(Integer n : result)
            System.out.println(n);
    }
}
