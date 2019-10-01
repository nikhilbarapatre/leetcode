package Trees;

public class MaximumBinaryTree {
    public TreeNode constructMaxBTree(int[] nums){
        return construct(nums, 0, nums.length);
    }
    private TreeNode construct(int[] nums, int left, int right){
        if(left == right)
            return null;
        int max = getMax(nums, left, right);
        TreeNode root = new TreeNode(nums[max]);
        root.left = construct(nums, left, max);
        root.right = construct(nums, max + 1, right);
        return root;
    }
    private int getMax(int[] nums, int left, int right){
        int maxIndex = left;
        for(int i = left; i < right; i++){
            if(nums[maxIndex] < nums[i])
                maxIndex = i;
        }
        return maxIndex;
    }
}
