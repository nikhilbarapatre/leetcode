package Array;

import java.util.Arrays;

public class MeetingRooms {
    public boolean canAttendMeeting(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        for (int i = 0; i < intervals.length - 1; i++)
            if (intervals[i][1] > intervals[i + 1][0])
                return false;
        return true;
    }

    public static void main(String[] args) {
        MeetingRooms canAttend = new MeetingRooms();
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(canAttend.canAttendMeeting(intervals));
    }
}
