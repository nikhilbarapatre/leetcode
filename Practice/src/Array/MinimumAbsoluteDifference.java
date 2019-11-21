package Array;

import java.util.*;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minAbsDiff(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 1; i++){
            int diff = arr[i + 1] - arr[i];
            if(diff < min){
                min = diff;
                result = new ArrayList<>();
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
            else if(diff == min)
                result.add(Arrays.asList(arr[i], arr[i + 1]));
        }
        return result;
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifference minDiff = new MinimumAbsoluteDifference();
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> result = minDiff.minAbsDiff(arr);
        for(List list : result){
            for(int i = 0; i < list.size(); i++)
                System.out.print(list.get(i) + ", ");
            System.out.println();
        }
    }
}
