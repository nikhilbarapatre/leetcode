package Array;

import java.util.*;

public class TwoSum {
    public int[] twoSum1(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{0, 0};
    }

    public int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        TwoSum two = new TwoSum();
        int[] result = two.twoSum2(new int[]{2,7,11,15}, 9);
        for(int n : result)
            System.out.println(n);
    }
}
