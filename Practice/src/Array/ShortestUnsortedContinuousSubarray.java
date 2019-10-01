package Array;

import java.util.Stack;

/**
 *
 * Here, we use stack to store the index. We have two pointers right and left to check for the start and end of the
 * subarray.
 */

public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int left = nums.length - 1, right = 0;
        for(int i = 0; i < nums.length; i++){
            while(!stack.isEmpty() && nums[stack.peek()] > nums[i])
                left = Math.min(stack.pop(), left);
            stack.push(i);
        }
        stack.clear();
        for(int i = nums.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i])
                right = Math.max(right, stack.pop());
            stack.push(i);
        }
        if(right - left > 0)
            return right - left + 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray sh = new ShortestUnsortedContinuousSubarray();
        int result = sh.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15});
        System.out.println(result);
    }
}
