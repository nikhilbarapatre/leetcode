package Trees;

public class MinDifferenceInBST {
    int min = Integer.MAX_VALUE;
    TreeNode prev;
    public int minDiffInBST(TreeNode root){
        if(root == null)
            return 0;
        minDiffInBST(root.left);
        if(prev != null)
            min = Math.min(min, root.val - prev.val);
        prev = root;
        minDiffInBST(root.right);
        return min;
    }
}
