package Trees;

public class MaxDepthOfBTree {
    public int maxDepth(TreeNode root){
        if(root != null){
            int right = maxDepth(root.right);
            int left = maxDepth(root.left);
            return Math.max(right, left) + 1;
        }
        return 0;
    }
}
