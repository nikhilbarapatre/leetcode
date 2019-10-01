package Array;

import java.util.*;
public class FindAllNumDisappearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int n = Math.abs(nums[i]) - 1;
            if(nums[n] > 0)
                nums[n] = -nums[n];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                result.add(i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        FindAllNumDisappearedInArray find = new FindAllNumDisappearedInArray();
        List<Integer> result = find.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        for(int n : result)
            System.out.print(n + " ");
        System.out.println();
    }
}
