package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms2 {
    public int minMeetingRooms(int[][] intervals){
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        PriorityQueue<int[]> allocator = new PriorityQueue<>((i1, i2) -> i1[1] - i2[1]);
        for(int[] interval : intervals){
            if(!allocator.isEmpty() && allocator.peek()[1] <= interval[0])
                allocator.poll();
            allocator.add(interval);
        }
        return allocator.size();
    }

    public static void main(String[] args) {
        MeetingRooms2 meet = new MeetingRooms2();
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(meet.minMeetingRooms(intervals));
    }
}
