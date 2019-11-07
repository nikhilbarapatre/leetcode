package Trees;

public class MaxDiffBetweenNodeAndAncestor {
    int result = 0;
    public int maxAncestorDiff(TreeNode root){
        helper(root, root.val, root.val);
        return result;
    }
    private void helper(TreeNode root, int min, int max){
        if(root != null){
            result = Math.min(result, Math.abs(min - root.val));
            result = Math.max(result, Math.abs(max - root.val));
            if(root.left != null)
                helper(root.left, Math.min(min, root.left.val), Math.max(max, root.left.val));
            if(root.right != null)
                helper(root.right, Math.min(min, root.right.val), Math.max(max, root.right.val));
        }
    }
}
