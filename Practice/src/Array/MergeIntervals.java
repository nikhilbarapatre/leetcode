package Array;

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals){
        if(intervals.length == 0)
            return intervals;
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));//Sort by the first value in the interval
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);
        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1])
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            else{
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        MergeIntervals merge = new MergeIntervals();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge.merge(intervals);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
