package Trees;

public class RangeSumBST {
    int result;
    public int rangeSum(TreeNode root, int L, int R){
        result = 0;
        dfs(root, L, R);
        return result;
    }
    private void dfs(TreeNode root, int L, int R){
        if(root == null)
            return;
        if(L <= root.val && R >= root.val)
            result += root.val;
        if(L < root.val)
            dfs(root.left, L, R);
        if(R > root.val)
            dfs(root.right, L, R);
    }
}
