package Array;

import java.util.*;

public class KDiffPairs {
    public int findPairs(int[] nums, int k){
        if(k < 0)
            return 0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set1.contains(nums[i] - k))
                set2.add(nums[i] - k);
            if(set1.contains(nums[i] + k))
                set2.add(nums[i]);
            set1.add(nums[i]);
        }
        return set2.size();
    }

    public static void main(String[] args) {
        KDiffPairs kd = new KDiffPairs();
        int result = kd.findPairs(new int[]{1, 2, 3, 4, 5}, 1);
        System.out.println(result);
    }
}
