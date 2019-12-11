import java.util.PriorityQueue;

public class MinimumCostToConnectSticks {
    public int connectSticks(int[] sticks){
        int result = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int st : sticks)
            queue.offer(st);
        while(queue.size() > 1){
            int temp = queue.poll() + queue.poll();
            result += temp;
            queue.offer(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        MinimumCostToConnectSticks connect = new MinimumCostToConnectSticks();
        int[] sticks = {2,4,3};
        System.out.println(connect.connectSticks(sticks));
    }
}
