package Array;

import java.util.*;

public class SubarraySumK {

    //O(n*2)
//    public int subarraySum(int[] nums, int k){
//        int result = 0;
//        for(int i = 0; i < nums.length; i++){
//            int sum = 0;
//            for(int j = i; j < nums.length; j++){
//                sum += nums[j];
//                if(sum == k)
//                    result++;
//            }
//        }
//        return result;
//    }

    //O(n) with a HashMap

    public int subarraySum(int[] nums, int k){
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0;i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySumK sub = new SubarraySumK();
        int[] nums = {1, 1, 1};
        int result = sub.subarraySum(nums, 2);
        System.out.println(result);
    }
}
