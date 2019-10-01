package Backtracking;

import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start){
        result.add(new ArrayList<>(temp));
        for(int i = start; i < nums.length; i++){
            temp.add(nums[i]);
            backtrack(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Subsets sub = new Subsets();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = sub.subsets(nums);
        for (List l : result) {
            for (int i = 0; i < l.size(); i++)
                System.out.print("[" + l.get(i) + "]");
            System.out.println();

        }
    }
}
