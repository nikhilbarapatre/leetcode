package DFS;

public class SumOfRootToLeafBinary {
    int result = 0;
    public int sumRootToLeaf(TreeNode root){
        dfs(root, 0);
        return result;
    }
    private void dfs(TreeNode root, int val){
        if(root == null)
            return;
        val = val << 1 | root.val;  //Bitwise OR operation.
        if(root.left == null && root.right == null)
            result += val;
        dfs(root.left, val);
        dfs(root.right, val);
    }
}
