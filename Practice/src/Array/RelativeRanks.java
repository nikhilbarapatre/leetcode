package Array;

/*
* This is a mixture of String and arrays.
* */

import java.util.*;

public class RelativeRanks {
    public String[] relativeRanks(int[] nums){
        int length = nums.length;
        int[] temp = new int[length];
        for(int i = 0; i < length; i++)
            temp[i] = nums[i];
        Arrays.sort(temp);
        Map<Integer, String> map = new HashMap<>();
        for(int i = length - 1; i >= 0; i--){
            if(i == length - 1)
                map.put(temp[i], "Gold Medal");
            else if(i == length - 2)
                map.put(temp[i], "Silver Medal");
            else if(i == length - 3)
                map.put(temp[i], "Bronze Medal");
            else
                map.put(temp[i], Integer.toString(length - i));
        }
        String[] result = new String[length];
        for(int i = 0; i < length; i++)
            result[i] = map.get(nums[i]);
        return result;
    }

    public static void main(String[] args) {
        RelativeRanks rel = new RelativeRanks();
        String[] result = rel.relativeRanks(new int[]{23,1,54,2,3,43});
        for(int i = 0; i < result.length; i++)
            System.out.print(result[i] + ", ");
    }
}
