package Array;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int target = -nums[i];
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                if(nums[j] + nums[k] == target){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j - 1])j++;
                    while(j < k && nums[k] == nums[k + 1])k--;
                }
                else if(nums[j] + nums[k] > target)
                    k--;
                else
                    j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ThreeSum three = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = three.threeSum(nums);
        for(List list : result){
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.get(i) + ", ");
            }
            System.out.println();
        }
    }
}
